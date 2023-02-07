class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        for (int i = 0; i < heights.length; i++) {
            int maxpose = i;
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[maxpose] < heights[j]) {
                    maxpose = j;

                }
            }

            int temp1 = heights[maxpose];
            heights[maxpose] = heights[i];
            heights[i] = temp1;
            String temp = names[maxpose];
            names[maxpose] = names[i];
            names[i] = temp;
        }
        return names;
    }

}