import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array");

        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements of array");

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Output of Array");

        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }

    }
}