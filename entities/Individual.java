package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;// Despesas de saúde

	public Individual() {
		super();
	}

	public Individual(String name, Double anuaullncome, Double healthExpenditures) {
		super(name, anuaullncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double result = 0.0;
		if(anuaullncome <= 200000.00) {
			result = (this.anuaullncome * 15) / 100;
			if(this.healthExpenditures > 0) {
				result = result - (this.healthExpenditures * 50) / 100;
			}
		}else if(anuaullncome > 200000.00) {
			result = (this.anuaullncome * 25) / 100;
			if(this.healthExpenditures > 0) {
				result = result - (this.healthExpenditures * 50) / 100;
			}
		}
		return result;
	}

}
