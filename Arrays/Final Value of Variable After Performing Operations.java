class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int output=0;
        for(String value:operations)
        {
            if(value.equals("++X") || value.equals("X++"))
            {
                output = output + 1;
            }
            if(value.equals("--X") || value.equals("X--"))
            {
                output--;
            }
        }
        return output;
    }
}