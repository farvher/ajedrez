package com.ajedrez;

public enum AjedrezEnum {

	TORRE("torre", new Torre()), Alfil("alfil", new Alfil());

	String nombre;
	Ficha ficha;

	public String getName() {
		return nombre;
	}

	public void setName(String name) {
		this.nombre = name;
	}

	public Ficha getFicha() {
		return ficha;
	}

	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}

	AjedrezEnum(String nombre, Ficha ficha) {
		this.nombre = nombre;
		this.ficha = ficha;

	}
	
	public static AjedrezEnum getFicha(String nombre){
		for(AjedrezEnum a :AjedrezEnum.values()){
			if(a.nombre.contentEquals(nombre)){
				return a;
			}
		}
		return null;
	}

}
