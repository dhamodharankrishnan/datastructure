package linkedlist;

public class PolExpr implements Comparable<PolExpr> {

	private int coeff;
	private int power;
	
	public int getCoeff() {
		return coeff;
	}
	public void setCoeff(int coeff) {
		this.coeff = coeff;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public PolExpr(int coeff, int power) {
		super();
		this.coeff = coeff;
		this.power = power;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + coeff;
		result = prime * result + power;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PolExpr other = (PolExpr) obj;
		if (coeff != other.coeff)
			return false;
		if (power != other.power)
			return false;
		return true;
	}
	public int compareTo(PolExpr thatPolyExpr) {
		if(this.power < thatPolyExpr.power){
			return 1;
		}else if(this.power > thatPolyExpr.power){
			return -1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "PolExpr [coeff=" + coeff + ", power=" + power + "]";
	}

	//Add two expr.
	public PolExpr add(PolExpr thatPolyExpr) {
		PolExpr result = new PolExpr(this.coeff + thatPolyExpr.coeff, 
				this.power);
		return result;
	}
	
	
	
	
}
