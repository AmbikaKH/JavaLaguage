package language.class6;
import java.util.Scanner;


class arraysTest{

    // 1 Dimensional Array
    void oneDArray(){

        //int [3]ab; //  INVALID

        //int x[6]; -- INVALID -- We cant specify size at the time of declaration

        int []a1; //VALID
        //int []a2, []a3; -- INVALID when we are decalaring r arrays at time , we should have variable name first like below
        int a3[], a4[];  // VALID

        int []a;     // VALID
        a = new int[3];
        a[0] = 1;
        for(int i =0; i<a.length; i++){
            System.out.println(a[i]);

        }
        System.out.println("*************************");
        int b[] = {1,2,3,4,5}; // VALID
        int []c = {7,8,9,10}; // VALID
        for(int i =0; i<b.length; i++){
            System.out.println(b[i]);

        }
        System.out.println("*************************");
        for(int i =0; i<c.length; i++){
            System.out.println(c[i]);

        }
        System.out.println("*************************");
        int d[] = {};  // VALID EMPTY ARRAY
        d = new int[5];
        int n = 0;
        while(n<5){
            d[n] = n;
            System.out.println(d[n]);
            n++;
        }
        System.out.println("*************************");

    }


    // 2 Dimensional Array
    void twoDDarray(){

        // int [3][3]f; -- INVALID

        int [][]e;  // VALID
        e = new int[3][3];

        for(int i=0; i <e.length; i++){
            for(int j=0; j<e.length; j++){
                e[i][j] = i;
                System.out.print(e[i][j]);
            }
            System.out.println();
        }
        System.out.println("*************************");

        int f[][] = {}; // VALID
        int g[][];
        g = new int[5][5];
        for(int i=0; i <g.length; i++){
            for(int j=0; j<g.length; j++){
                g[i][j] = i;
                System.out.print(g[i][j]);
            }
            System.out.println();
        }
        System.out.println("*************************");
        int h[][] = {{1,2,3},{4,5,6},{7,8,9}}; // VALID
        int [][]k = {{1,2,3},{4,5,6},{7,8,9}}; // VALID

        for(int i=0; i <h.length; i++){
            for(int j=0; j<h[0].length; j++){
                System.out.print(h[i][j]);
            }
            System.out.println();
        }
        System.out.println("*************************");

        //  Creating and filling 2D array from user input
        int l[][] = {{}};
        l = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i <l.length; i++){
            for(int j=0; j<l[0].length; j++){
                System.out.println("Enter a number: ");
                int number = scanner.nextInt();
                l[i][j] = number;
            }
          }
        // Printing the 2 D array you created
        for(int i=0; i <l.length; i++){
            for(int j=0; j<l[0].length; j++){
                System.out.print(l[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("*************************");

        // Printing Lower Traingular matrix

        for(int i=0; i <l.length; i++){
            for(int j=0; j<l[0].length ; j++){
                if(i < j){
                    System.out.print(" ");
                }
                else {
                    System.out.print(l[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("*************************");


        System.out.println("*************************");

        // Printing Upper Traingular matrix
        for(int i=0; i <l.length; i++){
            for(int j=0; j<l[0].length; j++){
                if(i > j){
                    System.out.print(" ");
                }
                else {
                    System.out.print(l[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("*************************");


        // Printing diagonal elements
        for(int i=0; i <l.length; i++){
            for(int j=0; j<l[0].length; j++){
                if(i != j){
                    System.out.print(" ");
                }
                else {
                    System.out.print(l[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("*************************");

    }

}

class arrayPractice {
    public static void main(String[] args) {

    arraysTest t = new arraysTest();
    t.oneDArray();
    t.twoDDarray();

    }

}
