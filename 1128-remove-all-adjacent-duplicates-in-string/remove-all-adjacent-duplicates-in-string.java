class Solution {
    public String removeDuplicates(String s) {
        char[] arr = s.toCharArray();
        int index = 0;

        for(int i = 0; i < arr.length; i++) {
            if(index > 0 && arr[index - 1] == arr[i]) {
                index--;
            }
            else {
                arr[index] = arr[i];
                index++;
            }
        }

        return new String(arr, 0, index);
    }
}