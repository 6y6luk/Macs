public class Osoba {
    private String imie ;     // Imie
    private String nazwisko ; // Nazwisko
    private long pesel ;       // Pesel
    
    public Osoba(String imie, String nazwisko, int pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public Osoba() {
        this.imie = "null";
        this.nazwisko = "null";
        this.pesel = -1;
    }

    public void wyswietl() {
        // Wyswietl imie nazwisko i pesel
        // Показать имя и фамилию
        System.out.printf("Imie: %s, Nazwisko: %s, Pesel: %d\n", imie, nazwisko, pesel);
    }

    public void wczytaj(String imie, String nazwisko, long pesel) {
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

    public long dajPesel() {
        return pesel;
    }
}
