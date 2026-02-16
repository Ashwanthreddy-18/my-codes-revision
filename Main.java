import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }
            for (int k = i + 1; k < n; k++) {
                rightSum += nums[k];
            }
            int diff = leftSum - rightSum;
            if (diff < 0) {
                diff = -diff;
            }
            answer[i] = diff;
        }
        System.out.println(Arrays.toString(answer));
        input.close();
    }
}
