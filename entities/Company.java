package entities;

public class Company extends TaxPayer{

	
	private Integer numberOfEmployees; //número de empregados
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anuaullncome, Integer numberOfEmployees) {
		super(name, anuaullncome);
		this.numberOfEmployees = numberOfEmployees;
	}


	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		Double result = 0.0;
		if(this.numberOfEmployees >= 10) {
			result = (this.anuaullncome * 14) / 100;
		}else if(this.numberOfEmployees < 10) {
			result = (this.anuaullncome * 16) / 100;
		}
		return result;
	}
	
	
}
