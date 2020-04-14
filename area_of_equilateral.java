import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        double a1=a.nextDouble();
        double area=((Math.sqrt(3)/4)*(a1*a1));
        double round=(double) Math.round(area*100)/100;
        System.out.println(round);
    }
}
