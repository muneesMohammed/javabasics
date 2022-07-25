import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int x;
        int y;
        int temp;
        Scanner s=new Scanner(System.in);
        System.out.println("enter first a number");
        x=s.nextInt();
        System.out.println("enter second a number");
        y=s.nextInt();
        System.out.println(x);
        System.out.println(y);
        System.out.println("swapped numbers are");
        temp=x;
        x=y;
        y=temp;
        System.out.println(x);
        System.out.println(y);

    }
}
