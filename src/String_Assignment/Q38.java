package String_Assignment;

public class Q38 {
    public static void main(String[] args) {

        String s = "26 January is celebrated as Republic Day";

        String p = s.replace("26","15");
        String q = p.replace( "January", "August");
        String r = q.replace("Republic", "Independence");

        System.out.println("Original String: "+s);
        System.out.println("New Required String: "+r);
    }
}