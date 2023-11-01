package entities;

public abstract class TaxPayer { //Contribuinte
	
	private String name;
	protected Double anuaullncome; //receita anual
	
	public TaxPayer() {	
	}

	public TaxPayer(String name, Double anuaullncome) {
		this.name = name;
		this.anuaullncome = anuaullncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnuaullncome() {
		return anuaullncome;
	}

	public void setAnuaullncome(Double anuaullncome) {
		this.anuaullncome = anuaullncome;
	}
	
	public abstract double tax();//imposto

}
