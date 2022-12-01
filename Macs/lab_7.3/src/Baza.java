import java.util.Scanner;

public class Baza {
    Scanner scan = new Scanner(System.in);
    int lelem; // aktualna liczba elementow tablicy kol-vo
    int koniec; // indeks ostatniego elementu index
    int tabSize;

    Osoba[] osobaTab;
    public Baza(int size) { // Konstruktor
        System.out.println("Konstruktor baza, size: " + size);
        tabSize = size;
        osobaTab = new Osoba[size];
        lelem = osobaTab.length;
        koniec = lelem - 1;

        for (int i = 0; i < tabSize; i++) {
            osobaTab[i] = new Osoba();
        }
    }
    void dodaj() {
        // Dodaj nową osobę do bazy
        // Uzupełnić
        // Добавляем нового человека в базу
        // Пополнение

        //System.out.println("Добавление нового пользвователя");
        System.out.println("Pokaż nowy adres");
        for (int i = 0; i < tabSize; i++) {
            if (osobaTab[i].dajPesel() == -1)
            {
                //Name
                String imie;
                while (true) {
                    try {
                        System.out.print("Imie: ");
                        imie = scan.nextLine();
                        break;
                    } catch (Exception e) {
                        //System.out.println("Wrong input");
                        System.out.println("Niewłaściwe dane wejściowe");
                    }
                }
                //Last name
                String nazwisko;
                while (true) {
                    try {
                        System.out.print("nazwisko: ");
                        nazwisko = scan.nextLine();
                        break;
                    } catch (Exception e) {
                        //System.out.println("Wrong input");
                        System.out.println("Niewłaściwe dane wejściowe");
                    }
                }
                //Pesel
                int pesel;
                while (true) {
                    try {
                        System.out.print("pesel: ");
                        pesel = scan.nextInt();
                        scan.nextLine();
                        break;
                    } catch (Exception e) {
                        //System.out.println("Wrong input");
                        System.out.println("Niewłaściwe dane wejściowe");
                    }
                }

                osobaTab[i].wczytaj(imie, nazwisko, pesel);
                return;
            }
        }

        //System.out.printf("В базе нет свободного места");
        System.out.printf("Brak wolnego miejsca w bazie danych");
    }
    int szukaj(int pesel) {
        // Szukaj osoby o peselu pesel
        // Uzupełnić
        // Поиск человека с pesel pesel
        // Пополнение
        for (int i = 0; i < tabSize; i++) {
            if (osobaTab[i].dajPesel() == pesel) {
                //System.out.println("Особа найденна, вывод данных");
                System.out.println("Osoba znaleziona, dane wyjściowe");
                System.out.printf("Imie: %s\nNazwisko: %s\nPesel: %d\n", osobaTab[i].dajImie(), osobaTab[i].dajNazwisko(), osobaTab[i].dajPesel());
                return i;
            }
        }
        return -1;
    }
    void lista () {
        // Drukuj liste osob ----------------
        // Uzupełnić
        // Распечатать список людей ----------------
        // Пополнение


        int null_counter = 0;
        int person_counter = 0;
        for (int i = 0; i < tabSize; i++) {
            if (osobaTab[i].dajPesel() != -1) {
                //System.out.printf("\nОсоба №%d\n", (i+1));
                System.out.printf("\nOsoba №%d\n", (++person_counter));
                System.out.printf("Imie: %s\nNazwisko: %s\nPesel: %d\n", osobaTab[i].dajImie(), osobaTab[i].dajNazwisko(), osobaTab[i].dajPesel());
            }
            else {
                null_counter++;
            }
        }
        if (null_counter == tabSize) {
            //System.out.println("Нет пользователей, база данных пуста");
            System.out.println("Brak użytkowników, baza danych jest pusta");
        }
    }
    void usun(int pesel) {
        // Usuwamy osobe o peselu pesel
        // Убираем человека с pesel pesel
        for (int i = 0; i < tabSize; i++) {
            if (osobaTab[i].dajPesel() == pesel) {
                osobaTab[i].wczytaj("null", "null", -1);
                //System.out.println("Особа успешно удалена");
                System.out.println("Osoba usunięta pomyślnie");
            }
        }
    }
}