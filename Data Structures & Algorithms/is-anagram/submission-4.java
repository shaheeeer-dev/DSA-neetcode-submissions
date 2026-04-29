class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        Map<Character, Integer> s1 = new HashMap<>();
        Map<Character, Integer> t1 = new HashMap<>();

        for (int i = 0; i<s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            s1.put(c1, s1.getOrDefault(c1, 0) + 1);
            t1.put(c2, t1.getOrDefault(c2, 0) + 1);
        }
        if (s1.equals(t1)){
            return true;
        }
        return false;
    }
}
