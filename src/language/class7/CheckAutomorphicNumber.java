package language.class7;

public class CheckAutomorphicNumber {

    public static void main(String[] args) {
        CheckAutomorphicNumber ca = new CheckAutomorphicNumber();
        if(ca.isAutomorphic() == true){
            System.out.println("Number is automorphic");
        }
        else{
            System.out.println("Number is not automorphic");
        }

    }
    boolean isAutomorphic(){

        int number = 25;
        int numSquare = number * number;
        System.out.println(numSquare);
        boolean isAutomorphic = true;
        while(number>0){

            if(number%10 != numSquare%10)
            {
                isAutomorphic = false;
            }
            number = number/10;
            numSquare = numSquare/10;

        }
        return  isAutomorphic;

    }
}
