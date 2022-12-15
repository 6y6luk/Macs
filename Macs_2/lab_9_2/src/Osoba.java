import java.util.Scanner;

public class Osoba {
    private String name;     // name
    private String lastName; // lastName
    private long pesel;       // Pesel
    private String className = "Osoba";
    
    Scanner scan =  new Scanner(System.in);

    public Osoba(String name, String lastName, int pesel) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    public Osoba() {
        this.name = "null";
        this.lastName = "null";
        this.pesel = -1;
    }

    public String getClassName()
    {
        return className;
    }
    
    public void Delete() {
        name = "null";
        lastName = "null";
        pesel = -1;
    }

    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public long getPesel() {
        return pesel;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setPesel(long pesel)
    {
        this.pesel = pesel;
    }
    
    public void printInfo() {
        System.out.printf("Name: %s, lastName: %s, Pesel: %d\n", name, lastName, pesel);
    }

    public boolean checkForbiddenSqlSymbols(String str)
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
    public void setInfo(String name, String lastName, long pesel) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
    }
    public void setInfo() {
        //name
        while (true)
        {
            System.out.print("Name: ");
            String str_temp = scan.nextLine();
            boolean sql_alarm = checkForbiddenSqlSymbols(str_temp);
            if (sql_alarm == true)
            {
                System.out.println("You enter forbidden symbols, try again");
                continue;
            }
            this.setName(str_temp);
            break;
        }
        //last_name
        while (true)
        {
            System.out.print("Last name: ");
            String str_temp = scan.nextLine();
            boolean sql_alarm = checkForbiddenSqlSymbols(str_temp);
            if (sql_alarm == true)
            {
                System.out.println("You enter forbidden symbols, try again");
                continue;
            }
            this.setLastName(str_temp);
            break;
        }
        //pesel
        while (true)
        {
            System.out.print("Pesel (number): ");
            long long_temp = scan.nextLong();
            if (long_temp < 0)
            {
                System.out.println("Pesel will be > 0, try again");
                continue;
            }
            this.setPesel(long_temp);
            break;
        }
    }



}
