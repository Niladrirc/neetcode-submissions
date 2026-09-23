class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hash = new HashMap<>();

        for (String s : strs) {
            int[] table = new int[26];
            for (char c : s.toCharArray()) {
                table[c-'a']++;
            }
            String key = Arrays.toString(table);
            hash.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(hash.values());
    }
}
