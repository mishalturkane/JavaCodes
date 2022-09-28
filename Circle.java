package circleexample.in;

public class Circle {
    private int radius;
    public void setRadius(int r)
    {
        radius=r;
    }
    public double getArea()
    {
        return Math.PI*Math.pow(radius,2);
    }
    public double getCircumference()
    {
        return 2*Math.PI*radius;
    }
}
