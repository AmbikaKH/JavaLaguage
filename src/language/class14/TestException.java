package language.class14;

import com.sun.org.apache.bcel.internal.generic.ATHROW;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class ETest{

    void test() throws Throwable {
        System.out.println("I am in ETest");
        if(4 == 8) {
            throw new Throwable("Error from Here");
        }
    }
}

public class TestException {

    public static void main(String[] args)  {

        try {
            ETest e = new ETest();
            e.test();
        }
        catch(Throwable e){
            System.out.println("Catch");
            e.printStackTrace();
            System.out.println("Catch Done");
        }
        finally{
            System.out.println("Done Done");
        }

    }


}
