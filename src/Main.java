public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Basic Programs");


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

    }

}