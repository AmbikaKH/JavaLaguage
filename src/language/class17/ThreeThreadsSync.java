package language.class17;

class sequesnceGenerator{
    int number = 1;
    int numberOfThreads;
    int totalNumbersInSequence;

    public sequesnceGenerator(int numberOfThreads, int totalNumbersInSequence){
        this.numberOfThreads = numberOfThreads;
        this.totalNumbersInSequence = totalNumbersInSequence;

    }

    public void printNumbers(int result){

        synchronized (this) {
            while (number < totalNumbersInSequence - 1) {
                while (number % numberOfThreads != result) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + number++);
                notifyAll();
            }


        }

    }


}

class sequenceTask implements Runnable{

    private sequesnceGenerator sequesnceGenerator;
    private int result;

    public sequenceTask(sequesnceGenerator sequesnceGenerator, int result){
        super();
        this.sequesnceGenerator = sequesnceGenerator;
        this.result = result;
    }

    @Override
    public void run(){
        sequesnceGenerator.printNumbers(result);

    }
}

public class ThreeThreadsSync {
    private static final int TOTAL_NUMBER_IN_SEQUENCE = 9;
    private static final int TOTAL_NUMBER_THREADS = 3;

    public static void main(String[] args) {
        sequesnceGenerator sequesnceGenerator = new sequesnceGenerator(TOTAL_NUMBER_THREADS, TOTAL_NUMBER_IN_SEQUENCE);
        Thread t1 = new Thread(new sequenceTask(sequesnceGenerator, 1), "Thread-1");
        Thread t2 = new Thread(new sequenceTask(sequesnceGenerator, 2), "Thread-2");
        Thread t3 = new Thread(new sequenceTask(sequesnceGenerator, 0), "Thread-3");

        t1.start();
        t2.start();
        t3.start();


    }
}
