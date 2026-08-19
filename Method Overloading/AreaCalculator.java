public class AreaCalculator{

    public int area(int side)
    {
        int area = side*side;
        return area;
    }

    public int area(int length, int breadth)
    {
        int area = length*breadth;
        return area;
    }

    public double area(double radius)
    {
        double area=Math.PI*radius*radius;
        return area;
    }


    public static void main(String args[])
    {
        AreaCalculator ac = new AreaCalculator();

        int sqArea = ac.area(5);
        int rectArea = ac.area(4, 8);
        double cirArea = ac.area(4.0);

        System.out.println("Square area: "+sqArea);
        System.out.println("Rectangle area: "+rectArea);
        System.out.println("Circle Area: "+cirArea);
    }    
}


