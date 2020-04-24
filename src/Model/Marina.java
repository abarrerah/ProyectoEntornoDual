package Model;

public abstract class Marina extends Soldados {

	private String barcoAsignado;
	
	
	public Marina(String nombre, String dni, String rango, float altura, String barco) {
		super(nombre, dni, rango, altura);
		this.barcoAsignado=barco;
	}


	public String getBarcoAsignado() {
		return barcoAsignado;
	}


	public void setBarcoAsignado(String barcoAsignado) {
		this.barcoAsignado = barcoAsignado;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((barcoAsignado == null) ? 0 : barcoAsignado.hashCode());
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
		Marina other = (Marina) obj;
		if (barcoAsignado == null) {
			if (other.barcoAsignado != null)
				return false;
		} else if (!barcoAsignado.equals(other.barcoAsignado))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return super.toString()+"Marina [barcoAsignado=" + barcoAsignado + "]";
	}
	
		
}
