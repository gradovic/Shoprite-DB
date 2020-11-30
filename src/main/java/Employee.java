public class Employee {
	private int ID;
	private String name;
	private String job;


	public Employee(int ID, String name, String job){
		this.ID = ID;
		this.name = name;
		this.job = job;
	}

	public int getID(){
		return this.ID;
	}

	public void setID(int ID){
		this.ID = ID;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String password){
		this.name = name;
	}

	public String getJob(){
		return this.job;
	}

	public void setJob(String job){
		this.job = job;
	}

	@Override
	public String toString(){
		return "Employee #" + Integer.toString(this.ID) + ": " + this.name + " the " + this.job;
	}

}