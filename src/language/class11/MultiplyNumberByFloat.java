package language.class11;
class mTest{

    int multiplyBy3Point5(int x){
        return (x<<1) + x + (x>>1);
    }
}

public class MultiplyNumberByFloat {

    public static void main(String[] args) {
        mTest m = new mTest();
        System.out.println(m.multiplyBy3Point5(3));

    }
}
