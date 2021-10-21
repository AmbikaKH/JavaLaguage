package language.class5;

public class forLoop {
    public static void main(String[] args) {
        //Printing 100 times
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.println("Hello");
            }
        }

        //print 5x5 * rows
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //print
        // 11111
        // 22222
        // 44444
        // 55555
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        //print
        // 12345
        // 12345
        // 12345
        // 12345
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //print
        // 12345
        // 678910
        // 1112131415
        // 1617181920
        // 2121232425
        int k=1;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5;j++){
                System.out.print(k++);
            }
            System.out.println();
        }
        //print
        // 1
        // 12
        // 123
        // 1234
        // 12345

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //print
        // *
        // **
        // ***
        // ****
        // *****

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //print
        // 12345
        // 1234
        // 123
        // 12
        // 1
        int k1 = 1;
        for(int i=5; i>0; i--){
            k1 = 1;
            for(int j=i; j>0;j--){
                System.out.print(k1++);
            }
            System.out.println();
        }

        //print ASSIGNMENT 1
        //      1
        //     12
        //    123
        //   1234
        //  12345

        for(int i=1; i<=5; i++){
            for(int k2=1; k2<=(5-i); k2++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //print ASSIGNMENT 2
        // 1
        // 12
        // 123
        // 1234
        // 12345
        // 1234
        // 123
        // 12
        // 1
        int k3=1;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=4; i>0; i--){
            k3 = 1;
            for(int j=i; j>0;j--){
                System.out.print(k3++);
            }
            System.out.println();
        }

    }
}
