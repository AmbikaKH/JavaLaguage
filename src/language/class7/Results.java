package language.class7;

public class Results {

    int oddNumbers[] = {};
    int evenNumbers[] = {};
    int oddI, evenI;


    public void setOddNumbers(int a[], int oddIndex){
        oddNumbers = a;
        oddI = oddIndex;
    }

    public void setEvenNumbers(int a[], int evenIndex){
        evenNumbers = a;
        evenI = evenIndex;
    }

    public int[] getOddNumbers(){
        return oddNumbers;
    }

    public int[] getEvenNumbers(){
        return evenNumbers;
    }
}
