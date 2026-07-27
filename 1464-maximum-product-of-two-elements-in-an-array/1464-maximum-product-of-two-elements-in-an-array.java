class Solution {
    public int maxProduct(int[] nums) {
        int ma1=Integer.MIN_VALUE;
        int ma2=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>ma1){
                ma2=ma1;
                ma1=num;
            }else if(num>ma2){
                ma2=num;
            }
        }
        return (ma1-1)*(ma2-1);
    }
}