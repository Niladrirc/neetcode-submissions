class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sStr = s.toCharArray();
        char[] tStr = t.toCharArray();
        Arrays.sort(sStr);
        Arrays.sort(tStr);
        return Arrays.toString(sStr).equals(Arrays.toString(tStr));      
    }
}
