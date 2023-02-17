public class Q8 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ketan");

        // append() method
        sb.append(" Bhoye");
        System.out.println("After append: " + sb);

        // insert() method
        sb.insert(5, " Yashwant");
        System.out.println("After insert: " + sb);

        // replace() method
        sb.replace(5, 9, "");
        System.out.println("After replace: " + sb);

        // delete() method
        sb.delete(5, 10);
        System.out.println("After delete: " + sb);

        // reverse() method
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
