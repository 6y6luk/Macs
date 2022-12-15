import java.util.Scanner;

class BazaTestVirt 
{
    static final int MaxTab = 10;
    
    public static void main(String[] args) 
    { // Program testowy
        int wybor,i,pes;
        Osoba osb;
        Baza myBaza = new Baza(MaxTab);
        Scanner scan = new Scanner(System.in);

        //Student student = new Student("artem", "2", 21, 1);
        // Osoba student = new Student("artem", "2", 21, 1);
        // student.setInfo();
        // System.out.println("\n\n");
        // System.out.println(student.getName());
        // System.out.println(student.getLastName());
        // System.out.println(student.getPesel());
                
        // Menu ----------------------------
        do {
            System.out.println("1 dodaj, 2 lista, 3 szukaj, 4 usun, 5 koniec");
            wybor = scan.nextInt();
            System.out.println("wybor = " + wybor);
            switch(wybor) 
            {
                case 1: 
                    System.out.println("dodaj");
                    System.out.println("1 Student, 2 Pracownik, 3 Osoba");
                    wybor = scan.nextInt();
                    System.out.println("Typ wybor: " + wybor);
                    switch(wybor) 
                    {
                        case 1: 
                        osb = new Student();
                        osb.setInfo();
                        break;
                    case 2: 
                        osb = new Pracownik();
                        osb.setInfo();
                        break;
                    case 3: 
                        osb = new Osoba();
                        osb.setInfo();
                        break;
                    default: 
                        System.out.println("zly wybor");
                        osb = new Osoba();
                    }
                    myBaza.Add(osb); // Dodanie obiektu
                    break;
                case 2: 
                    System.out.println("lista");
                    myBaza.Print();
                    break;
                case 3: 
                    System.out.println("szukaj");
                    System.out.println("Podaj pesel: ");
                    pes = scan.nextInt();
                    myBaza.Find(pes);
                    break;
                case 4: 
                    System.out.println("usun");
                    System.out.println("Podaj pesel: ");
                    pes = scan.nextInt();
                    myBaza.Delete(pes);
                    break;
                default: 
                    System.out.println("Zly wybor");
            }
        } while(wybor != 5);
        System.out.println("Koniec");
    }
}