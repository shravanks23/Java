import java.util.Arrays;

public class Prblm1 {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Prblm1 obj = new Prblm1();

        int[] nums = {2,7,11,15};

        System.out.println(Arrays.toString(obj.twoSum(nums, 9)));
    }
}
//Logic is mine but didnt get output as needed so used chatgpt for this as i had to import stuff fromm leet code