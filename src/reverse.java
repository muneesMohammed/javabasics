import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int num;
        int i=0;
        int rev = 0;
        int rem=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter first a number");
        num=s.nextInt();
        while (num!=i){
             rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }
        System.out.println(rev);
    }
}
