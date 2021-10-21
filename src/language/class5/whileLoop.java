package language.class5;

public class whileLoop {
    public static void main(String[] args) {
        /*int i=5;
        while(i>=0){
            System.out.println(i);
            i--;
        }*/
        // 12345
        // 12345
        // 12345
        int k=1, j = 1 ;
        while(k<=3){
            j=1;
            while(j<=4){
                System.out.print(j++);
            }
            System.out.println();
            k++;
        }


        // 1
        // 12
        // 123
        int k1=1, j1 = 1 ;
        while(k1<=3){
            j1=1;
            while(j1<=k1){
                System.out.print(j1++);
            }
            System.out.println();
            k1++;
        }

    }
}
