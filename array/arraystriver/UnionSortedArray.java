public class UnionSortedArray {
    public UnionSortedArray() {
    }
    public int[] unionArray(int[] nums1, int[] nums2) {
        int m=0,n=0,k=0;
        int[] array = new int[nums1.length+nums2.length];
        while(m<nums1.length || n<nums2.length) {
            int x = m<nums1.length ? nums1[m] : -1;
            int y = n<nums2.length ? nums2[n] : -1;
            if(x==-1) {
                array[k]=y;
                n++;
            } else if(y==-1) {
                array[k]=x;
                m++;
            } else if(x<y) {
                array[k]=nums1[m];
                m++;
            } else if(nums2[n]<nums1[m]) {
                array[k]=nums2[n];
                n++;
            } else {
                array[k]=nums1[m];
                m++;
                n++;
            }
            k++;
        }
        return array;
    }

}



// public class Main {
//     public static void main(String[] args) {
//         UnionSortedArray unionSortedArray = new UnionSortedArray();
//         int[] nums1 = {1, 2, 3, 4, 5};
//         int[] nums2 = {1, 2, 7};
//         int[] array = unionSortedArray.unionArray(nums1, nums2);
//         for(int i=0;i<array.length;i++) {
//             if(array[i]==0)
//                 System.out.print(array[i]+" ");
//         }
//     }
// }