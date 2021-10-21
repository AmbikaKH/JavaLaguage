package language.class7;

class Swap{

    void swapNumbers(int a, int b){
        a = a + b ;
        b = a - b;
        a = a - b;
        System.out.println("A is:" + a + " B is " + b);
    }

}

public class SwapNumbers {

    public static void main(String[] args) {
        Swap sw = new Swap();
        sw.swapNumbers(30, 40);

    }
}
