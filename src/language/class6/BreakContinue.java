package language.class6;

public class BreakContinue {
    public static void main(String[] args) {
        for(int i=0; i<9;i++){
            if(i == 5){
                break;
                //continue;
            }
            System.out.println(i);
        }
    }
}
