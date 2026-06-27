package Array_HandsOn2;

public class MaxMin {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int arr[] = { 1, 4, 5, 3, 33, 6, 22 };

			int max = 0;
			int min = arr[0];

			for (int i = 0; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
				}
				if (min > arr[i]) {
					min = arr[i];
				}
			}

			System.out.println("max number is " + max);
			System.out.println("min number is " + min);

		}

	}


