package language.class16;

import java.util.concurrent.*;

class MyThread implements Callable {


    @Override
    public Integer call() throws Exception {
        //Blocking call , if this future call is not returned it will indefinitetly blocked
        Thread.sleep(10000);
        return 1;
    }
}

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        MyThread mt = new MyThread();
        FutureTask<Integer> ft = new FutureTask<>(mt);
        Thread thread = new Thread(ft);
        thread.start();
        /*while( ! ft.isDone()){
            System.out.println("I am waiting");
        }
        System.out.println(ft.get());*/
        // Below waits until it gets value from called method call()
        //System.out.println("Future task is complete !");

        System.out.println(ft.get(5, TimeUnit.SECONDS)); // This throws exception if we dont get return in  5 secs it will return exception

    }
}
