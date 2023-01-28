import java.io.Console;
import java.util.Random;

public class Main 
{
    public static void main (String[] args)
    {
        System.out.println("Hello Marta!");
        Console cns = System.console();
        Random rnd = new Random();
        String userAnswer = cns.readLine("Enter the answer: \n");
        int someNumber = rnd.nextInt(10) + 1 ;
        boolean someBool = rnd.nextBoolean();

        System.out.println("============================================");
        System.out.println("============ THE GAME BEGINS !!! ===========");
        System.out.println("============================================");
    }
}