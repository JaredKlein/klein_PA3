import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Random;

public class MathTime {

    public static double problem_type(int difficulty, int problem){
        SecureRandom rand = new SecureRandom();
        Scanner sc = new Scanner(System.in);
        Random num = new Random();

        if (problem == 5) {
            problem = num.nextInt(4) + 1;
        }

        if (difficulty == 1 && problem == 1){
            double rand_int1 = rand.nextInt(10);
            double rand_int2 = rand.nextInt(10);

            System.out.println("How much is " + rand_int1 + " plus " + rand_int2 + "?");
            return rand_int1 + rand_int2;
        }
        if (difficulty == 1 && problem == 2){
            double rand_int1 = rand.nextInt(10);
            double rand_int2 = rand.nextInt(10);

            System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
            return rand_int1 * rand_int2;
        }
        if (difficulty == 1 && problem == 3){
            double rand_int1 = rand.nextInt(10);
            double rand_int2 = rand.nextInt(10);

            System.out.println("How much is " + rand_int1 + " minus " + rand_int2 + "?");
            return rand_int1 - rand_int2;
        }
        if (difficulty == 1 && problem == 4){
            double rand_int1 = rand.nextInt(10);
            double rand_int2 = rand.nextInt(10);

            if (rand_int2 == 0){
                rand_int2++;
            }

            System.out.println("How much is " + rand_int1 + " divided by " + rand_int2 + "?");

            return rand_int1 / rand_int2;
        }

        if (difficulty == 2 && problem == 1){
            double rand_int1 = rand.nextInt(100);
            double rand_int2 = rand.nextInt(100);

            System.out.println("How much is " + rand_int1 + " plus " + rand_int2 + "?");
            return rand_int1 + rand_int2;
        }
        if (difficulty == 2 && problem == 2){
            double rand_int1 = rand.nextInt(100);
            double rand_int2 = rand.nextInt(100);

            System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
            return rand_int1 * rand_int2;
        }
        if (difficulty == 2 && problem == 3){
            double rand_int1 = rand.nextInt(100);
            double rand_int2 = rand.nextInt(100);

            System.out.println("How much is " + rand_int1 + " minus " + rand_int2 + "?");
            return rand_int1 - rand_int2;
        }
        if (difficulty == 2 && problem == 4){
            double rand_int1 = rand.nextInt(100);
            double rand_int2 = rand.nextInt(100);

            if (rand_int2 == 0){
                rand_int2++;
            }

            System.out.println("How much is " + rand_int1 + " divided by " + rand_int2 + "?");

            return rand_int1 / rand_int2;
        }

        if (difficulty == 3 && problem == 1){
            double rand_int1 = rand.nextInt(1000);
            double rand_int2 = rand.nextInt(1000);

            System.out.println("How much is " + rand_int1 + " plus " + rand_int2 + "?");
            return rand_int1 + rand_int2;
        }
        if (difficulty == 3 && problem == 2){
            double rand_int1 = rand.nextInt(1000);
            double rand_int2 = rand.nextInt(1000);

            System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
            return rand_int1 * rand_int2;
        }
        if (difficulty == 3 && problem == 3){
            double rand_int1 = rand.nextInt(1000);
            double rand_int2 = rand.nextInt(1000);

            System.out.println("How much is " + rand_int1 + " minus " + rand_int2 + "?");
            return rand_int1 - rand_int2;
        }
        if (difficulty == 3 && problem == 4){
            double rand_int1 = rand.nextInt(1000);
            double rand_int2 = rand.nextInt(1000);

            if (rand_int2 == 0){
                rand_int2++;
            }

            System.out.println("How much is " + rand_int1 + " divided by " + rand_int2 + "?");

            return rand_int1 / rand_int2;
        }

        if (difficulty == 4 && problem == 1){
            double rand_int1 = rand.nextInt(10000);
            double rand_int2 = rand.nextInt(10000);

            System.out.println("How much is " + rand_int1 + " plus " + rand_int2 + "?");
            return rand_int1 + rand_int2;
        }
        if (difficulty == 4 && problem == 2){
            double rand_int1 = rand.nextInt(10000);
            double rand_int2 = rand.nextInt(10000);

            System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
            return rand_int1 * rand_int2;
        }
        if (difficulty == 4 && problem == 3){
            double rand_int1 = rand.nextInt(10000);
            double rand_int2 = rand.nextInt(10000);

            System.out.println("How much is " + rand_int1 + " minus " + rand_int2 + "?");
            return rand_int1 - rand_int2;
        }
        if (difficulty == 4 && problem == 4){
            double rand_int1 = rand.nextInt(10000);
            double rand_int2 = rand.nextInt(10000);

            if (rand_int2 == 0){
                rand_int2++;
            }

            System.out.println("How much is " + rand_int1 + " divided by " + rand_int2 + "?");

            return rand_int1 / rand_int2;
        }
        return 0;

    }

