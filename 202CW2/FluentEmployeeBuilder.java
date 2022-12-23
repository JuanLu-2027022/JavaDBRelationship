import java.util.ArrayList;

/**
 * @author Juan
 *
 */
public class FluentEmployeeBuilder{

	private String name;
	private double pay;
	Employee employee;
	Manager manager;
	private ArrayList<Employee> lineManagers = new ArrayList<>();
	private int level = 0;

	/**
	 * this adds a Database Administrator to its line manager
	 * @param name the name
	 * @param pay the pay
	 * @param dbResponsible the number of databases
	 */
	public void addDatabaseAdministrator(String name, double pay,  int dbResponsible) {
		employee = new DatabaseAdministrator(name, pay, dbResponsible);
		lineManagers.get(level).add(employee);
	}
	
	/**
	 * this adds a Software Engineer to its line manager
	 * @param name the name
	 * @param pay the pay
	 * @param title the title
	 */
	public void addSoftwareEngineer(String name, double pay, String title) {
		employee = new SoftwareEnigneer(name, pay, title);
	    lineManagers.get(level).add(employee);
	}
	/**
	 * this adds a manager to its line manager
	 * @param name the name
	 * @param pay the pay
	 */
	public void startManager(String name, double pay) {
		Employee newManager = new Manager(name, pay);
    	
		lineManagers.add(newManager);
	    level++;
	}
	/**
	 * this stops adding any more employee to its line manager
	 * 
	 */
	public void endManager() {
		
			if (level == 0) {
			throw new IllegalArgumentException ("Top manager can NOT have any line manager");
			}else {
				lineManagers.get(level-1).add(lineManagers.get(level));
				level--;
			}
	} 

	/**
	 * @param name the name
	 * @param pay the pay
	 */
	public FluentEmployeeBuilder(String name, double pay) {
		this.name = name;
		this.pay = pay;
		manager = new Manager(name, pay);
		lineManagers.add(manager);
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
	public FluentEmployeeBuilder setName(String name) {
		this.name = name;
		return this;
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
	public FluentEmployeeBuilder setPay(double pay) {
		this.pay = pay;
		return this;
	}

	public Employee build() {
		return manager;
	}

	public FluentEmployeeBuilder name(String name) {
		this.name = name;
		return this;
	}

	public FluentEmployeeBuilder pay(double pay) {
		this.pay = pay;
		return this;
	}     

}
