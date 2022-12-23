/**
 * @author Juan
 *@version 1.0
 */
public class DatabaseAdministrator extends Employee {
	private int dbsResponsible;

	/**
	 * This is constructor of the class 
	 */
	public DatabaseAdministrator(String name, double pay, int dbsResponsible) {
		super(name, pay);
		this.dbsResponsible = dbsResponsible;
	}

	/**
	 * It calculates the total pay of the employee
	 * @param payPerDbs it is a fixed pay for each database
	 * @param totalPay it is the total pay.
	 * @return returns the total pay.
	 */
	@Override
	public double calculateTotalPay() {
		final int payPerDbs = 1000;
		double totalPay = 0;
		totalPay = super.getPay() + payPerDbs * dbsResponsible;
		return totalPay;
	}

	/**
	 * @return the dbsResponsible
	 */
	public int getDbsResponsible() {
		return dbsResponsible;
	}

	/**
	 * @param dbsResponsible the dbsResponsible to set
	 */
	public void setDbsResponsible(int dbsResponsible) {
		this.dbsResponsible = dbsResponsible;
	}
	/**
	 * it prints the information to console
	 */
	@Override
	public void print() {
		System.out.println(this.getName() + "  " + "Basic salary £" + this.getPay() + "  " + "Total Pay £" + this.calculateTotalPay() + " Managed Databases : " + this.getDbsResponsible());
	} 

}
