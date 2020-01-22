import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String months;

        System.out.print("Enter the number of days: ");
        int days = keyboard.nextInt();

        //select which months to display
        switch(days) {
            //30 days
            case 30:
                months = "September April June November";
                break;
            //31 days
            case 31:
                months = "January March May July August September October December";
                break;
            //28 days
            case 28:
                months = "February";
                break;
            //otherwise error
            default:
                months = ("No months have exactly "+days+" days");
                break;
        }

        //print months
        System.out.println(months);
    }
}
