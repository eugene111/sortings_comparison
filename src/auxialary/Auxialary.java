package auxialary;

public class Auxialary {

	public static String arrayToString(int[] arr) {
		StringBuffer stringBuffer = new StringBuffer();
		
		int lng = arr.length;
		
		for(int i=0; i<lng; i++) {
			stringBuffer.append(arr[i]);
			stringBuffer.append(" ");
		}
		
		return stringBuffer.toString();
	}

	public static int[] convertToIntArray(String arr ) {

		String[] items = arr.split(" ");
		
		int[] results = new int[items.length];
		
		for (int i = 0; i < items.length; i++) {
		    try {
		        results[i] = Integer.parseInt(items[i]);
		    } catch (NumberFormatException nfe) {
		        System.err.println("Incorrect numbers");
		        return null;
		    };
		}
		
		return results;
    }
	
	

}
