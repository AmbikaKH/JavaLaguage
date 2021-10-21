package language.class17;

public class LinearSearch {

    public static void main(String[] args) {
        int searchI = 3;
        int []a = {1,3,4,5,6,7};
        for(int i =0; i<a.length; i++){
            if(a[i] == searchI){
                System.out.println("Found Value " + searchI +  " at Index " +  i);
            }
        }
    }
}
