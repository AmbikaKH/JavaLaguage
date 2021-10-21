package language.class7;

public class ReverseString {

    public String reverseStr(String str){
        String revStr = "";
        char[] out;
        out = new char[str.length()];
        char[] in = str.toCharArray();
        int j = 0;

        for(int i=in.length-1; i>=0; i--){
            out[j] = in[i];
            j++;
        }

        /*for(int i=0; i<out.length; i++){
            System.out.println(out[i]+ " ");
        }*/

        revStr = new String(out);
        return revStr;
    }

    public static void main(String[] args) {

        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseStr("Venky"));
    }
}
