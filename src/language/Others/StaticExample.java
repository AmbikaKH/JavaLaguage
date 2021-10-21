package language.Others;

public class StaticExample {

    static int a = 10;
    static void testF(){
        System.out.println("Hello testF");
    }
    static{
        int b =10;
        System.out.println("I am in static block");
    }

    static{
        System.out.println("Another static");
    }

    //Every instance
    {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        System.out.println("Inside main");
        StaticExample s = new StaticExample();
        StaticExample s1 = new StaticExample();
        //s.testF();
        StaticExample.testF();
    }
}


