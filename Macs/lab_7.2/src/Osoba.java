public class Osoba {
    public String imie ;     // Imie
    public String nazwisko ; // Nazwisko
    public int pesel ;       // Pesel

    Osoba(String imie, String nazwisko, int pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    Osoba() {
        imie = "null";
        nazwisko = "null";
        pesel = -1;
    }

    void wyswietl() {
        // Wyswietl imie nazwisko i pesel
        // Показать имя и фамилию
        System.out.printf("Imie: %s, Nazwisko: %s, Pesel: %d\n", imie, nazwisko, pesel);
    }

    void wczytaj(String imie, String nazwisko, int pesel) {
        // Wczytaj imie nazwisko i pesel
        // Загружаем имя и фамилию
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    void wczytaj() {
        // Wczytaj imie nazwisko i pesel
        // Загружаем имя и фамилию
        imie = "null";
        nazwisko = "null";
        pesel = -1;
    }

    String dajImie() {
        return imie;
    }

    String dajNazwisko() {
        return nazwisko;
    }

    int dajPesel() {
        return pesel;
    }
}
