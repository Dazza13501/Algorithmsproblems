package Lab6;

public class MyArrays {
    public static void selectionSort(int[] a) {
        //sorting in ascending order
        for (int i = 0; i <= a.length - 2; i++) {
            //find index such that a[index] is the smallest of a[i]..a[a.length-1]
            int index = i;
            int smallest = a[i];
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[j] < smallest) {
                    smallest = a[j];
                    index = j;
                }
            }
            //if index != i, swap a[index] and a[i].
            if (index != i) {
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
        }
    }
    public static void insertionSort(int[] a){

        for (int index=1; index<= a.length - 1; index++){
            int val = a[index];
            int j= index - 1;
            while (j >= 0  && a[j] > val){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = val;
        }
    }

   /* public static void binarySearch(int[] a, int first, int last, int val){

        int mid= (first+last)/2;
        while( first <= last ){
            if ( a[mid] < val ){
                first = mid + 1;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }

    }
}*/
    public static void binarySearch(int[] a, int key){

     int l=0;
     int r= a.length-1;
     boolean found= false;
     while(!found && l<=r){
         int m = (l+r)/2;
         if(key == a[m]){
             found= true;
         }
         else if(key < a[m]){
             r= m-1;
         }
         else{
             l= m+1;
         }

     }
     /*if (found)
     {
         return m;
     }
     else{
         return -1;
     }*/
    }
}


