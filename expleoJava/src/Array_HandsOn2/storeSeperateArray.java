package Array_HandsOn2;

public class storeSeperateArray {
	public static void main(String[] args) {
		int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        // Store results in two separate arrays
        int evenArray[] = {evenSum};
        int oddArray[] = {oddSum};

        System.out.println("Even Sum Array:");
        for (int num : evenArray) {
            System.out.println(num);
        }

        System.out.println("Odd Sum Array:");
        for (int num : oddArray) {
            System.out.println(num);
        }
	}

}
