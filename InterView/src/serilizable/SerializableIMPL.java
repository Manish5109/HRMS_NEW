package serilizable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableIMPL {

	public void seria() {
		try {
			Employee emp = new Employee();
			emp.setId(1000);
			emp.setName("abc");
			emp.setPassword("11111");
			// FileOutputStream fos = new FileOutputStream("data/info.txt");
			ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("data/info.txt"));
			obj.writeObject(emp);
			obj.flush();
			System.out.println("object write");
		} catch (Exception e) {

		}
	}

	public void deSeria() {
		try {

			ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/info.txt"));
			Employee emp = (Employee) in.readObject();
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getPassword());

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String args[]) {
		SerializableIMPL imple = new SerializableIMPL();
		// imple.seria();
		imple.deSeria();
	}
}
