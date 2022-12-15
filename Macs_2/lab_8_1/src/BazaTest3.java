package lab_8_1.src;

import java.util.Scanner;

public class BazaTest3 {
    public static void main(String[] args) {
        int wybor, pes;
        final int MaxTab = 10;
        var myBaza = new Baza(MaxTab);
        try (var scan = new Scanner(System.in)) {
            // Menu ----------------------------
            do {
                System.out.println("\n1 dodaj, 2 lista, 3 szukaj, 4 usun, 5 sort, 6 koniec");
                wybor = scan.nextInt();
                //scan.nextLine();
                System.out.println("wybor = " + wybor);
                switch(wybor) {
                    case 1: System.out.print("dodaj");
                        myBaza.dodaj();
                        break;
                    case 2: System.out.println("lista");
                        myBaza.lista();
                        break;
                    case 3: System.out.println("szukaj");
                        System.out.print("Podaj pesel: ");
                        pes = scan.nextInt();
                        myBaza.szukaj(pes);
                        break;
                    case 4: System.out.println("usun");
                        System.out.print("Podaj pesel: ");
                        pes = scan.nextInt();
                        myBaza.usun(pes);
                        break;
                    case 5: System.out.println("sort");
                        myBaza.sort();
                        break;
                }
            } while(wybor != 6);
        }

        System.out.println("Koniec");
    }
}