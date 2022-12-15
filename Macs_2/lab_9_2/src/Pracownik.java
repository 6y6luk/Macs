public class Pracownik extends Osoba
{
    private String zakladPracy; // Gdzie pracuje

    public Pracownik() {}
    public Pracownik(String name, String lastName, long pesel, long index, String zakladPracy)
    {
        super.setInfo(name, lastName, pesel);
        this.zakladPracy = zakladPracy;
    }

    public String getZakladPracy()
    {
        return zakladPracy;
    }
    public void setZakladPracy(String zakladPracy)
    {
        this.zakladPracy = zakladPracy;
    } 

    public void setInfo() 
    {
        super.setInfo();
        //zaklad
        while (true)
        {
            scan.nextLine();
            System.out.print("Zaklad pracy: ");
            String str_temp = scan.nextLine();
            boolean sql_alarm = checkForbiddenSqlSymbols(str_temp);
            if (sql_alarm == true)
            {
                System.out.println("You enter forbidden symbols, try again");
                continue;
            }
            setZakladPracy(str_temp);
            break;
        }
    }

    public void Delete() {
        super.Delete();
        setZakladPracy("");
    }
}
