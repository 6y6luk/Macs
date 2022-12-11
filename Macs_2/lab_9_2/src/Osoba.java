import java.util.Scanner;

public class Osoba {
    private String imie ;     // Imie
    private String nazwisko ; // Nazwisko
    private long pesel ;       // Pesel
    
    Scanner scan =  new Scanner(System.in);

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

    private boolean checkForbiddenSqlSymbols(String str)
    {
        char forbiddenSymbols[] = {'\0', '\'', '\'', '\b', '\n', '\r', '\t', '\\', '%', '_', '<', '>', '=', '-', '+', '!', '@', '#', '$', '^', '&', '*', '(', ')', '?', '{', '}', '[', ']', '/' };
        var char_strArray = str.toCharArray();
        for (int i = 0; i < char_strArray.length; i++)
        {
            for (var symbol: forbiddenSymbols)
            {
                if (symbol == char_strArray[i])
                {
                    return true;
                }
            }
        }
        return false;
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

    public void wczytaj() 
    {
        //System.out.println("Добавление нового пользвователя");
        //System.out.println("\nPokaż nowy adres");
        boolean sqlInjectSymol = false;
        
        //Name
        String imie;
        while (true) {
            try {
                System.out.print("Imie: ");
                imie = scan.nextLine();
                //check name
                sqlInjectSymol = checkForbiddenSqlSymbols(imie);
                if (sqlInjectSymol == true)
                {
                    System.out.println("You use frobidden symbols, try again");
                    System.out.println("Użyłeś niedozwolonych symboli, spróbuj ponownie");
                    continue;
                }
                else
                {
                    sqlInjectSymol = false;
                    break;
                }
            } catch (Exception e) {
                System.out.println("Wrong input");
                System.out.println("Niewłaściwe dane wejściowe");
            }
        }
        //Last name
        String nazwisko;
        while (true) {
            try {
                System.out.print("Nazwisko: ");
                nazwisko = scan.nextLine();
                // check nazwisko
                sqlInjectSymol = checkForbiddenSqlSymbols(nazwisko);
                if (sqlInjectSymol == true)
                {
                    System.out.println("You use forbidden symbols, try again");
                    System.out.println("Użyłeś niedozwolonych symboli, spróbuj ponownie");
                    continue;
                }
                else
                {
                    sqlInjectSymol = false;
                    break;
                }
            } catch (Exception e) {
                //System.out.println("Wrong input");
                System.out.println("Niewłaściwe dane wejściowe");
            }
        }
        //Pesel
        long pesel;
        while (true) {
            try {
                System.out.print("Pesel (number): ");
                pesel = scan.nextLong();    
                
                //check pesel len and value
                if (pesel <= 0)
                {
                    System.out.println("Pesel jest mniejsze od zera, wpisz nowe pesel");
                    continue;
                }
                else{
                    break;
                }
                //System.out.println("lenw pesel = " + getCountOfNums(pesel));
                                   
            } catch (Exception e) {
                System.out.println("Wrong input");
                System.out.println("Niewłaściwe dane wejściowe");
            }
        }
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public void delete() {
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
