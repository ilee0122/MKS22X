import java.util.*;

public class QuickSelect{

    public static int partition (int[] data, int start, int end){
	Random rand = new Random();

	//randomize
	int n = rand.nextInt(end - start + 1) + start;

	int pivot = data[n];
	swap (data, start, n);
	
	int s = start + 1;
	int e = end;
	
	while (s <= e) {
	    if (data[s] < pivot) {
		s++;
	    }
	    else if (data[s] > pivot) {
		swap(data, s, e);
		e--;
	    }
	}
	
	swap(data, start, e);
	return e;
    }

    public static void swap (int[] arr, int n, int m){
	int temp = arr[n];
	arr[n] = arr[m];
	arr[m] = temp;
    }

    public static String toString(int[] data){
	String str = "{";
	
	for (int i = 0; i < data.length; i ++){
	    str += data[i];
	    if (i < data.length -1){
		str += ", ";
	    }
	}
	
	str += "}";
	
	return str;
    }


}
