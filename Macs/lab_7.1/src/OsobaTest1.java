class OsobaTest1 {
    public static void main(String[] args) { // Program testowy
        int pesel;
        //int wybor;
        String nazwisko;
        String imie;

        // Tworzenie obiektów ----------
        Osoba osoba1 = new Osoba();
        Osoba osoba2 = new Osoba("Jan","Braun",1);
        osoba2.wyswietl();
        osoba1.wyswietl();

        // Wczytywanie danych obiektu
        // Загрузка данных объекта
        osoba1.wczytaj();
        osoba1.wyswietl();

        // Testowanie metod -------------
        imie = osoba2.dajImie();
        nazwisko = osoba2.dajNazwisko();
        pesel = osoba2.dajPesel();
        System.out.println(imie + " " + nazwisko + " " + pesel);
    }
}
