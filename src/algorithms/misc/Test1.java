package algorithms.misc;

public class Test1 {
    public static void main(String args[]) {
        int[] nums={0,1,0,2,14};
    	int counter = 0;
        int length = nums.length;
        for(int j = 0;j<length;j++){
            if(nums[j]==0){
                counter++;
            }else {
                nums[j-counter]=nums[j];

            }
        }
        while(counter>0){
            nums[length-counter]=0;
            counter--;
        }
        for (int i : nums) {
			System.out.print(i+" ");
		}
    }
    
}