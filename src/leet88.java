import java.util.Arrays;

public class leet88 {
    public static void main(String[] args) {


    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = m, j = 0; i < m+n ; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);

    }
}
