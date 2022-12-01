import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class OsobaTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wybor, i;
        final int MaxTab = 3;

        String imie;
        String nazwisko;
        int pesel;

        // Utworzenie tablicy osób
        // Создаем массив людей
        Osoba[] osobaTab = new Osoba[MaxTab];
        // Wczytywanie osób --------
        // Загрузка людей --------
        for(i = 0; i < MaxTab; i++) {
            // Utworz osobaTab[i] i wprowadz dane
            // Создаем personTab[i] и вводим данные
            //System.out.printf("\nВвод данных пользователя номер %d\n", (i+1));
            //ystem.out.printf("\nNumer wprowadzony przez użytkownika %d\n", (i+1));

            // Enter name
            while (true) {
                try {
                    //System.out.print("Введите имя пользователя: ");
                    //System.out.print("Podaj imie użytkownika: ");
                    System.out.print("Imie: ");
                    imie = scanner.next();
                    break;
                }
                catch (Exception e) {
                    /*System.out.println("Вы введи неверный формат данных пользователя" +
                            "\nпопробуйте заново: ");*/
                    System.out.println("Wprowadziłeś nieprawidłowy format danych użytkownika" +
                            "\nspróbuj ponownie: ");
                }
            }

            // Enter last name
            while (true) {
                try {
                    //System.out.print("Введите фамилию пользователя: ");
                    //System.out.print("Wprowadź nazwisko użytkownika: ");
                    System.out.print("Nazwisko: ");
                    nazwisko = scanner.next();
                    break;
                }
                catch (Exception e) {
                    /*System.out.println("Вы введи неверный формат данных пользователя" +
                            "\nпопробуйте заново: ");*/
                    System.out.println("Wprowadziłeś nieprawidłowy format danych użytkownika" +
                            "\nspróbuj ponownie: ");
                }
            }

            // Enter pesel
            while (true) {
                try {
                    //System.out.print("Введите pesel пользователя: ");
                    //System.out.print("Podaj pesel użytkownika: ");
                    System.out.print("Pesel: ");
                    pesel = scanner.nextInt();
                    scanner.nextLine();
                    break;
                }
                catch (Exception e) {
                    /*System.out.println("Вы введи неверный формат данных пользователя" +
                            "\nпопробуйте заново: ");*/
                    System.out.println("Wprowadziłeś nieprawidłowy format danych użytkownika" +
                            "\nspróbuj ponownie: ");
                }
            }

            osobaTab[i] = new Osoba();
            osobaTab[i].wczytaj(imie, nazwisko, pesel);

        }

        // Wypisywanie osób --------
        // Написать людей --------
        //System.out.println("\nВывод базы данных");
        //System.out.println("\nWyjściowa baza danych");
        for(i = 0 ; i < MaxTab ; i++) {
            // Wypisz osobaTab[i]
            // Печатаем personTab[i]
            System.out.printf("%s %s %d\n", osobaTab[i].dajImie(), osobaTab[i].dajNazwisko(), osobaTab[i].dajPesel());
        }
    }
}