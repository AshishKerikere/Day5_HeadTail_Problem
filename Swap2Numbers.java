package Day5;
import java.util.Scanner;
public class Swap_Numbers{
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a ");
        int a = scan.nextInt();
        System.out.println("Enter b");
        int b = scan.nextInt();

        int c = b;
        b = a;
        a = c;

        System.out.println("a = "+a +",b = " +b);

    }
}
