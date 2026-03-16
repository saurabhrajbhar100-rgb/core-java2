public class EvenOrOdd {

    public static void main(String[] args) {

        int []arr = {10,20,25,30,35,38,40};

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] % 2 == 0) {
                System.out.println(arr[i] + " Even");
            } else {
                System.out.println(arr[i] + " Odd");
            }

        }
    }
}
