public class Rectangle2
{
    public static void main(String args[])
    {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle();

        r1.Insert(11, 5);
        r2.Insert(3, 15);

        r1.calculateArea();
        r2.calculateArea();
    }
}
