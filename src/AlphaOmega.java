import java.util.Scanner;

public class AlphaOmega {
    private static boolean truest = true;


    public static void goodLoop() throws NumberFormatException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int counter = 0;
        double current = 0;

        while (truest){
        try{

            String input = scanner.next();
            if (input.equals("Q") || input.equals("q")){
                System.out.println("have a nice day");
                break;
            }
            current += Double.parseDouble(input);

            counter++;
            if (counter != 1) {
                System.out.println("gennemsnit er " + current / counter);
            }
            System.out.println("Enter another number:");
        }catch (Exception e){
            System.out.println("Non-valid input");
        }

        }
    }

    public static void main(String[] args) {
        goodLoop();
    }
}
