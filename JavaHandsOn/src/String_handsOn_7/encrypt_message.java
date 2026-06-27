package String_handsOn_7;
//question_4
public class encrypt_message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="x1 y";
		char ar[]=s1.toCharArray();
		for(int i =0;i<ar.length;i++) {
			if(ar[i]>='a' &&ar[i]<='z' ||ar[i]>='A' &&ar[i]<='Z') {
				char a=ar[i];
				int z=a;
				if(z>=120) {
					z=z-26;
				}
				System.out.print((char)(z+3));
			}
			else if(ar[i]>='0' &&ar[i]<='9') {
				System.out.print(ar[i]);
			}
			else if(ar[i]==' ') {
				System.out.print('_');
			}
		}
		
	
		
	}

}
