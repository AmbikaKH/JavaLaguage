package language.Others;

class ParentClass{
    int b;
    ParentClass(){
        System.out.println("I am in parent const");
    }
    ParentClass(int b){
        this.b = b;
        System.out.println("B: "+b);
    }
    void testParent(){
        System.out.println("parentMathos");
    }

}

class ChildClass extends  ParentClass{
    int a;
    ChildClass(int a){
        super(80);  // To call custom constructor in parent
        this.a = a;
    }
    void testChild(int a){
        //super.testParent();  // to call parent methods inside child class

        System.out.println("In Child class");
    }
}

public class SuperClassExample {

    public static void main(String[] args) {
        ChildClass c = new ChildClass(10);
        //Parent p = new Parent();

        c.testChild(10);
        c.testParent();
        //p.testParent();
    }
}
