package handsOn9;

import java.io.File;

public class chechFileExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File p=new File("D:\\Assessment2\\Assessment\\src\\assessment");
		if(p.exists())
			System.out.println("The file existed");
		else
			System.out.println("no");
	}

}
