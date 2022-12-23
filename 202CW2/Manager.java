/**
 * @author Juan
 *@version 3.0
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.w3c.dom.Node;

public class Manager extends Employee{

	private String name;
	private double pay;
	List<Employee> employees = new ArrayList<>();
	private int level =0;

	/**
	 * @param name
	 * @param pay
	 */
	public Manager(String name, double pay) {
		super(name, pay);
		this.name = name;
		this.pay = pay;
		employees = new ArrayList<Employee>();
	}

	/**
	 * this is adding an employee to employee list
	 * @throws Exception 
	 */
	public void add(Employee e) {
		this.employees.add(e);
		addLineManager(e);
	}

	/**
	 * @return the name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the pay.
	 */
	public double getPay() {
		return this.pay;
	}

	/**
	 * this is removing an employee from employee list
	 */
	public void remove(Employee e) {
		if (employees.isEmpty()) {
			throw new IllegalArgumentException("The list is empty and nothing to remove !");
		}else { 
			employees.remove(e);
		}
	}

	/**
	 * It calculates the total pay of the manager
	 * @param employeeIterator it is a list of employee..
	 * @param totalPay it is the total pay.
	 * @return returns the total pay.
	 */
	@Override
	public double calculateTotalPay() {
		double totalPay = this.pay;
		Iterator<Employee> employeeIterator = employees.iterator();
		while(employeeIterator.hasNext()){
			Employee employee = employeeIterator.next();
			totalPay = totalPay + employee.calculateTotalPay();
		} 
		return totalPay;  
	}

	/**
	 * this add a lineManager for an employee
	 * @param e
	 */
	public void addLineManager(Employee e) {
		e.lineManager = this;
		Employee emp = this;
		while(emp != null) {
			emp = emp.lineManager;
			level++;
		}
		if (level > 3) {
			throw new IllegalArgumentException("Manager Object can not be created because it excessed 4 levels !");
		}
	}

	/**
	 * it prints the information to console
	 */
	@Override
	public void print() {
		String indent = "  ";
		System.out.println(getName() + "; basic salary : " + getPay() +"; total pay : " + calculateTotalPay());
		Iterator<Employee> employeeIterator = employees.iterator();
		while(employeeIterator.hasNext()){
			Employee employee = employeeIterator.next();
			for(int i=0; i<=level; i++) {
				System.out.print(indent);
			}
			employee.print();
		}  

	}
}
