class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int x:nums1){
            set.add(x);
        }
        for(int y: nums2){
            if(set.contains(y))
            set2.add(y);
            
        }

        int[] ans = new int[set2.size()];
        
        int i = 0;
        for (int x : set2) {
            ans[i] = x;
            i++;
        }

        return ans;
    }
}