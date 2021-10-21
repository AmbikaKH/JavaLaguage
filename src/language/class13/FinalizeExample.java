package language.class13;

class TestFinalize{

    /*public void m1(){

        finalize(); // Called as normal method
    }*/
    @Override
    protected void finalize(){
        //Gets called automatically when object is destroyed
        System.out.println("I am in finalize");
        System.out.println(10/0); // If JVM calls this will be ignored

    }
}
public class FinalizeExample {
    public static void main(String[] args) {
        TestFinalize t = new TestFinalize();
        //t.m1(); //If we call finalize() using m1 Exception is raised for 10/0 since its called as normal method.

        for(int i=0; i<Integer.MAX_VALUE; i++){
            TestFinalize tf = new TestFinalize();
        }


    }

}
