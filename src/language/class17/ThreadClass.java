package language.class17;

class sharedPrinter{

    //Boolean flag is to check whether odd number is printed or not
    boolean isOddPrinted = false;

    synchronized void printOdd(int number){

        while(isOddPrinted){
            try{
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();

            }
        }
        System.out.println("Odd Number is: "+number);
        isOddPrinted = true;
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        notify();

    }

    // Synchronized printEven() method to print even numbers.It is executed by EvenThread
    // First checks isOddPrinted
    // If isOddprinted is false, then it waits until next odd is printed by OddThread
    // If isOddprinted is true then it prints nect even number and sets isOddprinted to false
    // Sleeps for 1 sec before notifying
    synchronized void printEven(int number){

        while(!isOddPrinted){
            try{
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();

            }
        }
        System.out.println("Even Number is: "+number);
        isOddPrinted = false;
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        notify();

    }


}

class EvenThread implements Runnable{
    int num;
    sharedPrinter sp;
    EvenThread(int n, sharedPrinter s){
        this.num = n;
        this.sp = s;

    }
    @Override
    public void run(){
        int evenNumber = 2;  // First even number is 2

        while(evenNumber < num){
            sp.printEven(evenNumber);  // Calling printEven()method of sharedPrinter class
            evenNumber = evenNumber + 2; // Incrementing to next even number

        }

    }
}

class OddThread implements Runnable{
    int num;
    sharedPrinter sp;
    OddThread(int n, sharedPrinter s){
        this.num = n;
        this.sp = s;

    }
    @Override
    public void run(){
        int oddNumber = 1;  // First odd number is 1

        while(oddNumber < num){
            sp.printOdd(oddNumber);  // Calling printOdd()method of sharedPrinter class
            oddNumber = oddNumber + 2; // Incrementing to next odd number

        }

    }
}

public class ThreadClass {
    public static void main(String[] args) {
        sharedPrinter printer = new sharedPrinter();

        OddThread oddThread = new OddThread(20, printer);
        Thread oThread = new Thread(oddThread);
        oThread.setName("Odd Thread");

        EvenThread evenThread = new EvenThread(20, printer);
        Thread eThread = new Thread(evenThread);
        eThread.setName("Even Thread");

        oThread.start();
        eThread.start();

    }

}
