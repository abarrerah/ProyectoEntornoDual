package Model;

public class Barco extends Marina{
	private double eslora;
	private String nombre;
	public Barco(String nombre, String dni, String rango, float altura, String barco,double eslora,String nombreV) {
		super(nombre, dni, rango, altura, barco);
		this.eslora=eslora;
		this.nombre=nombreV;
		// TODO Auto-generated constructor stub
	}
	public double getEslora() {
		return eslora;
	}
	public void setEslora(double eslora) {
		this.eslora = eslora;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return super.toString()+"Barco [eslora=" + eslora + ", nombre=" + nombre + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(eslora);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Barco other = (Barco) obj;
		if (Double.doubleToLongBits(eslora) != Double.doubleToLongBits(other.eslora))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	

}
