class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int minCompLength = prefix.length();
        for (int i=1; i<strs.length; i++) {
            int compLength=Math.min(strs[i].length(), prefix.length());
            for (int j=0; j<compLength; j++) {
                if (strs[i].charAt(j) != prefix.charAt(j)) {
                    compLength = j;
                    break;
                }
            }
            minCompLength = Math.min(minCompLength, compLength);
        }
        if (minCompLength < 0) return "";
        return prefix.substring(0,minCompLength); 
    }
}