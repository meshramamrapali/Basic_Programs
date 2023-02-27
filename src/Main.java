import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Basic Programs");
        System.out.println("-----------------------------------------------");

        double head = 0, tail = 0;
        int numberOfAttempts = 5;
        for (int i = 1; i <= numberOfAttempts; i++) {
            double rand = Math.random();
            String coin = "";
            if (rand < 0.5)
                head++;
            else
                tail++;
        }
        System.out.println("Head Results:" + head);
        System.out.println("Tail Results:" + tail);

        System.out.println("Head Probability:" + (head) / numberOfAttempts);
        System.out.println("Tail Probability:" + (tail) / numberOfAttempts);
        System.out.println("-----------------------------------------------");

        int year;
        System.out.println("Enter an Year :: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");
        System.out.println("-----------------------------------------------");

        double n = 10, i;
        double sum = 0;
        for (i = 1; i <= n; i++) {
            sum = sum + (1 / i);
        }
        System.out.println("Harmonic value = " + sum);
        System.out.println("-----------------------------------------------");

        int my_input, i1;
        my_input = 40;
        System.out.println("The number is defined as " + my_input);
        System.out.print("The factors of " + my_input + " are: ");
        for (i1 = 1; i1 <= my_input; ++i1) {
            if (my_input % i1 == 0) {
                System.out.print(i1 + " ");
                sc.nextLine();


            }
        }
        System.out.println("-----------------------------------------------");

        int dividend = 450, divisor = 8;
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
        System.out.println("-----------------------------------------------");

        int first = 24, second = 2;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        int temporary = first;
        first = second;
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        System.out.println("-----------------------------------------------");

        int number = 24;
        System.out.println("Enter the number  are :");
        //checking whether the number is even or odd
        if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is odd");
        System.out.println("-----------------------------------------------");
    }
}




