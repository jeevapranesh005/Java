package Array_HandsOn2;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,32,5,12,1};
		int len = arr.length;
		
		for(int i=0;i<len;i++) {
			for(int j =0;j<len-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		
		for(int i : arr) {
			System.out.print(i+" ");
		}

	}

}
