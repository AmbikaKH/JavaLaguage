package language.class14;

public class UniqueElementsInArray {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,6,6,7,7,9};
        int uniqueArray;

        uniqueArray = arr[0]^arr[1]^arr[2]^arr[3]^arr[4]^arr[5]^arr[6]^arr[7]^arr[8];

        System.out.println(uniqueArray);


    }
}
