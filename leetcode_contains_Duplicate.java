import java.util.*;
public class leetcode_contains_Duplicate {
    public static void main(String[] args) {
        int nums[]={7,8,3,4,15,13,4,1};
        List<Integer> a=new ArrayList<>();
        for(int arr:nums) a.add(arr);
        Collections.sort(a);
        List<Double> averages=new ArrayList<>();
        int left=0,right=a.size()-1;
        while (left<right) {
            double avg=(a.get(left)+a.get(right))/2.0;
            averages.add(avg);
            left++;
            right--;
        }
        double min_averages=averages.get(0);
        for(double arr:averages){
            if(arr<min_averages) min_averages=arr;
        }
        System.out.println(min_averages);

}
}