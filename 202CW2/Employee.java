/**
 * @author Juan
 *@version 1.0
 */

public abstract class Employee {
	 private String name;
	 private double pay;
	 protected Employee lineManager;
//	public Manager lineManager;
	 /**
	  * this is a abstract method.
	  */
	 public abstract double calculateTotalPay();
	 
	 /**
	  * this is for adding employee
	  * @param e a specific employee to add
	 * @throws Exception 
	  */
	 public void add(Employee e) {}
	 
	 /**
	  * this is for removing employee
	  * @param e a specific employee to remove
	  */
	 public void remove(Employee e) {}
	 
	/**
	 * @param name
	 * @param pay
	 */
	public Employee(String name, double pay) {
		super();
		this.name = name;
		this.pay = pay;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the pay
	 */
	public double getPay() {
		return pay;
	}
	/**
	 * @param pay the pay to set
	 */
	public void setPay(double pay) {
		this.pay = pay;
	}
	
	/**
	 * @return the lineManager
	 */
	public Employee getLineManager() {
		return lineManager;
	}

	/**
	 * @param lineManager the lineManager to set
	 */
	public void setLineManager(Employee lineManager) {
		this.lineManager = lineManager;
	}

	/**
	  * this is a abstract class
	  */
	 public abstract void print();
	 
	

}
