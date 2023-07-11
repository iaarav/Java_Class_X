package String_Assignment;

import java.util.Scanner;

public class Q72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        s = s + " ";
        char ch, ch1;
        String q = "", r = "";
        int count = 0, maxcount = 0;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            if (ch == ' ') {
                count=0;
                for (int j = 0; j < q.length(); j++) {
                    ch1 = q.charAt(j);

                    if (ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U' || ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u'){
                        count++;
                    }
                }
                if (count>maxcount){
                    maxcount=count;
                    r=q;
                }
                q = "";
            } else {
                q = q + ch;
            }
        }
        System.out.println("Maximum number of vowels: "+maxcount);
        System.out.println("Word: "+r);
    }
}
