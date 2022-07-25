import java.util.Scanner;

public class largest {
    int first;
    int second;
    int third;
    public static void main(String[] args) {
        largest ch=new largest();
        Scanner input =new Scanner(System.in);
        System.out.println("enter a number");
        System.out.println("enter first a number");
        ch.first=input.nextInt();
        System.out.println("enter second a number");
        ch.second=input.nextInt();
        System.out.println("enter third a number");
        ch.third=input.nextInt();
        if (ch.first> ch.second){
            System.out.println(ch.first);
        }
        else {
            System.out.println(ch.second);
        }

    }
}
