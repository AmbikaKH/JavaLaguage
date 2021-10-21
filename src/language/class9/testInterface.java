package language.class9;

public class testInterface {

    public static void main(String[] args) {

        Samsung s = new Samsung();
        Android a = new Samsung();
        Phone p = new Samsung();
        p.call();
        a.camera();
        s.videoCall();

    }
}
