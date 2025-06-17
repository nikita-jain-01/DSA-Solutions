public class Main {
    public static void main(String[] args) {
        UnionSortedArray unionSortedArray = new UnionSortedArray();
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7};
        int[] array = unionSortedArray.unionArray(nums1, nums2);
        for(int i=0;i<array.length;i++) {
            if(array[i]==0)
                System.out.print(array[i]+" ");
        }
    }
}