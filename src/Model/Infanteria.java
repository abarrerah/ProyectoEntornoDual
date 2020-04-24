package Model;

public abstract class Infanteria extends Soldados {
	
	private int regimiento;
	private String MainWeap;
	
	
	
	
	public Infanteria(String nombre, String dni, String rango, float altura,int regimiento,String mainwe) {
		super(nombre, dni, rango, altura);
		this.regimiento=regimiento;
		this.MainWeap=mainwe;
	}




	public int getRegimiento() {
		return regimiento;
	}




	public void setRegimiento(int regimiento) {
		this.regimiento = regimiento;
	}




	public String getMainWeap() {
		return MainWeap;
	}




	public void setMainWeap(String mainWeap) {
		MainWeap = mainWeap;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((MainWeap == null) ? 0 : MainWeap.hashCode());
		result = prime * result + regimiento;
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Infanteria other = (Infanteria) obj;
		if (MainWeap == null) {
			if (other.MainWeap != null)
				return false;
		} else if (!MainWeap.equals(other.MainWeap))
			return false;
		if (regimiento != other.regimiento)
			return false;
		return true;
	}




	@Override
	public String toString() {
		return super.toString()+"Infanteria [regimiento=" + regimiento + ", MainWeap=" + MainWeap + "]";
	}
	
	

}
