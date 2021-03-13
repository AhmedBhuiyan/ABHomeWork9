package sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array={99,44,3,66,45,9,5,11};
        for(int i=0;i< array.length;i++){
            int index=i;
            for(int j=i+1;j<array.length;j++)
                if (array[j]<array[index])
                    index=j;
                    int smallestnumbersofar=array[index];
                    array[index]=array[i];
                    array[i]=smallestnumbersofar;





        }
        for(int n=0;n<array.length;n++){
            System.out.println(array[n]);
        }
    }
}
