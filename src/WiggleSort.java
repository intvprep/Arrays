import java.util.Arrays;

public class WiggleSort {
	
	public static void main(String[] args) {
		int [] a = {3,5,2,1,6,4};
		wiggleSort3(a);
		System.out.println(Arrays.toString(a));
	}
    public static void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int i=1;
        for(i=1;i<nums.length;i=i+2){
            int tmp = nums[nums.length-1];
            int j=nums.length-1;
            while(j>=i){
                nums[j] = nums[j-1];
                j--;
            }
            nums[i]=tmp;
        }
        
    }
    
    public static void wiggleSort2(int[] nums) {
        for(int i=0;i<nums.length;i++)
            if(i%2==1){
               if(nums[i-1]>nums[i]) swap(nums, i);
            }else if(i!=0 && nums[i-1]<nums[i]) swap(nums, i);
    }
    public static void swap(int[] nums, int i){
          int tmp=nums[i];
          nums[i]=nums[i-1];
          nums[i-1]=tmp;
    }
    
    public static void wiggleSort3(int[] nums) {
        for (int i=1; i<nums.length; i++) {
            int a = nums[i-1];
            if ((i%2 == 1) == (a > nums[i])) {
                nums[i-1] = nums[i];
                nums[i] = a;
            }
        }
    }
}
