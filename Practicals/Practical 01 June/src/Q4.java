import java.util.Scanner;

class findMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER SIZE OF ARRAY : ");
        int n = sc.nextInt();

        int[] arr= new int[n];
        System.out.println("ENTER ELEMENTS OF ARRAY : ");
        for(int i = 0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Minimum(arr, arr.length - 1));
        sc.close();
        
    }
    public static int Minimum(int[] arr, int size) {
        if(size == 0)
        return arr[size];
        
        if (arr[size] < Minimum(arr, size-1) ) return arr[size];
        return Minimum(arr, size-1); 
    
    }
    // public static int Minimum(int[] arr, int size) {
    //     if(size == 0)
    //     return arr[size];
        
    //     return Math.min(arr[size], Minimum(arr, size-1));
    // }
}
