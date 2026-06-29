class Solution {
    public int heightChecker(int[] heights) {
        int[] sortArray = heights.clone(); 
        Arrays.sort(sortArray);  ;
        int count= 0;
        for(int i = 0; i < heights.length ; i++) {
            if( sortArray[i] != heights[i]) {
                count++;
            }
        } 
        return count;
    }
}