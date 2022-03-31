package CA1;

public class Q3 {
    public static void bubbleSort(int[] values) {
        boolean notSorted = true;
        while (notSorted) {
            notSorted= false;

            for(int i= 1; i< values.length; i++){

                if(values[i] < values[i - 1]){
                    int temp= values[i];
                    values[i]= values[i - 1];
                    values[i - 1]= temp;

                    notSorted=true;
                }
            }

            }
        }
    }

