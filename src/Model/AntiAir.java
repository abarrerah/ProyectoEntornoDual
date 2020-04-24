package Model;

import Operations.Atacar;

public class AntiAir extends Marina implements Atacar{
	private int cantidadCannons;
	private int cantidadPersonas;
	private int disparosPorMinuto;
	
	public AntiAir(String nombre, String dni, String rango, float altura, String barco,int cantidadC,int CantidadP,int disparos) {
		super(nombre, dni, rango, altura, barco);
		// TODO Auto-generated constructor stub
		this.cantidadCannons=cantidadC;
		this.cantidadPersonas=CantidadP;
		this.disparosPorMinuto=disparos;
	}

	public int getCantidadCannons() {
		return cantidadCannons;
	}

	public void setCantidadCannons(int cantidadCannons) {
		this.cantidadCannons = cantidadCannons;
	}

	public int getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	public int getDisparosPorMinuto() {
		return disparosPorMinuto;
	}

	public void setDisparosPorMinuto(int disparosPorMinuto) {
		this.disparosPorMinuto = disparosPorMinuto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + cantidadCannons;
		result = prime * result + cantidadPersonas;
		result = prime * result + disparosPorMinuto;
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
		AntiAir other = (AntiAir) obj;
		if (cantidadCannons != other.cantidadCannons)
			return false;
		if (cantidadPersonas != other.cantidadPersonas)
			return false;
		if (disparosPorMinuto != other.disparosPorMinuto)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString()+"AntiAir [cantidadCannons=" + cantidadCannons + ", cantidadPersonas=" + cantidadPersonas
				+ ", disparosPorMinuto=" + disparosPorMinuto + "]";
	}

	@Override
	public String localizarObje() {
		String text="";
		int k=cantidadPersonas;
			if(k<3) {
				double d=0;
				d=k*1.3;
				text="El enemigo está a unos "+d+"mil metros de ti. Empieza a disparar que lo tienes encima";
			}else if(k<6) {
				double d=0;
				d=k*2.0;
				text="El enemigo está a unos "+d+"mil metros de ti. Esta bastante retirado. Tienes tiempo de planificar pero no mucho";
			}else {
				text="Enemigo detectado con tiempo suficiente";
			}
		return text;
	}

	@Override
	public int damagePenetration() {
		double ptt=0;
		if(disparosPorMinuto<650) {
			ptt=disparosPorMinuto*0.12;
		}else
			ptt=disparosPorMinuto*0.25;
		
		return (int) ptt;
	}
	
	

	
	
}
