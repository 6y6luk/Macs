class Rectangle1
{
    public static void main(String args[])
    {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle();

        r1.length = 11;
        r1.width = 5;
        r2.length = 3;
        r2.width = 15;
        r1.calculateArea();
        r2.calculateArea();
    }
}