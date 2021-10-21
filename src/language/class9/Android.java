package language.class9;

public abstract class Android implements Phone{

    public void call(){
        System.out.println("In Call");
    }
    public void camera(){
        System.out.println("In Camera");
    }
}

class Samsung extends Android{
    public void videoCall(){
        System.out.println("I am i video call");
    }
}





