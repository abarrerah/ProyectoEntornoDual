package Model;

import Operations.Atacar;

public class LongCannon extends Marina implements Atacar {

	private String calibre;
	private float distancia;
	private int cantidadPersonasParaDisparar;
	public LongCannon(String nombre, String dni, String rango, float altura, String barco,String calibre,float distancia,int cantidad) {
		super(nombre, dni, rango, altura, barco);
		this.calibre=calibre;
		this.distancia=distancia;
		this.cantidadPersonasParaDisparar=cantidad;
		// TODO Auto-generated constructor stub
	}
	public String getCalibre() {
		return calibre;
	}
	public void setCalibre(String calibre) {
		this.calibre = calibre;
	}
	public float getDistancia() {
		return distancia;
	}
	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}
	public int getCantidadPersonasParaDisparar() {
		return cantidadPersonasParaDisparar;
	}
	public void setCantidadPersonasParaDisparar(int cantidadPersonasParaDisparar) {
		this.cantidadPersonasParaDisparar = cantidadPersonasParaDisparar;
	}
	@Override
	public String toString() {
		return super.toString()+"LongCannon [calibre=" + calibre + ", distancia=" + distancia + ", cantidadPersonasParaDisparar="
				+ cantidadPersonasParaDisparar + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((calibre == null) ? 0 : calibre.hashCode());
		result = prime * result + cantidadPersonasParaDisparar;
		result = prime * result + Float.floatToIntBits(distancia);
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
		LongCannon other = (LongCannon) obj;
		if (calibre == null) {
			if (other.calibre != null)
				return false;
		} else if (!calibre.equals(other.calibre))
			return false;
		if (cantidadPersonasParaDisparar != other.cantidadPersonasParaDisparar)
			return false;
		if (Float.floatToIntBits(distancia) != Float.floatToIntBits(other.distancia))
			return false;
		return true;
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
