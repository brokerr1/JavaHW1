package Java.HomeWork.JavaHW_1;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        System.out.print("Введите необходимую степень числа: ");
        int b = in.nextInt();
        double c = Math.pow(a, b);

        System.out.println(c);
    }
    
}