package language.class13;

//Creating thread by extending Thread class
// Leads to multiple inheritance and we cannot extend other class
class Test extends Thread{
    public void run(){

        System.out.println("I am in Thread run");
    }

}

// Creating thread by implementing Runnable Interface - Better to use this
class ThreadClass implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(" Inside first " + i);
        }


    }
}
public class ThreadExample {

    public static void main(String[] args) {
        // First Method - Thread by extending Thread class
        /*Test t = new Test();
        t.start();*/

        ThreadGroup tg = new ThreadGroup("My Thread Group");

        //Second method - By implementing Runnable Interface
        ThreadClass tc = new ThreadClass();
        Thread tn = new Thread(tg, tc);
        tn.setName("Main Runnable first thread");
        tn.start();
        //tn.run(); //This is not thread, its normal function call

        ThreadClass tc2 = new ThreadClass();
        Thread tn2 = new Thread(tg, tc2);
        tn2.setName("Main Runnable second thread");
        tn2.start();

        //tn2.run();//This is not thread, its normal function call
        System.out.println("Main thread");

        System.out.println(" ******************************************** ");


        Thread1 t1 = new Thread1();
        Thread tt1 = new Thread(tg, t1);
        tt1.setName("Thread from Thread1 class");
        tt1.start();

        Thread2 t2 = new Thread2();
        Thread tt2 = new Thread(tg, t2);
        tt2.setName("Thread from Thread2 Class");
        tt2.start();

        System.out.println(tg.getName());
        System.out.println(tg.activeCount());
        tg.list();

    }


}
