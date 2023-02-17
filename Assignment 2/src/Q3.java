public class Q3 {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        //Append Method
        sb.append(" Ketan");
        System.out.println("String after appending : "+sb);

        //Insert Method
        StringBuffer sb1 = new StringBuffer("Java");
        sb1.insert(1, "Code");
        System.out.println("String after Inserting : "+sb1);

        //Replace Method
        StringBuffer sb2 = new StringBuffer("Program");
        sb2.replace(1, 3, "new");
        System.out.println("String after replace : "+sb2);

        //Delete Method
        sb2.delete(1, 4);
        System.out.println("String after Deletion : "+sb2);

        //Reverse Method
        sb2.reverse();
        System.out.println("String after Reversing : "+sb2);

        //Capacity Method
        StringBuffer sb3 = new StringBuffer();
        System.out.println("Default String capacity : "+sb3.capacity());
        System.out.println("String capacity of sb2 : "+sb2.capacity());

    }
}
