package mvc.models;

import java.util.Random;

import mvc.models.data_structures.SortingData;
import sort.Sort;
import sort.sort_types.*;

public class Model {

	private BubbleSortType bubbleSortType;
	private QuickSortType quickSortType;
	private HeapSortType heapSortType;
	
    private Sort sort;
	private int[] inpArr;
	private int randomArrayLng;
    
    public Model(){
    	sort = new Sort();
    	bubbleSortType = new BubbleSortType();
    	quickSortType = new QuickSortType();
    	heapSortType = new HeapSortType();
    }
    
	public void setInpArr(String inpText) {
		this.inpArr = auxialary.Auxialary.convertToIntArray(inpText);
	}


	private SortingData sortViaX(ISortType type) {	
		sort.setSortBehavior(type);
		int[] sortedArr = null;
		long period = 0;
		
		try{ 
			sortedArr = sort.performSort(inpArr);
			period = sort.getPeriod();
		} 
		catch(Exception ex ){
			System.err.println("An array is not specified!");
		}


		return new SortingData(type.getClass().getSimpleName(), period, sortedArr);
	}
	
	
    public SortingData sortViaBubbleSort() {
		return sortViaX(bubbleSortType);
	}
    
	public SortingData sortViaQuickSort() {
		return sortViaX(quickSortType);
	}
	
	public SortingData sortViaHeapSort() {
		return sortViaX(heapSortType);
	}
    
	public int[] generateRandomArray() {
		Random generator = new Random();

		int[] array = new int[randomArrayLng];
		
		int maxValue = randomArrayLng*3;
        for (int i=0; i<randomArrayLng; i++) {
            array[i] = generator.nextInt(maxValue);
        }
		return array;
	}

	public void setInpArr(int[] randomArr) {
		inpArr = randomArr;
	}

	public void setRandomArrayLng(int lng) {
		this.randomArrayLng = lng;
	}



}