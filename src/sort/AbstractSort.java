package sort;

import java.util.Date;
import sort.sort_types.ISortType;

public abstract class AbstractSort {

	protected ISortType sortBehavior;
	protected long period;
	protected int[] sortedArr;
	
	public void setSortBehavior(ISortType sb) {
		this.sortBehavior = sb;
	}
	
	public int[] performSort(int[] arr) {
		
		long start = new Date().getTime();

		sortedArr = sortBehavior.sort(arr);

		period = new Date().getTime() - start;
		
		return sortedArr;
	}
	
	public long getPeriod() {
		return period;
	}

	public int[] getSortedArr() {
		return sortedArr;
	}

/*    public static void main(String[] args) throws InterruptedException {           
		long start = new Date().getTime();
		Thread.sleep(1000);
		long period1 = new Date().getTime() - start;
		
		System.out.println(period1);
    }*/
}


