class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
            count.put(t.charAt(i), count.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int val : count.values()) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}

// TIME: O(n + 26) = O(n): second loop only ever runs at most 26 times. constants are dropped
// SPACE: O(1): Hash map can hold at most 26 keys