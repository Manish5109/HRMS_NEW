package serilizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {

	private static final long serialVersionUID = 5855629375964680567L;
	private int id;
	private String name;
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeObject(name);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.id = in.readInt();
		this.name = (String) in.readObject();

	}

}
