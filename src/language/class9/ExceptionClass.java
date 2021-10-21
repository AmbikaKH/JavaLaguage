package language.class9;

public class ExceptionClass {
    public static void main(String[] args) {
        try{
        System.out.println(10/0);}
        /*catch(Exception e){
            e.printStackTrace();

        }*/
        finally {
            System.out.println("Finally");
        }
        System.out.println("I am done");
    }
}
