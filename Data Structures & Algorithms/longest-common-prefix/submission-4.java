class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int i = 0;
        while (i<Math.min(first.length(), last.length())) {
            if (first.charAt(i) != last.charAt(i)) break;
            i++;
        }
        if (first == null || first.isEmpty() || (i == 0 && first.charAt(i) != last.charAt(i))) return "";
        return first.substring(0,i);
    }
}