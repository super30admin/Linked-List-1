class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]+k) && i!=map.get(nums[i]+k)){
                map.remove(nums[i]+k);
                count++;
            }
        }
        return count;
    }
}