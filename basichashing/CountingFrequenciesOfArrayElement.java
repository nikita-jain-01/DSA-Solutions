package dsa.preparation.basichashing;

public class CountingFrequenciesOfArrayElement {
    public static void frequencyCount(int arr[], int N, int P)
    {
        int[] array=new int[P+1];
        for(int i=0;i<N;i++) {
            array[arr[i]]++;
        }
        for(int i=0;i<N;i++) {
            if(i>=P)
                arr[i]=0;
            else
                arr[i]=array[i+1];
        }
    }
}
