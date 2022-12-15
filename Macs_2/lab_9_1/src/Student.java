public class Student extends Osoba
{
    private long index; // Numer indeksu

    public Student() {}
    public Student(long index)
    {
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
}
