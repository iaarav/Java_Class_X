package Trash;

public class a {
    public static void main(String[] args) {
        int p=15;
        for (int i=1; i <=7 ; i+=2){
            for (int k=1 ; k<=p ; k++){
                System.out.print(" ");
            }
            for (int j=1; j <=i;j++){
                System.out.print("*");
            }
            System.out.println();
            p--;
        }
        p+=2;
        for (int i=5; i >=1 ; i-=2){
            for (int k=1 ; k<=p ; k++){
                System.out.print(" ");
            }
            for (int j=i; j >= 1;j--){
                System.out.print("*");
            }
            System.out.println();
            p++;
        }
    }
}
