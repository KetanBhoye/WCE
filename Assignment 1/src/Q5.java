import  java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner  inp = new Scanner(System.in);
        System.out.println("Enter String: ");
        String c = inp.nextLine();
        System.out.print("Enter Integer: ");
        int  a = inp.nextInt();

        System.out.print("Enter Floating Point Number : ");
        float b = inp.nextFloat();

        System.out.println("Your Entered data is: "+a+" "+b+" "+c);


    }
}
