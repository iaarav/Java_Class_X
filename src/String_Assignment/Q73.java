package String_Assignment;

import java.util.Scanner;

public class Q73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("Enter a word: ");
        String p=sc.next();

        s=s+" ";
        String q="";
        int c=0;
        char ch;

        for (int i=0;i<s.length();i++){
            ch=s.charAt(i);

            if (ch==' '){

                if (q.equals(p)){
                    System.out.println("Error. The word should not be a part of the string");
                    System.exit(0);
                }

                else{
                    for (int j=0;j<(q.length()-p.length());j++){
                        if (q.substring(i,i+p.length()).equals(p)){
                            c++;
                        }
                        else {
                            continue;
                        }
                    }
                }

                q="";
            }
            else {
                q=q+ch;
            }
        }
        System.out.println("Frequency of \""+p+"\" in the entered sentence is: "+c);
    }
}
