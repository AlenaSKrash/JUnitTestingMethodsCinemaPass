import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        boolean gameContinue = true;
        int randomNumber = rand.nextInt(100);
        while (gameContinue){
            System.out.println("Insert a number: ");
            int guess = scan.nextInt();
            if (guess > randomNumber) {

            }
        }
    }
}
