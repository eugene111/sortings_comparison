package sort.sort_types;

import java.util.Arrays;

public class HeapSortType implements ISortType{

	@Override
	public int[] sort(int[] arr) {
		
		
		return executeSorting(arr);
	}

    public static void heap(int[] array, int size, int pos) {    
        while (2 * pos + 1 < size) {                       
            int t = 2 * pos + 1;                             
                                                           
            if (2 * pos + 2 < size && array[2 * pos + 1] < array[2 * pos + 2]) {
                t = 2 * pos + 2;
            }
            if (array[pos] < array[t]) {
                swap(array, pos, t);
                pos = t;
            } else {
                break;
            }
        }
    }


    public static int[] doHeap(int[] array) {  
        int n = array.length;                    
        for (int i = n - 1; i >= 0; i--) {
            heap(array, n, i);
        }
        return array;
    }

    public static int[] executeSorting(int[] array) { 
        int n = array.length;
        doHeap(array);
        while (n > 0) {
            swap(array, 0, n - 1);
            n--;
            heap(array, n, 0);
        }

        return array;
    }

    private static void swap(int[] array, int i, int j) { 
        int temp = array[i];                                   
        array[i] = array[j];                                
        array[j] = temp;                                    
    }
    
    public static void main(String[] args) {

    	int[] array = {5,1,7,5,8,10,500};

    	executeSorting(array); 
        System.out.println(Arrays.toString(array));

    }
}
