public class maxSumSubarray {
    int maxSubarraySum(int[] arr) {
        int curntSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int temp=curntSum+arr[i];
            curntSum=temp<arr[i] ? arr[i] : temp;
            maxSum = maxSum<curntSum ? curntSum : maxSum;
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println("Maximum subarray sum : "+maxSubarraySum(arr));
    }
}