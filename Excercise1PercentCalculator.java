import java.util.Scanner;

public class Excercise1PercentCalculator {
    public static void main(String[] args) {
        System.out.println("Percentage Calculator!\n");

        Scanner marks = new Scanner(System.in);

        System.out.print("Subject 1: ");
        float a = marks.nextFloat();

        System.out.print("Subject 2: ");
        float b = marks.nextFloat();

        System.out.print("Subject 3: ");
        float c = marks.nextFloat();

        System.out.print("Subject 4: ");
        float d = marks.nextFloat();

        System.out.print("Subject 5: ");
        float e = marks.nextFloat();

        float percent = a+b+c+d+e;
        float percent2 = percent / 500;
        float percentF = percent2*100;

        System.out.print("You Got: ");
        System.out.print(percentF+ "%");

    }
}
