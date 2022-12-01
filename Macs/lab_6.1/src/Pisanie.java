class Pisanie {
    public void wypisz(int liczba) {
        System.out.println("Liczba calkowita: " + liczba);
    }

    public void wypisz(int pierwsza, int druga) {
        System.out.println("Pierwsza liczba: " + pierwsza +
                ", druga liczba: " + druga);
    }

    public void wypisz(double liczba) {
        System.out.println("Liczba rzeczywista: " + liczba);
    }

    public void wypisz(String tekst) {
        System.out.println("Tekst: " + tekst);
    }

    public void wypisz(int[] tablica) {
        for (var item: tablica){
            System.out.print(item);
            System.out.print(' ');
        }
        System.out.print('\n');
    }

    public void wypisz(double[] tablica) {
        for (var item: tablica){
            System.out.print(item);
            System.out.print(' ');
        }
        System.out.print('\n');
    }
}