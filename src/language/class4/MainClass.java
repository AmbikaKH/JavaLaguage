package language.class4;

import language.class3.classObject;
import language.class3.sizeOfPrimitiveDataTypes;

public class MainClass {

    public static void main(String[] args) {

        //CLASS 2
        // Byte cannot hold value longer tha Byte size -126 to -127 (
        // It loops through and prints random value if we provide big number to Byte
        Variables vObj = new Variables();
        vObj.printByte();

        //CLASS 3

        //Printing char,float and double values
        charDoubleFloat cdfObj = new charDoubleFloat();
        cdfObj.printValues();

        //Size of primitive datatypes
        sizeOfPrimitiveDataTypes sopdObj = new sizeOfPrimitiveDataTypes();
        sopdObj.printSize();

        //classObject - object.java
        classObject obj = new classObject();
        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());
        System.out.println(obj.getClass().getSuperclass());

        //Object comparision using methods from Obects.java class
        Test t = new Test();
        Test t2 = t;
        System.out.println(t.equals(t2));
        System.out.println(t.hashCode());
        System.out.println(t2.hashCode());

        Test t3 = new Test();
        System.out.println(t.equals(t3));
        System.out.println(t.hashCode());
        System.out.println(t3.hashCode());

        //toString on object to get classname appended to hashcode in hexa
        System.out.println(t.toString());

        //Class 3 Assignment1 - Display number tables
        TablesDisplay mt = new TablesDisplay();
        mt.multiplicationTables();

        //Class 3 Assignment2 - Check prime or not
        primeNumberCheck pc = new primeNumberCheck();
        pc.primeCheck();

        //Class 3 Assignment3 - Is the number armstrong ?

        int number = 133;
        int sum = 0;
        int temp = number;

        while(temp>0){

            int digit = temp%10;
            //System.out.println(digit);
            sum += digit * digit * digit;
            temp = temp/10;
        }
        if(sum == number){
            System.out.println(number + " is armstrong number");
        }
        else
        {
            System.out.println(number + " is not an armstrong number");
        }

        //Class 3 Assignment3 - Check if number is palindrome or not
        int num = 1221;
        int tempv = num;
        int reverse = 0;
        while(tempv > 0){
            int digit = tempv%10;
            //System.out.println("digit: "+digit);
            reverse = digit + reverse*10;
            tempv = tempv/10;
            //System.out.println("temp: "+tempv);
        }
        if(reverse == num){
            System.out.println("Number "+ num + "is a plaindrome");
        }
        else{
            System.out.println("Number "+ num + "is a not a plaindrome");
        }

        //Class 3 Assignment5 - String functions
        String name = "ambika";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.toString());
        System.out.println(name.charAt(0));
        System.out.println(name.concat(" valagonda"));
        //System.out.println(name.getBytes(StandardCharsets.UTF_8));
        //System.out.println(name.codePointAt(3));

    }



}

