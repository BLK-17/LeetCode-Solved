// 28. Find the Index of the First Occurrence in a String
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        for(int i=0;i<=haystack.length() - needle.length(); i++){

            boolean fnd = true;
            for(int j = 0;j<needle.length();j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    fnd = false;
                    break;
                }
            }
            if(fnd){ return i;}
        }
        return -1;
    }
}
