import java.util.*;
class inpExpOut {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int[] nums;
        for(int i=0;i<t;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int exp = 1;
            nums = new int[n];
            nums[0] = a + b;
            System.out.print(nums[0] + " ");
            for (int j = 1; j < n; j++) {
                exp *= 2;
                nums[j] = nums[j-1] + exp*b;
                System.out.print(nums[j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
