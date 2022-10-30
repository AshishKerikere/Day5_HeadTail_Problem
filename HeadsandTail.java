package Day5;
import java.util.Scanner;
public class Flip_Percentage {
    public static void main(String[] args){

        System.out.println("Enter the number of times to flip the coin");
        Scanner scanner = new Scanner(System.in);
        int flip_Times = scanner.nextInt();

        int head_Times = 0;
        int tail_Times = 0;


        for(int i = 1; i <= flip_Times; i++){
            double rand = Math.floor(Math.random()*flip_Times+1.0d)%2;

            if(rand < 1.0d)
                tail_Times++;

            else
                head_Times++;
        }

        System.out.println("Number of tails " +tail_Times);
        System.out.println("Number of Heads " +head_Times);
        System.out.println("Percentage of tails " +((tail_Times*1.0)/(flip_Times*1.0)*100) +"%");
        System.out.println("Percentage of heads " +((head_Times*1.0)/(flip_Times*1.0)*100) +"%");

    }
}
