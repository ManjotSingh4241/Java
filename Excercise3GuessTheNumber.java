import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int noOfGuesses = 0;
    public int inputNumber;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }

     Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        noOfGuesses++;
    }
    boolean isCorrectNumber(){
        if (inputNumber == number){
            System.out.format("The number was %d\n attempts taken %d: ", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("too low");
        }
        else if(inputNumber>number){
            System.out.println("too high");
        }

            return false;

    }
}


public class Excercise3GuessTheNumber {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}
