package nyc.c4q.fattyduck;
import java.util.Scanner;

/**
 * Created by fattyduck on 4/22/15.
 */
public class Calculator
{
    public static void calculate(String input, int one, int two){
        if(input.equalsIgnoreCase("Addition")){
            System.out.println(one+two);
        }else if(input.equalsIgnoreCase("Subtraction")){
            System.out.println(one-two);
        }else if(input.equalsIgnoreCase("Multiplication")){
            System.out.println(one*two);
        }else if(input.equalsIgnoreCase("Division")){
            System.out.println(one/two);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("What would you like to do?");
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Division");
            System.out.println("5) Quit");
            String input = scan.nextLine();
            if(input.equalsIgnoreCase("Quit")){
                System.out.println("Nice working with you, bye =P");
                break;
            }

            System.out.println("What is the first number?");
            int one = scan.nextInt();
            System.out.println("What is the second number?");
            int two = scan.nextInt();
            scan.nextLine();
            calculate(input, one, two);

        }
    }
}
