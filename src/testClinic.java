
public class testClinic {
	
	public testClinic() {
		ClinicDAO dao = new ClinicDAO();
		
		Pet Rusty = new Pet("Rusty", 6);
		dao.persistObject(Rusty);
		
		Customer john = new Customer("John", "2 wildrow", Rusty);
		
		dao.persistObject(john);
		
		VetClinic clinic = new VetClinic();
		clinic.addCustomer(john);
		dao.persistObject(clinic);
		
	}
		

	public static void main(String[] args) {
		new testClinic();

	}

}
