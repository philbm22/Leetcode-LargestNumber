import java.util.Arrays;

public class LargestNumberImplementation {
    public static String LargestNumber(int[] nums) {
        String[] stringNums = new String[nums.length];

        for(int i = 0; i < nums.length; i++) {
            stringNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(stringNums, (a,b) -> (b+a).compareTo(a+b));

        if(stringNums[0].equals("0")) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < stringNums.length; i++) {
            result.append(stringNums[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int [] nums = new int[]{3,30,34,5,9};
        System.out.println(LargestNumber(nums));
    }
}
