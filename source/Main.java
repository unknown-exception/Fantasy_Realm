import java.io.Console;
import java.util.Random;
import java.util.Scanner;

public class Main 

{
    public static void main (String[] args)
    {
        
        // System.out.println("Hello Marta!");
        // Console cns = System.console();
        Random rnd = new Random();
        // String userAnswer = cns.readLine("Enter the answer: \n");
        // int someNumber = rnd.nextInt(10) + 1 ;
        // boolean someBool = rnd.nextBoolean();

        Scanner scanner = new Scanner(System.in);
        


        Console cns = System.console();

        int money = 0;
        int doorNumber = rnd.nextInt(2) + 1 ;
        
        System.out.println("============================================");
        System.out.println("============ THE GAME BEGINS !!! ===========");
        System.out.println("============================================");

        cns.readLine("Press ENTER to begin");
        System.out.println("Hello fellow advanturer! Welcome on your quest! Before you start, would you mind reminding me your name?");
        String playersName = scanner.nextLine();
        System.out.println("Oh, right. So, dear " + playersName + ", which of the three caves would you like to enter(1, 2, 3)? ");
        int playersDoorNumber = scanner.nextInt();

        if (playersDoorNumber > 3 || playersDoorNumber < 1) {
            System.out.println("Sorry, could you repeat the cave number? There are only three caves.");
            playersDoorNumber = scanner.nextInt();
        }else if (playersDoorNumber == 123) {//randomly chosen one) { {
            //dragooon
        } else {
            money = money +10;
            System.out.println("Hurray! You found the treasure and came back alive! Not everybody can do that. Thankn you so much! Here is your payment: 10 golden coins. You have " + money + "golds you rich mf! But would like to earn more?");
            Boolean playAgain = scanner.nextBoolean(); // not sure whether I used boolean correctly 
            if (playAgain){
                
            }
        }
    }
}