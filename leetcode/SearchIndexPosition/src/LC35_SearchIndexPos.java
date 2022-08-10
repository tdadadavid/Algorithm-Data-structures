package leetcode.SearchIndexPosition.src;

public class LC35_SearchIndexPos {

    // Time complexity = O(log n)
    // Space complexity = O(1)
    public int searchIndexPos(int[] nums , int target){
        int start = 0;
        int end  = nums.length - 1;
        int mid;

        while (start <= end){
            // get the middle index for each
            // iteration
            mid = ((start + end) / 2);

            // if the mid-element equals target
            if (nums[mid] == target)
                // return the index of the element(mid)
                return mid;
            // if the element is greater than target
            else if (nums[mid] > target)
                // shrink the search from this current element
                // downward (from index 0 to mid-1)
                end = mid - 1;
            // if the element is less than target
            else if (nums[mid] < target)
                // shrink the search from this current element
                // upward (from index mid + 1 to end)
                start = mid + 1;
        }

        return start;
    }

    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target) return mid;
            else if (nums[mid]<target) low=mid+1;
            else high = mid-1;
        }
        return low;
    }
}
