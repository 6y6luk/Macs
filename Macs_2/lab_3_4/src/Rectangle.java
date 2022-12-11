class Rectangle 
{
    public int length;
    public int width;
    
    public Rectangle()
    {
        
    }

    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public void Insert(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public void calculateArea()
    {
        System.out.println(length*width);
    }
}