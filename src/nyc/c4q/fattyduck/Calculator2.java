package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/24/15.
 */
import java.util.Scanner;
public class Calculator2
{
    public static void calc(String input){
        String[] array= input.split(" ");
        Double  one = Double .valueOf(array[0]);
        Double  two = Double .valueOf(array[2]);
        
        if(array[1].equalsIgnoreCase("+")){
            System.out.println(one+two);
        }else if(array[1].equalsIgnoreCase("-"))
        {
            System.out.println(one - two);
        }else if(array[1].equalsIgnoreCase("*"))
        {
            System.out.println(one * two);
        }else if(array[1].equalsIgnoreCase("/"))
        {
            System.out.println(one / two);
        }else if(array[1].equalsIgnoreCase("+"))
        {
            System.out.println(one % two);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            String input = scan.nextLine();
            calc(input);
            if(input.contains("0")){
                break;
            }
        }
    }
}
