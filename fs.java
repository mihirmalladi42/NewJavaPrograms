public class fs {
    public static void main(String[] args) {
        int[] nums = {5, 35, 63, 53, 3, 7, 3, 4};
        int[] numsAfter = new int[nums.length];
        int temporary = nums[0];
        for (int j = 0; j < nums.length; j++) {
            for (int i = j; i < nums.length; i++) {
                if (nums[i] < temporary) {
                    numsAfter[j] = temporary;
                    temporary = nums[i]; 
                }
            }
        }
        System.out.println(numsAfter[0]);
        
        System.out.println(numsAfter[1]);
        System.out.println(numsAfter[2]);
        System.out.println(numsAfter[3]);
        System.out.println(numsAfter[4]);
        System.out.println(numsAfter[5]);
        System.out.println(numsAfter[6]);
        System.out.println(numsAfter[7]);

    }
}
