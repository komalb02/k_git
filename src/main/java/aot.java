import java.util.Scanner;
public class aot {
    public static void main(String[] args)
    {
        Scanner sn= new Scanner(System.in);
        System.out.println("Enter base of triangle:");
        double base = sn.nextDouble();
        System.out.println("Enter base of triangle");
        double height = sn.nextDouble();

        aot at=new aot();
        double area = at.calculateArea(base,height);
        System.out.println("Area of triangle is:"+area);
    }
    private double calculateArea(double base, double height)
    {
        return base*height/2;
    }
}
