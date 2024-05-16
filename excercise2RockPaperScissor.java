import java.util.Scanner;

public class excercise2RockPaperScissor {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissor!!!");

        Scanner player1 = new Scanner(System.in);
        Scanner player2 = new Scanner(System.in);

        System.out.print("Player1: ");
        String playero = player1.next();

        System.out.print("Player2: ");
        String playert = player2.next();

        if(playero.equals("paper") && playert.equals("rock") ){
            System.out.println("Player 1 wins!");
        }
        else if(playero.equals("rock") && playert.equals("paper") ){
            System.out.println("Player 2 wins!");
        }
        else if(playero.equals("scissor") && playert.equals("paper") ){
            System.out.println("Player 1 wins!");
        }
        else if(playero.equals("paper") && playert.equals("scissor") ){
            System.out.println("Player 2 wins!");
        }
        else if(playero.equals("rock") && playert.equals("scissor") ){
            System.out.println("Player 1 wins!");
        }
        else if(playero.equals("scissor") && playert.equals("rock") ){
            System.out.println("Player 1 wins!");
        }
        else if(playero.equals(playert)){
            System.out.println("Tie try Again!");
        }
        else{
            System.out.println("Something went wrong!!!!");
        }

    }
}
