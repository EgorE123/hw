import java.lang.reflect.Array;
import java.util.HashSet;

public class MainFindTwoIndex {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        int[] nums = {2, 7, 11, 15};
        int targetSum = 9;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length && i != j; j++) {
                if (nums[i] + nums[j] == targetSum) {
                    if (!hashSet.contains(i) && !hashSet.contains(j)) {
                        hashSet.add(i);
                        hashSet.add(j);
                    }
                }
            }
        }
        System.out.println(hashSet);
    }
}

                

            



