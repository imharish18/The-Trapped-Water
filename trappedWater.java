import java.lang.reflect.Array;
import java.util.*;

public class trappedWater {
    static int trappedWater(int height[]){
        int[] rightMax = new int[height.length];
        int[] leftMax = new int[height.length];
        int[] trapHeight = new int[height.length];

        int max1 = 0;
        int max2= 0;
        int tarpQuantity = 0;

        for(int i=0; i<height.length; i++){
                max1 = Math.max(max1, height[i]);
                leftMax[i] = max1;
                max2 = Math.max(max2, height[height.length-1-i]);
                rightMax[height.length-1-i] = max2;
        }
        for(int i=0; i<height.length; i++){
            trapHeight[i] = Math.min(leftMax[i], rightMax[i]);
        }
        for(int i=0; i<height.length; i++){
            tarpQuantity+= trapHeight[i]-height[i];
        }
        return tarpQuantity;
    }
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int value = trappedWater(height);
        System.out.println("The Total water can be trapped in given data is "+value);
    }
}
