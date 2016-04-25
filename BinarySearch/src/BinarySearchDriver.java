
public class BinarySearchDriver {
	
	public static void main(String[] args)
	{
		int[] sortedDate = {7, 66,77,99,100,120,130,144};
		
		System.out.println(binarySearch(sortedDate,130));
		
	}
	
	public static int binarySearch(int [] sortedData, int valueTobeSearched)
	{
		
		int low = 0;
		int high = sortedData.length;
		
		while (low <= high) {
			
		 int midindex = low + (high -low)/2;
		 
		 System.out.println("midIndex:"+midindex);
		 
		    if(sortedData[midindex] == valueTobeSearched)
		    {
		    	return midindex;
		    }
		    else 
			if(sortedData[midindex] < valueTobeSearched)
			{
				  low =  midindex +1;
				
			}
			else
			{
				 high = midindex -1; 
			}
		
			
		}
		
		return -1;
	}

}
