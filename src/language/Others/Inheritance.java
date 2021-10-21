package language.Others;

class Parent{

    public static void show(){
        System.out.println("I am in parent");
    }
}

class Child{

    private void show(){
        System.out.println("I am in child");
    }
    public void shownow(){
        show();
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.shownow();
        Parent.show();

    }
}
