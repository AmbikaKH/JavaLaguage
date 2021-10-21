package language.class18;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "bbc";
        if(str1.length()  == str2.length()){

            char []arr =  str1.toCharArray();
            Arrays.sort(arr);
            char []arr2 = str2.toCharArray();
            Arrays.sort(arr2);
            boolean res = Arrays.equals(arr, arr2);
            //System.out.println("Res: "+ res);
            if(res == true){
                System.out.println("Srings are anagrams");
            }
            else{
                System.out.println("Strings are not anagrams");
            }

        }
        else{
            System.out.println("Strings are not anagrams");
        }
    }
}
