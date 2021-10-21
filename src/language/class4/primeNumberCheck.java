package language.class4;

public class primeNumberCheck {

    int number = 9;
    boolean isPrime = true;

    void primeCheck(){
        for(int i=2; i<number; i++) {
            if(number%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(number + " is prime number");
        }
        else{
            System.out.println(number + " is not a prime number");
        }
    }
 }

