
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
     // Edge case: if arr1 is null or empty, return arr2
     if (arr1 == null || arr1.length == 0) {
        return arr2;
    }
    
    // Edge case: if arr2 is null or empty, return arr1
    if (arr2 == null || arr2.length == 0) {
        return arr1;
    }
    
    // Calculate the length of the resulting array
    int combinedLength = arr1.length + arr2.length;
    
    // Create a new array to hold the combined elements
    int[] result = new int[combinedLength];
    
    // Copy elements from arr1 to result
    System.arraycopy(arr1, 0, result, 0, arr1.length);
    
    // Copy elements from arr2 to result, starting after the end of arr1
    System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
    
    return result;
}
}
