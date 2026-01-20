import java.util.Arrays;

public class leetcode {
    public static void main(String[] args) {
        int nums[]= {8,1,2,2,3};
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]) c++;
            }
            res[i]=c;
        }
        System.out.println(Arrays.toString(res));
    }
}
