package language.class18;

import java.util.concurrent.*;

class RunnableTest implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": I am in Runnable");

    }
}

class CallableTest implements Callable{

    @Override
    public Integer call() throws Exception {
        System.out.println("I am in Callable");
        return 5;
    }
}

class RunnableTest2 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": I am in RunnableTest2");
    }
}

public class ExecutionService {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //ExecutorService executionService = Executors.newSingleThreadExecutor();
        //ExecutorService executionService = Executors.newCachedThreadPool();
        //ExecutorService executionService = Executors.newFixedThreadPool(3);
        //ExecutorService executionService1 = Executors.newFixedThreadPool(2);
        System.out.println("Before starting thread");
        ScheduledExecutorService executionService = Executors.newScheduledThreadPool(5);
        executionService.schedule(new RunnableTest(), 20 , TimeUnit.SECONDS);

        /*executionService.submit(new RunnableTest());
        executionService.submit(new RunnableTest());
        executionService.submit(new RunnableTest());
        executionService1.submit(new RunnableTest());
        executionService.submit(new RunnableTest2());
        Future res =  executionService.submit(new CallableTest());
        System.out.println("Result of callable: "+res.get());*/
        executionService.shutdown();
        //executionService1.shutdown();
    }

}
