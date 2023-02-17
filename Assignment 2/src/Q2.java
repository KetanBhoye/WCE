// 2.	Implement all string functions in java.

class Q2
{
    public static void main(String[] args) {
        String str ="Ketan";

        //length
        System.out.println("Length of given string : "+str.length());

        //char At Index
        char ch = str.charAt(3);
        System.out.println("At index 3 their is : "+ch);

        //String Substring(begin, end)
        String substr = str.substring(0, 3);
        System.out.println("Substring is : "+substr);

        //boolean check empty
        System.out.println("String is empty ? : "+str.isEmpty());

        //String concatination
        str = str.concat(" Bhoye");
        System.out.println("String after concatination "+str);

        //String replace
        String str2 = "Man";
        str2 = str2.replace('M', 'C');
        System.out.println("String after replacement : "+str2);

        //Find Index of char
        int index = str2.indexOf('n');
        System.out.println("Index of 'n' is : "+index);

        //String to lowerCase
        String str3 = "WCE";
        str3 = str3.toLowerCase();
        System.out.println("Converting to lower Case : "+str3);

        //String to Upper Case
        String str4 ="wce";
        str4 = str4.toUpperCase();
        System.out.println("Converting to Upper Case : "+str4);

        //Trim the string
        String str5 = "  Manish  ";
        str5 = str5.trim();
        System.out.println("String after trim : "+str5);

    }
}