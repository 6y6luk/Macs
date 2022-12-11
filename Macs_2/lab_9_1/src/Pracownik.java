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
}
