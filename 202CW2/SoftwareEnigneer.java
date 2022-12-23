/**
 * @author Juan
 *@version 1.0
 */
public class SoftwareEnigneer extends Employee {
	private String title;

	/**
	 * this is constructor of the class with 3 variables.
	 */
	public SoftwareEnigneer(String name, double pay, String title) {
		super(name, pay);
		this.title = title;
		
	}

	/**
	 * It calculates the total pay of the employee
	 * @param MULTIPLIER it is a fixed number for different title.
	 * @param BONUS it is a fixed number for  different title.
	 * @param totalPay it is the total pay.
	 * @return returns the total pay.
	 */
	@Override
	public double calculateTotalPay() {
		
		final Double[] MULTIPLIER = {1.0, 1.5, 2.0};
		final Double[] BONUS = {5000.00, 20000.00, 50000.00};
		double totalPay = 0;

		switch(title) {
		case "SWE2":
			totalPay = BONUS[0] + super.getPay() *  MULTIPLIER[0];
			break;
		case "Senior SWE":
			totalPay = BONUS[1] + super.getPay() *  MULTIPLIER[1];
			break;
		case "Principle Engineer":
			totalPay = BONUS[2] + super.getPay() *  MULTIPLIER[2];
			break;
		}
		return totalPay;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	  * it prints the information to console
	  */
	@Override
	public void print() {
		System.out.println(this.getName() + "  " + "Basic salary £" + this.getPay() + "  " + "Total Pay £" + this.calculateTotalPay() + "  " + this.getTitle());
		
	} 

}
