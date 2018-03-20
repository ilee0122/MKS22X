

public class Merge{

    public static void mergesort(int[] data){
	int[] temp = new int[data.length()-1];
	msort(temp, data, 0, data.length() - 1);
    }

    public static void msort(int[] temp, int[] data, int start, int end){
	int lo = start;
	int hi = end;
	int mid = (lo + hi) / 2;

	for
	
	//base case if it's a single unit array --> ???
	if(lo + 1 == hi){
	    
	}

	//else, recursion
	msort(temp, data, lo, mid);
	msort(temp, data, mid + 1, hi);
    }

    public static void merge(){}



}
