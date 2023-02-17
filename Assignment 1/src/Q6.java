
import java.util.Scanner;

public class Q6 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Seconds: ");
        int sec = sc.nextInt();

        float min = sec/60;
        float hr = min/60;

        System.out.println("Time in Seconds : "+sec+" seconds");
        System.out.println("Time in Minutes : "+min+" minutes");
        System.out.println("Time in Hours : "+hr+" hours");


        sc.close();
    }

}
