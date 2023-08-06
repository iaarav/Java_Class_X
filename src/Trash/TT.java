package Trash;

public class TT {
    public static void main(String[] args) {
        StringBuffer p = new StringBuffer("Computer is fun");
//        p.delete(3,6);
        System.out.println(p);
        System.out.println(p.length());
        p.setLength(12);
        System.out.println(p.reverse());
        System.out.println(p.length());
    }
}