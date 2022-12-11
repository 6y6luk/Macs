public class Pracownik extends Osoba
{
    private String zakladPracy; // Gdzie pracuje

    public Pracownik() {}
    public Pracownik(String zakladPracy)
    {
        this.zakladPracy = zakladPracy;
    }

    public String getzakladPracy()
    {
        return zakladPracy;
    }
    public void setZakladPracy(String zakladPracy)
    {
        this.zakladPracy = zakladPracy;
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
            try 
            {
                System.out.print("Pesel (number): ");
                
                pesel = scan.nextLong();    
                
                //check pesel len and value
                if (pesel <= 0)
                {
                    System.out.println("Pesel jest mniejsze od zera, wpisz nowe pesel");
                    continue;
                }
                else
                {
                    break;
                }
                //System.out.println("lenw pesel = " + getCountOfNums(pesel));
                                   
            } catch (Exception e) {
                System.out.println("Wrong input");
                System.out.println("Niewłaściwe dane wejściowe");
            }
        }
        //zaklad
        scan.nextLine();
        String zaklad;
        while (true) {
            try 
            {
                System.out.print("Zaklad: ");
                zaklad = scan.nextLine();
                // check zaklad
                sqlInjectSymol = checkForbiddenSqlSymbols(zaklad);
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
            } 
            catch (Exception e) 
            {
                System.out.println("Wrong input");
                System.out.println("Niewłaściwe dane wejściowe");
            }
        }
        
        this.zakladPracy = zaklad;
        //wczytaj(String imie, String nazwisko, long pesel) 
        super.wczytaj(imie, nazwisko, pesel);
    }

    public void delete() {
        super.delete();
    }
}