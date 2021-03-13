package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[]array={9,7,11,2,22,66,7,6,99,33};
        int temp=0;
        for(int i=0; i<array.length;i++){
            for(int j=i;j>0;j--){
                if (array[j]<array[j-1]){
                    temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;


                }
            }
        }
    for(int n=0;n<array.length;n++){
        System.out.println(array[n]);
    }
    }
}
