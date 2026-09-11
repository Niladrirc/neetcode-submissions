class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charFreqMap = new HashMap();

        if(s.length() != t.length()) return false;

        for (char c : s.toCharArray()) {
            charFreqMap.put(c, charFreqMap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            charFreqMap.put(c, charFreqMap.getOrDefault(c, 0) - 1);
        }

        for (int f : charFreqMap.values()) {
            if (f > 0) return false;
        }

        return true;
    }
}