    public static void win_comment(){
        Random rand = new Random();

        int rand_num1 = rand.nextInt(4) + 1;

        switch(rand_num1){
            case 1:
                System.out.println("Very good!");
                break;
            case 2:
                System.out.println("Excellent");
                break;
            case 3:
                System.out.println("Nice work!");
                break;
            case 4:
                System.out.println("Keep up the good work!");
                break;
        }
    }

    public static void lose_comment(){
        Random rand = new Random();

        int rand_num2 = rand.nextInt(4) + 1;

        switch(rand_num2){
            case 1:
                System.out.println("No. Please try again.");
                break;
            case 2:
                System.out.println("Wrong. Try once more.");
                break;
            case 3:
                System.out.println("Don’t give up!");
                break;
            case 4:
                System.out.println("No. Keep trying.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter difficulty (1-4)");

        int difficulty = scnr.nextInt();

        System.out.println("Type 1 = addition, Type 2 = multiplication, Type 3 = subtraction, Type 4 = division, Type 5 = mix");
        int problem = scnr.nextInt();

        double right_answer;
        double user_answer;
        int right = 0;
        int wrong = 0;
        int count = 0;
        double percent;

        while(count < 10){
            right_answer = problem_type(difficulty, problem);
            user_answer = scnr.nextDouble();

            if (Math.abs(right_answer - user_answer) < .01){
                win_comment();
                count++;
                right++;
                if (count == 10){
                    System.out.println("You got " + right + " right");
                    System.out.println("You got " + wrong + " wrong");
                    percent = (double)right * 10;
                    System.out.println(percent + "%");
                    if (right >= 8){
                        System.out.println("Congratulations, you are ready to go to the next level!");
                    }
                    else{
                        System.out.println("Please ask your teacher for extra help.");
                    }
                    System.out.println("Do you want to start a new session? y/n");
                    char ch = scnr.next().charAt(0);
                    if (ch == 'y'){
                        right = 0;
                        wrong = 0;
                        count = 0;
                        System.out.println("Enter difficulty (1-4)");

                        difficulty = scnr.nextInt();

                        System.out.println("Type 1 = addition, Type 2 = multiplication, Type 3 = subtraction, Type 4 = division, Type 5 = mix");
                        problem = scnr.nextInt();
                    }
                    else{
                        System.out.println("goodbye");
                        break;
                    }
                }
            }
            else{
                lose_comment();
                count++;
                wrong++;
                if (count == 10){
                    System.out.println("You got " + right + " right");
                    System.out.println("You got " + wrong + " wrong");
                    percent = (double)right * 10;
                    System.out.println(percent + "%");
                    if (right >= 8){
                        System.out.println("Congratulations, you are ready to go to the next level!");
                    }
                    else{
                        System.out.println("Please ask your teacher for extra help.");
                    }
                    System.out.println("Do you want to start a new session? y/n");
                    char ch2 = scnr.next().charAt(0);
                    if (ch2 == 'y'){
                        right = 0;
                        wrong = 0;
                        count = 0;
                        System.out.println("Enter difficulty (1-4)");

                        difficulty = scnr.nextInt();

                        System.out.println("Type 1 = addition, Type 2 = multiplication, Type 3 = subtraction, Type 4 = division, Type 5 = mix");
                        problem = scnr.nextInt();
                    }
                    else{
                        System.out.println("goodbye");
                        break;
                    }
                }
            }
        }
    }
}