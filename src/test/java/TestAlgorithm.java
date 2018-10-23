import com.wanghang.algorithm.ThreeSum;
import com.wanghang.algorithm.impl.ThreeSumBinarySearch;
import com.wanghang.algorithm.impl.ThreeSumImpl;

public class TestAlgorithm {

    public static void main(String[] args) {
        /*ThreeSum threeSum = new ThreeSumImpl();
        int arr[] = {1,0,-1,3,4};
        System.out.print(threeSum.count(arr));*/


        ThreeSum threeSum = new ThreeSumBinarySearch();
        int arr[] = {1,0,-1,3,4};
        System.out.print(threeSum.count(arr));


    }
}
