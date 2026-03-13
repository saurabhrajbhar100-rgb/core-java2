public class average {
    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50};

        int size = arr.length;
        int sum=0;

        System.out.println("Size of array is: " + size);
        for(int i = 0; i < size; i++) {
            System.out.println(arr[i]);

              sum = sum + arr[i];
                }

        double average = (double)sum / size;

        System.out.println("Sum of array = " + sum);
        System.out.println("Average of array = " + average);
        }

    }


