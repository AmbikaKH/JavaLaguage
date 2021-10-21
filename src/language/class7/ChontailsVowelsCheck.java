package language.class7;

public class ChontailsVowelsCheck {

    public static void main(String[] args) {
        String name = "Ambika";

        if(name.matches("[AEIOUaeiou]")){
            System.out.println("Name has Vowels");
        }
        else{
            System.out.println("No Vowels");
        }

    }
    public boolean isVowel(char c){
        if(c == 'A' || c=='E'){

        }
        return true;

    }
}
