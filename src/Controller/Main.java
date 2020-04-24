package Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Model.AntiAir;

public class Main {

	public static void main(String[] args) {
		AntiAir aa=new AntiAir("40mm Gesher", "1121A", "bajo", 2,"SS George", 4, 5, 600);
		AntiAir aa1=new AntiAir("80mm Gesher", "1121B", "Medio", 4,"SS George", 7, 5, 800);
		AntiAir aa2=new AntiAir("50mm Gesher", "1121C", "Alto", 3,"SS George", 5, 5, 700);
		ArrayList<AntiAir>al=new ArrayList<>();
		al.add(aa);
		al.add(aa1);
		al.add(aa2);
		
		System.out.println(aa.damagePenetration());
		System.out.println(aa.localizarObje());
		
		
		
	}

}
