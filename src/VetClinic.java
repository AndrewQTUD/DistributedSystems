
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class VetClinic {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Customer> getCustomer() {
		return Customer;
	}

	public void setCustomer(List<Customer> customer) {
		Customer = customer;
	}

	@OneToMany
	private List<Customer> Customer = new ArrayList<Customer>();
	
	public VetClinic(List<Customer> customer) {
		super();
		Customer = customer;
	}
	
	@SuppressWarnings("unchecked")
	public void addCustomer(Customer customer) {
		((List<Customer>) customer).add(customer);
	}

	public VetClinic() {
		
	}

}
