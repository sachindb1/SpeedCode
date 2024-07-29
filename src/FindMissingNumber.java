public class FindMissingNumber {
    public static void main(String[] args) {

        int[] nums = {1,2,4,5};
        System.out.println(findMissingNumber(nums));
    }
public static int findMissingNumber(int[] nums) {
        int n = nums.length +1;
        int sum = (n*(n+1))/2;
        for (int num:nums){
            sum-=num;
        }
        return sum;
}


}
