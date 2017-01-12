package mvc.models.data_structures;

import auxialary.Auxialary;

public class SortingData {
	
	protected String sortType;
	protected long period;
	protected int[] sortedArr;
	protected String strArr;
	
	public SortingData(String sortType, long period, int[] sortedArr) {
		this.sortType = sortType;
		this.period = period;
		this.sortedArr = sortedArr;
		
		this.strArr = Auxialary.arrayToString(sortedArr);
	}

	public String getSortType() {
		return sortType;
	}

	public long getPeriod() {
		return period;
	}

	public int[] getSortedArr() {
		return sortedArr;
	}

	public String getStrArr() {
		return strArr;
	}

	
	
	
}
