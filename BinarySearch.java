//import java.awt.List;
//
//public class BinarySearch {
//	
//	public static int myBinarySearch2(List<String> arrayList, String prefix) 
//	{
//	    int first = 0;
//	    int last = arrayList.size() - 1;
//	    int mid = 0;
//
//	    while (first <= last) {
//	        mid = (first + last) / 2;
//	        int c = prefix.compareTo(arrayList.get(mid));
//	        if (c > 0) {
//	            first = mid + 1;
//	        } else if (c == 0) {
//	            return mid;
//	        } else
//	            last = mid - 1;
//	    }
//	    return mid;
//	}
//
//}
