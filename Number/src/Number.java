import java.util.Random;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int count = 0;
        int number;
        int guess;


        Random rnd = new Random();
        number = rnd.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the number from 1 to 10");

do {
    count++;
    System.out.print("Your number ");
    guess = scanner.nextInt();

    if(guess > 10 || guess < 0){
        System.out.println("Number out of scope, please pick correct number");
    }
   else if(guess > number){
        System.out.println("Agh, my number is smaller");
    }else if(guess < number){
        System.out.println("Na-ah, my number is higer");
    }

}while(guess != number);
        System.out.println("Great job! You guess it in  " + count + " times");
    }
}
