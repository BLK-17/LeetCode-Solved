// Sub Array Sum equals K - LC : 560

class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, needed=0, cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        //for(int i=0;i<n;i++)
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            needed = sum - k;

            if(map.containsKey(needed)){
                cnt += map.get(needed);
            }
             map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}
