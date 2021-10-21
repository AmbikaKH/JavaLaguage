package language.class7;

public class MaxMinof1DArray{
    public int maxofArray(int a[]){

        int max = a[0];
        for(int i=0; i<a.length;i++){
            //System.out.println(a[i]);
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
    }

    public int minofArray(int a[]){


        int min = a[0];
        for(int i=0; i<a.length;i++){
            //System.out.println(a[i]);
            if(min > a[i]){
                min = a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        MaxMinof1DArray maxmin = new MaxMinof1DArray();
        int []a = {4,6,89,0,-20,5,-1,100};
        System.out.println("Max of array a[] is: "+maxmin.maxofArray(a));;
        System.out.println("Min of array a[] is: "+maxmin.minofArray(a));;
    }
}
