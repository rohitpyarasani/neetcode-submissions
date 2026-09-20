class Solution {
    public boolean hasDuplicate(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]) return true;
        //     } 
        // }
        // return false;

        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        if(set.size() != nums.length) return true;
        return false;
    }
}