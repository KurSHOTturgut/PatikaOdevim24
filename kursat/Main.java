import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n, inp;
        
        System.out.print("Enter the dimension of your array: ");
        n = input.nextInt();
        
        int[] arr = new int[n];
        
        for (int i=0; i<n; i++) {
            System.out.print((i + 1) + ". item in the array: ");
            inp = input.nextInt();
            arr[i] = inp;
        }
        
        Arrays.sort(arr);
        
        for (int i=0; i<n; i++) {
            System.out.print("The Sorted Array: " + arr[i] + " ");
        }

    }
}