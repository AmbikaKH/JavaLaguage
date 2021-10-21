package language.class17;

import java.util.Locale;

public class FindVowels {
    
    
    public static void main(String[] args) {
        String sentence = "My name is Ambika";
        System.out.println(sentence);
        sentence = sentence.toLowerCase();
        System.out.println(sentence);
        int count = 0 ;
        for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u'){
                    count++;
            }
        }

        System.out.println("Vowels Count: " + count);

        
    }
}
