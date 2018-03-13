import java.util.*;

public class QuickSelect{


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
