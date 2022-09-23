package Arrays.ArraySortingAlgos;

public class test {
    public static void main(String[] args) {
        int[] arr = { 1, 4, -3, 0, 9 };
        int largestElem = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < arr[largestElem]){
                largestElem = i;
            }
        }

        System.out.println(arr[largestElem]);
    }
}
