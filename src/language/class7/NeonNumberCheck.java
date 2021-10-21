package language.class7;

import language.class6.commandLineArguments;
import test.test;

class Test{

    void test(){
        System.out.println("I am in Test");
    }
}

public class NeonNumberCheck {

         boolean Neoncheck(){
            int number = 5;
            int numSquare = number * number;
            int sum = 0;
            while (numSquare > 0) {
                int digit = numSquare%10;
                sum = sum+digit;
                numSquare = numSquare/10;
            }
            if(sum == number){
                return true;
            }
            else{
                return false;
            }
        }

    public static void main(String[] args) {

        //System.out.println(Neoncheck()); //Valid Only if  Neoncheck() is static method
        NeonNumberCheck nn = new NeonNumberCheck();
        System.out.println(nn.Neoncheck());

        Test t = new Test(); //We can access class within same class no need of import since same class
        t.test();

        CheckAutomorphicNumber ca = new CheckAutomorphicNumber(); //We can access class within same package no need to import since its in same package class7
        System.out.println(ca.isAutomorphic());

        commandLineArguments obj = new commandLineArguments(); // We can access class within nested package using import
        obj.addNumbers(args); // addNumbers() needs to be public in order to access it

        test te = new test(); //We can access class using import
        te.printString(); // printString() needs to be public in order to access it

    }
}
