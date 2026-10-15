//242. Valid Anagram

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> freq1 = new HashMap<>();
        HashMap<Character, Integer> freq2 = new HashMap<>();
        if(s.length() != t.length())    return false;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            freq1.put(c, freq1.getOrDefault(c,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            freq2.put(c, freq2.getOrDefault(c,0)+1);
        }
        if(freq1.equals(freq2)) return true;
        else return false;
    }
}
