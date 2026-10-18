// 14. Longest Common Prefix
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int cnt = 0;
        Outer:
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length()||strs[j].charAt(i) != strs[0].charAt(i)){
                    break Outer;
                }
            }
            cnt++;
        }
        return strs[0].substring(0, cnt);
    }
}
