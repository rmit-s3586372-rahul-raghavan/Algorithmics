
/**
 * Implementation of SelectionSort.
 * 
 * @author jefcha
 */
public class SelectionSort extends SortAlgorithm
{
	
	/**
	 * Sort array.
	 * 
	 * @param array Array to be sorted.
	 */
    public void sort(int[] array) {
        // IMPLEMENT ME
		for (int i =0; i < array.length; i++) {
			int minVal = array[i];
			int minIndex = i;
			for(int j=i+1; j < array.length; j++) {
				if(array[j] < minVal) {
					minVal = array[j];
					minIndex = j;
				}
			}
			// Swap elements in array
			swap(array, i, minIndex);
		}
    } // end of sort()


} // end of class SelectionSort
