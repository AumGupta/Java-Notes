public class Q3 {
    public static boolean isPresent(int target, int arr[], int index){
        if (index >= arr.length) return false;
        if (arr[index] == target) return true;
        return isPresent(target, arr, ++index);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5};

        System.out.print(isPresent(6, arr, 0));
    }
}
