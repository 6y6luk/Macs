public class PrzeladowanieWypisz2 {
    public static void main(String[] args) {
        int[] tabInt = {2, 40, 500} ;
        double[] tabDouble = {3.14, 5.4, 6.6, 12.3 };
        Pisanie pisz = new Pisanie();
        pisz.wypisz(10);
        pisz.wypisz(7, 128);
        pisz.wypisz(3.14);
        pisz.wypisz("Witaj!");
        pisz.wypisz(tabInt);
        pisz.wypisz(tabDouble);
    }
}