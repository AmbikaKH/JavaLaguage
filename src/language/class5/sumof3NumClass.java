package language.class5;

class TestClass{
    int a, b, c;
    TestClass(int x, int y, int z){
        this.a = x;
        this.b = y;
        this.c = z;
    }
    private int addNumbers(int a, int b, int c){
        return a+b+c;
    }

    public int sum(){
        int sumValue = addNumbers(a,b,c);
        return  sumValue;

    }
}

public class sumof3NumClass {

    public static void main(String[] args) {
        TestClass t = new TestClass(3,3,3);
        //System.out.println(t.addNumbers(1,2,3));
        System.out.println(t.sum());

    }
}