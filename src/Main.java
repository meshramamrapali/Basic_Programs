import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Basic Programs");
        System.out.println("----------------------------------------");

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
            System.out.println("---------------------------------------------------");

            int year;
            System.out.println("Enter an Year :: ");
            Scanner sc = new Scanner(System.in);
            year = sc.nextInt();

            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                System.out.println("Specified year is a leap year");
            else
                System.out.println("Specified year is not a leap year");
                System.out.println("-------------------------------------------------");

        double n=10,i;
        double sum=0;
        for( i=1;i<=n;i++)
        {
            sum=sum+(1/i);
        }
        System.out.println("Harmonic value = "+sum);
        System.out.println("-------------------------------------");
    }

        }





