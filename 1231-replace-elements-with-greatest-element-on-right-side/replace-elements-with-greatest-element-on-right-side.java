class Solution {
    public int[] replaceElements(int[] arr) {
        int[] arrcopy = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            arrcopy[i] = arr[i];
        }
        int largest = -1;
        for(int i = arr.length - 1; i >= 0; i--)
        {
            arr[i] = largest;
            if(arrcopy[i] > largest)
            {
                largest = arrcopy[i];
            }
        }
        return arr;
    }
}