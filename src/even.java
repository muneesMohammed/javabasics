import java.util.Scanner;

public class even {
    int num;
    public static void main(String[] args) {
even ev=new even();
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        ev.num=s.nextInt();
        if (ev.num%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
