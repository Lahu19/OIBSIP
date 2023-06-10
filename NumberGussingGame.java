import java.util.*;

public class NumberGussingGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int mynum = (int) (Math.random() * 100);
        int yournum = 0;

        do {
            System.out.print("Guess number (1-100) : ");
            yournum = sc.nextInt();
            if (mynum == yournum) {
                System.out.println("WOHOO...! You Win");
                break;
            } else if (mynum > yournum) {
                System.out.println("Your number is too small..");
            } else {
                System.out.println("Your number is too large..");
            }
        } while (yournum>= 0);
        System.out.println("The number to be found is : " + mynum);
        System.out.println("Thank You ..! ");

    }
}
