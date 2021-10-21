package language.class7;

public class SumArrayElements {

    public static int sumofAllarrayelemnts(){
        // Sum of 1D array elements
        int []a = {1,2,3,4,5,6,7};  //VALID
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum = sum + a[i];
        }
        return sum;
    }

    // Sum of elements of 2D array
    public static int sumofAll2Darrayelemnts(){
        // Sum of 1D array elements
        int [][]a = {{1,2,3},{4,5,6},{7,8,9}};  //VALID
        int sum = 0;
        for(int i=0; i<a.length; i++){
            for(int j=0;j<a[0].length; j++){
                sum = sum + a[i][j];
            }

        }
        return sum;
    }


    //Sum of 2 matrix arrays
    public static void arrayAddition(){

        //int [][]a = {{1,2,3},{4,5,6},{7,8,9}};  //VALID
        //int [][]b = {{1,2,3},{4,5,6},{7,8,9}}; //VALID

        //int [3][3]a; // INVALID
        //int [3][3]b; // INVALID

        //int a[3][3]; // INVALID
        //int b[3][3]; // INVALID

        /*int a[][] = {{}}; //VALID
        a = new int[3][3];//VALID

        int b[][] = {{}}; //VALID
        b = new int[3][3];//VALID*/

      /*  int a[][];    //VALID
        a = new int[3][3]; //VALID

        int b[][];    //VALID
        b = new int[3][3]; //VALID*/

        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};  //VALID
        int b[][] = {{1,2,3},{4,5,6},{7,8,9}}; //VALID
        int c[][] = {{1,2,3},{4,5,6},{7,8,9}}; //VALID
        for(int i = 0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        //Print sum of arrays
        for(int i = 0; i<c.length; i++){
            for(int j=0; j<c[0].length; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {

        //SumArrayElements a = new SumArrayElements(); //arrayAddition() is static no need to create object
        //a.arrayAddition();
        arrayAddition();

        System.out.println(sumofAllarrayelemnts());

        System.out.println(sumofAll2Darrayelemnts());


    }


}
