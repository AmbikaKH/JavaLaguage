package language.class6;

class VariableArguments{
    int add2Numbers(int a, int b){
       return a+b;
    }

    int add3Numbers(int a, int b, int c){
        return a+b+c;
    }

    int addnNumbers(int a, int...nums){     //int addnNumbers(int...nums, int a) is invalid
        int sumValue = 0;
        sumValue = sumValue + a;
        for(int i:nums){
            sumValue = sumValue+i;
        }
        return sumValue;
    }

}
public class VarArgs {
    public static void main(String[] args) {
    VariableArguments obj = new VariableArguments();
    int sum1 = obj.add2Numbers(4,5);
    int sum2 = obj.add3Numbers(5,6,7);
    System.out.println(sum1+" "+sum2);
    int anySum = obj.addnNumbers(1,2,3,4,5,6);
    System.out.println("Any Sum: "+anySum);

    }

}
