package language.class7;



public class OddEven {

    public Results oddEvenNumber(int []a){
        Results re = new Results();

        int oddN[] = {};
        oddN = new int[a.length];
        int evenN[] = {};
        evenN = new int[a.length];

        int evenIndex = 0, oddIndex = 0;

        for(int i =0; i<a.length; i++){
            if(a[i] %2 == 0){
                evenN[evenIndex] = a[i];
                evenIndex++;
            }
            else{
                oddN[oddIndex] = a[i];
                oddIndex++;

            }
        }
        /*for(int i=0; i<oddIndex;i++){
            System.out.println("Odd Numbers are: " + oddN[i]);
        }
        System.out.println("******************************");
        for(int i=0; i<evenIndex;i++){
            System.out.println("Even Numbers are: " + evenN[i]);
        }*/
        re.setEvenNumbers(evenN, evenIndex);
        re.setOddNumbers(oddN, oddIndex);
        return re;
    }
    public static void main(String[] args) {

        int a[] = {2,4,5,7,8,20,30,45,65};
        OddEven oe = new OddEven();
        Results ro = oe.oddEvenNumber(a);

        // Print Odd Numbers
        System.out.println("Odd Number are:");
        for(int i=0; i<ro.oddI;i++){
            System.out.print(ro.getOddNumbers()[i]+" ");
            //System.out.print(ro.oddNumbers[i] + " ");
        }
        System.out.println();

        //Print Even NUmbers
        System.out.println("Even numbers are:");
        for(int i=0; i<ro.evenI;i++){
            System.out.print(ro.getEvenNumbers()[i] + " ");
            //System.out.print(ro.evenNumbers[i] + " ");
        }

    }
}
