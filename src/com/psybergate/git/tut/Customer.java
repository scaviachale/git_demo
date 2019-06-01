public class Customer{
	private String name;
	private Date dob;
	private int custNum;
	
	public Customer(String name, Date dob, int custNum){
		this.name = name;
		this.dob = dob;
		this.custNum = custNum;
	}
	
	public String toString(){
		return name + dob + custNum;
	}
}
