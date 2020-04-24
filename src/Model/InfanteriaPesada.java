package Model;

import Operations.Atacar;

public class InfanteriaPesada extends Infanteria implements Atacar {
	
	private String nombreVehiculo;
	private float distanciaMaximaTiro;
	private String calibre;

	public InfanteriaPesada(String nombre, String dni, String rango, float altura, int regimiento, String mainwe,String nombreV,float distancia, String calibre) {
		super(nombre, dni, rango, altura, regimiento, mainwe);
		// TODO Auto-generated constructor stub
		this.nombreVehiculo=nombreV;
		this.distanciaMaximaTiro=distancia;
		this.calibre=calibre;
	}

	public String getNombreVehiculo() {
		return nombreVehiculo;
	}

	public void setNombreVehiculo(String nombreVehiculo) {
		this.nombreVehiculo = nombreVehiculo;
	}

	public float getDistanciaMaximaTiro() {
		return distanciaMaximaTiro;
	}

	public void setDistanciaMaximaTiro(float distanciaMaximaTiro) {
		this.distanciaMaximaTiro = distanciaMaximaTiro;
	}

	public String getCalibre() {
		return calibre;
	}

	public void setCalibre(String calibre) {
		this.calibre = calibre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((calibre == null) ? 0 : calibre.hashCode());
		result = prime * result + Float.floatToIntBits(distanciaMaximaTiro);
		result = prime * result + ((nombreVehiculo == null) ? 0 : nombreVehiculo.hashCode());
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
		InfanteriaPesada other = (InfanteriaPesada) obj;
		if (calibre == null) {
			if (other.calibre != null)
				return false;
		} else if (!calibre.equals(other.calibre))
			return false;
		if (Float.floatToIntBits(distanciaMaximaTiro) != Float.floatToIntBits(other.distanciaMaximaTiro))
			return false;
		if (nombreVehiculo == null) {
			if (other.nombreVehiculo != null)
				return false;
		} else if (!nombreVehiculo.equals(other.nombreVehiculo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "InfanteriaPesada [nombreVehiculo=" + nombreVehiculo + ", distanciaMaximaTiro=" + distanciaMaximaTiro
				+ ", calibre=" + calibre + "]";
	}

	@Override
	public String localizarObje() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int damagePenetration() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
