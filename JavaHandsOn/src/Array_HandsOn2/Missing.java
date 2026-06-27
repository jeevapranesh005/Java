package Array_HandsOn2;

public class Missing {

    public static void main(String[] args) {

        // Example: 50 is missing
        int arr[] = new int[99];
        int index = 0;

        for (int i = 1; i <= 100; i++) {
            if (i != 50) {   // Assume 50 is missing
                arr[index++] = i;
            }
        }

        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        int expectedSum = (100 * 101) / 2;

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing Number is: " + missingNumber);
    }
}