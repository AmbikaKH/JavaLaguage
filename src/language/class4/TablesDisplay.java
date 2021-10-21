package language.class4;

public class TablesDisplay {
    int []numbers = {2,3,4,5,6,7,8,9};

    void multiplicationTables(){

        for( int n:numbers){
            for(int i=1; i<=10; i++){
                System.out.println(n + "*" + i + "=" + n*i);

            }
            System.out.println("\n");
        }

    }

}
