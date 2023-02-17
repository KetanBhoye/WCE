
public class Q10 {

    //No-Arguments Constructor
    Q10()
    {
        System.out.println("No Argument Constructor");
    }

    //Parameterized Constructor
    String nm;
    Q10(String name)
    {
        nm = name;
        System.out.println("Name of Student(using parameterized constructor) : "+nm);
    }


    public static void main(String[] args) {

        Q10 c1 = new Q10();
        Q10 c2 = new Q10("Ketan");

    }
}
