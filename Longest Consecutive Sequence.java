//  Longest Consecutive Sequence - LC : 128
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int cnt =1, max = 1;
        Set<Integer> ans = new HashSet<>();
        //Pushing all the elements which are in nums into ans(HashSet).
        for(int i=0;i<nums.length;i++){
            ans.add(nums[i]);
        }

        //checking every number should exist or not.
        for(int n:ans){
            if(ans.contains(n-1)){
                continue;
            }
            else{
                cnt = 1;
            }
            while(ans.contains(n+1)){
                 cnt++;
                 n++;
            }
            max = Math.max(max, cnt);
        }
        return max;
    }
}
