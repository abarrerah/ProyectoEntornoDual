package Model;

import Operations.Atacar;

public class InfanteríaLigera extends Infanteria implements Atacar{
	
	protected enum tipoEntre{TipoA,TipoB,TipoC}
	protected tipoEntre tipo;
	protected int distanciaMaximaTiro;
	public InfanteríaLigera(String nombre, String dni, String rango, float altura, int regimiento, String mainwe,tipoEntre tipo,int distancia) {
		super(nombre, dni, rango, altura, regimiento, mainwe);
		this.tipo=tipo;
		this.distanciaMaximaTiro=distancia;
		// TODO Auto-generated constructor stub
	}
	public tipoEntre getTipo() {
		return tipo;
	}
	public void setTipo(tipoEntre tipo) {
		this.tipo = tipo;
	}
	public int getDistanciaMaximaTiro() {
		return distanciaMaximaTiro;
	}
	public void setDistanciaMaximaTiro(int distanciaMaximaTiro) {
		this.distanciaMaximaTiro = distanciaMaximaTiro;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + distanciaMaximaTiro;
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		InfanteríaLigera other = (InfanteríaLigera) obj;
		if (distanciaMaximaTiro != other.distanciaMaximaTiro)
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return super.toString()+"InfanteríaLigera [tipo=" + tipo + ", distanciaMaximaTiro=" + distanciaMaximaTiro + "]";
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
