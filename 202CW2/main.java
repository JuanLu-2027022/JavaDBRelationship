/**
 * 
 */

/**
 * @author Juan
 *
 */
public class main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) {
		
		//this is a test for Part 1
/*		Manager generalManager=new Manager("generalManager", 50000);
		Employee EngineeringManager=new Manager("EngineeringManager",45000);
		Employee DatabaseManager=new Manager("DatabaseManager",45000);
		
		Employee se1=new SoftwareEnigneer("SoftwareEnigneer 1", 20000, "SWE2");
		Employee se2=new SoftwareEnigneer("SoftwareEnigneer 2", 30000, "Senior SWE");
		Employee se3=new SoftwareEnigneer("SoftwareEnigneer 3", 25000, "Principle Engineer");
		
		EngineeringManager.add(se1);
		EngineeringManager.add(se2);
		EngineeringManager.add(se3);
		
		Employee dba1=new DatabaseAdministrator("DatabaseAdministrator 1", 20000, 1);
		Employee dba2=new DatabaseAdministrator("DatabaseAdministrator 2", 30000, 3);
		DatabaseManager.add(dba1);
		DatabaseManager.add(dba2);

		generalManager.add(EngineeringManager);
		generalManager.add(DatabaseManager);
		generalManager.print();   */

        // this is the test for Part 3.1
/*		EmployeeBuilder builder = new EmployeeBuilder("Billy Gates", 100000.00);
		builder.addSoftwareEngineer("Timmy", 30000.00, "SWE2");
		builder.startManager("Alice", 50000.00);
		builder.addDatabaseAdministrator("Tony", 20000.00, 0);
		builder.startManager("Rosie", 40000.00);
		builder.addDatabaseAdministrator("Ronald", 30000.00, 1);
		builder.endManager();
		builder.endManager();
		builder.addSoftwareEngineer("Sally", 30000.00, "Senior SWE");
		
		Employee billy = builder.build();
		billy.print();  */
		
		 // this is the test for Part 3.2
		FluentEmployeeBuilder builder = new FluentEmployeeBuilder("Billy Gates", 100000.00);
		builder.addSoftwareEngineer("Timmy", 30000.00, "SWE2");
		builder.startManager("Alice", 50000.00);
		builder.addDatabaseAdministrator("Tony", 20000.00, 0);
		builder.startManager("Rosie", 40000.00);
		builder.addDatabaseAdministrator("Ronald", 30000.00, 1);
		builder.endManager();
		builder.endManager();
		builder.addSoftwareEngineer("Sally", 30000.00, "Senior SWE");
		
		Employee billy = builder.build();
		billy.print();  
	}

}
