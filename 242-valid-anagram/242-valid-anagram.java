class Solution {
    public boolean isAnagram(String s, String t) {
        
        // security check
        if(s.length() != t.length()) {
            return false;
        }
        
        // frequency array
        int[] counts = new int[26];
        
        for(int i=0; i<s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        
        // it should be zero - anagram
        for(int i: counts) {
            if(i != 0) {
                return false;
            }
        }
        
        return true;
    }
}