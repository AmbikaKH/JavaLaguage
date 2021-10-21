package language.class17;

public class DifferencePairs {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int diffCount = 0;
        int difference = 2;
try {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 1; j < arr.length; j++) {
            System.out.println("i:" + arr[i] + "j:" + arr[j]);
            if ((arr[j] - arr[i] == difference)) {
                diffCount++;
            }
        }
    }
}
catch(Exception e){
    e.printStackTrace();

}
        System.out.println("Diff Count: " + diffCount);
    }
}
