class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> group = new ArrayList<>();
        Map<String, List<String>> gm = new HashMap<>();

        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            if (gm.containsKey(String.valueOf(c))) {
                List<String> gp = gm.get(String.valueOf(c));
                gp.add(s);
            } else {
                gm.put(String.valueOf(c), new ArrayList<>(List.of(s)));
            }
        }

        for (List<String> col : gm.values()) {
            group.add(col);
        }

        return group;
    }
}
