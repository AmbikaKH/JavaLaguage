package language.class18;

public class Angram2 {
    private static int CHARACTER_COUNT = 256;


    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "bbc";
        int count[] = new int[CHARACTER_COUNT];

        if(str1.length() != str2.length()){
            System.out.println("Strings are not anagrams");
            //return false;
        }

        for(int i=0; i<str1.length();i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for(int i=0; i<CHARACTER_COUNT;i++){
            if(count[i] != 0){
                System.out.println("String are not Anaaagrams");
                //return false;
            }
        }
        System.out.println("Strings are anagrams");
        //return true;


    }
}
