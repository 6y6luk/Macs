public class Osoba {
    public String imie ;     // Imie
    public String nazwisko ; // Nazwisko
    public int pesel ;       // Pesel

    public Osoba(String imie, String nazwisko, int pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public Osoba() {
        imie = "null";
        nazwisko = "null";
        pesel = -1;
    }

    public void wyswietl() {
        // Wyswietl imie nazwisko i pesel
        // Показать имя и фамилию
        System.out.printf("Imie: %s, Nazwisko: %s, Pesel: %d\n", imie, nazwisko, pesel);
    }

    public void wczytaj(String imie, String nazwisko, int pesel) {
        // Wczytaj imie nazwisko i pesel
        // Загружаем имя и фамилию
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public void wczytaj() {
        // Wczytaj imie nazwisko i pesel
        // Загружаем имя и фамилию
        imie = "null";
        nazwisko = "null";
        pesel = -1;
    }

    public String dajImie() {
        return imie;
    }

    public String dajNazwisko() {
        return nazwisko;
    }

    public int dajPesel() {
        return pesel;
    }
}
