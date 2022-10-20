package inhdemo;

public class UseManeger {
    public static void main(String[] args) {
        Maneger boss=new Maneger();
        boss.setData("Mihsal",80000.0);
        boss.setBounus(2000.0);
        System.out.println("Mnager's name is "+boss.getName());
        System.out.println("Manager's income is "+boss.gettotalincome());
        System.out.println("Manager's salary is"+boss.getSalary());
    }
}
