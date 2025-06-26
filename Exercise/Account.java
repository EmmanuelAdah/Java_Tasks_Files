public class Account {

	private String name; //Instance variable

	public Account(String name) { //Constructor that initializes the class name
	this.name = name;
	}

	public void setName(String name) { //Method to set name
	this.name = name;
	}

	public String getName() { //Method to get name
	return name;
	}
}