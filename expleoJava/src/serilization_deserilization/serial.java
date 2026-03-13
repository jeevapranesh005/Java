package serilization_deserilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class serial {
	public static void main(String[] args) {
		Employee obj = new Employee(1,"jeeva");
		String filename= "file.ser";
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(obj);
			out.close();
			file.close();
			System.out.println("object has be serilizaed");
		}catch(IOException e) {
			System.out.println("IOException "+e);
		}
		//------------------
		Employee object  = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			object = (Employee)in.readObject();
			in.close();
			file.close();
			System.out.println("Deserilazation");
			System.out.println("employeeid "+obj.id + " name "+obj.name);
		}catch(IOException e) {
			System.out.println("is catch");
		}catch(ClassNotFoundException ex) {
			System.out.println("class not found");
		}
	}
}
