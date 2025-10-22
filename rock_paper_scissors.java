package conditional_statement;
import java.util.Scanner;
import java.util.Random;
public class rock_paper_scissors {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Choose Option:-\n0.Rock\n1.Paper\n2.Scissor");
        System.out.print("User1 -:- ");
        int num1 = num.nextInt();
        Random rand = new Random();
        int randomint = rand.nextInt(3);
        System.out.println("User2 -"+randomint);
        switch (randomint) {
            case 0 -> System.out.println("Rock");
            case 1 -> System.out.println("Paper");
            case 2 -> System.out.println("Scissors");
            
        }
        if (randomint == num1) {
            System.out.println("Random Number is- " + randomint);
            System.out.println("And You Enter "+num1);
            System.out.println("Match is Draw");
        }else{
            System.out.println("you Are Fail...!");
        }
        
        num.close();
    }
}