package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/23/15.
 */
public class grader

{
    public static void grade(int num){
        if(num==100){
            System.out.println("A+");
        }else if(num < 100 && num > 89)
        {
            System.out.println("A");

        }else if(num<90&&num>79)
        {
            System.out.println("B");
        }else if(num<80&&num>69)
        {
            System.out.println("C");
        }else if(num<70&&num>59)
        {
            System.out.println("D");
        }else if(num<60&&num>=0)
        {
            System.out.println("F");
        }
    }
    public static void main(String[] args){
        grade(60);
    }
}
