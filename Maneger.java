package inhdemo;

public class Maneger extends Emp{
    private double bonus;
    public double setBounus(double bonus)
    {
       return this.bonus=bonus;
    }

    public double gettotalincome()
    {
        double income;
        income=getSalary()+bonus;
        return income;
    }

}
