class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap();
        for (String s : strs) {
            int[] hashTable = new int[26];
            for (char c : s.toCharArray()) {
                hashTable[c-'a']++;
            }
            String hashedKey = Arrays.toString(hashTable);
            groups.putIfAbsent(hashedKey, new ArrayList<>());
            groups.get(hashedKey).add(s);
        }

        return new ArrayList<>(groups.values());
    }
}
