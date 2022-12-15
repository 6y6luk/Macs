public class Student extends Osoba
{
    private long index; // Numer indeksu

    public Student() {}
    public Student(String name, String lastName, long pesel, long index)
    {
        super.setInfo(name, lastName, pesel);
        this.index = index;
    }

    public long getIndex()
    {
        return index;
    }
    public void setIndex(long index)
    {
        this.index = index;
    }   

    public void Delete()
    {
        super.Delete();
        setIndex(-1);
    }

    public void setInfo() 
    {
        super.setInfo();
        //index
        while (true)
        {
            System.out.print("Index (number): ");
            long long_temp = scan.nextLong();
            if (long_temp < 0)
            {
                System.out.println("Pesel will be > 0, try again");
                continue;
            }
            setIndex(long_temp);
            break;
        }
    }

    public void printInfo() {
        super.printInfo();
        System.out.printf("Index: %d\n", index);
    }
}
