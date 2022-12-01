class Solution {
    public int mostWordsFound(String[] sentences) {
        int maximum = 0;
        for(String s:sentences)
        {
            maximum =  Math.max(maximum,s.split(" ").length);
        }
        return maximum;
    }
}