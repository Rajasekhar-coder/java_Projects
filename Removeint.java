import java.util.Arrays;

public class Removeint {

    public int[] removeeveninarr(int[] arr){
        int oddcount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                   oddcount++;
            }
        }
        int[] result = new int[oddcount];
        int idx =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }
    public static void main(String[] args){
          Removeint  obj = new Removeint();
          int[] arr = {1,4,2,3,6,7,8,9};
          System.out.println("Original array:"+Arrays.toString(arr));
          int[] resultarr = obj.removeeveninarr(arr);
          System.out.println("Array after removing even numbers:"+Arrays.toString(resultarr));

    }
}
