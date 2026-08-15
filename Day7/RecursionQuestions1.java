package Day7;

import java.util.*;

public class RecursionQuestions1 {
 
    static boolean checkSortedOrNot (ArrayList<Integer> nums) {
        if (nums.size() == 1) {
            return true;
        }
        return (nums.get(0) <= nums.get(1)) && checkSortedOrNot(new ArrayList<Integer>(nums.subList(1, nums.size())));
    }

    static int linearSearch (ArrayList<Integer> nums, int target, int index) {
        if (index == nums.size()) {
            return -1;
        }
        if (nums.get(index) == target) {
            return index;
        }
        return linearSearch(nums, target, index + 1);
    }

    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        //Check if the array is sorted or not?;
        // ArrayList<Integer>nums = new ArrayList<>();
        // for (int i = 0; i < 6; ++i) {
        //     nums.add(Scn.nextInt());
        // }
        // System.out.println(checkSortedOrNot(nums));

        //Linear search?;
        ArrayList<Integer>nums = new ArrayList<>();
        System.out.println("Enter the target:- ");
        int target = Scn.nextInt();
        for (int i = 0; i < 6; ++i) {
            System.out.println("Enter the "+ i + " element: ");
            nums.add(Scn.nextInt());
        }
        System.out.println("The element is found at index: " + linearSearch(nums, target, 0));

        //rotated binary search?.
    }

}
