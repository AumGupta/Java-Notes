public class Q1 {
    static int find15(int array[], int startIndex){
        if (startIndex >= array.length) return 0; 
        if (array[startIndex] == 15){
            return 1 + find15(array, ++startIndex);
        }
        return find15(array, ++startIndex);
    }

    public static void main(String[] args) {
        int a[] = {1,15,15,15,15,6};
        
        System.out.print(find15(a,0));
    }
}
