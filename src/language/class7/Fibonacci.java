package language.class7;

public class Fibonacci {
    public static void main(String[] args) {

        int n = 8;
        int n1 = 0, n2=1;

        int counter = 0;
        while( counter < n){
            System.out.print(n1 + " " );

            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            counter++;
        }
        


    }
}
