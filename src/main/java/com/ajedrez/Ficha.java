package com.ajedrez;

import java.util.List;
import java.util.Map;

public interface Ficha {
	
	int []  moverFicha(int initPosX, int initPosY, int futPosX, int futPosY);
	
	boolean validarMovimiento(int initPosX, int initPosY, int futPosX, int futPosY);
	
	List< int[]> posiblesPosiciones(int initPosX, int initPosY);
	
}
