import java.util.*;
/**
*  Class to perform a binary search on an array.
*
*
*/
public class BinarySearch
{
	public static void main(String[] args)
	{
		
	ArrayList<Integer> data = new ArrayList<Integer>();
	data.add(12);
	data.add(25);
	data.add(35);
	data.add(45);
	data.add(58);
	data.add(67);
	data.add(77);
	data.add(80);
	data.add(84);
	data.add(93);
	
	binarySearch(data);
	}
/**
* Binary Search method
*/
	
public static void binarySearch(ArrayList<Integer> data)
{
	boolean found = false; int high = data.size() - 1;
	int low = 0; int pos = 0;
	
	while (low <= high && !found)
	{ 		
		for (int i = 0; i < data.size(); i++)
		{
			pos = (low + high) / 2;
			if ( data.get(pos) == 58 || data.get(pos) == 85)
				{found = true;}
			else if ( data.get(pos)<58 || data.get(pos) == 85)
				{low = pos + 1;}
			else
				{high = pos - 1;}
		
		System.out.println(data.get(i) + " False");

		} // end of for
	if (found)
		{System.out.println(data.get(pos) + " True");}
	} // end of while
   } // end of binarySearch
} // end of class
