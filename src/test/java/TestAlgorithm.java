import com.wanghang.algorithm.ThreeSum;
import com.wanghang.algorithm.TwoSum;
import com.wanghang.algorithm.impl.ThreeSumBinarySearch;
import com.wanghang.algorithm.impl.ThreeSumImpl;
import com.wanghang.algorithm.impl.TwoSumImpl;

public class TestAlgorithm {

    public static void main(String[] args) {
        /*ThreeSum threeSum = new ThreeSumImpl();
        int arr[] = {1,0,-1,3,4};
        System.out.print(threeSum.count(arr));*/


       /* ThreeSum threeSum = new ThreeSumBinarySearch();
        int arr[] = {1,0,-1,3,4};
        System.out.print(threeSum.count(arr));*/

        TwoSum twoSum = new TwoSumImpl();
        int arr[] = {-1,0,2,5,-1};
        int result[] = twoSum.count(arr,7);
        for(int i =0;i < result.length;i++){
            System.out.print(result[i] + ",");
        }


    }
}
