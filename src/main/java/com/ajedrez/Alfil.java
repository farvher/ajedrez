package com.ajedrez;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Alfil extends AbstractFicha implements Ficha{

	@Override
	public int []  moverFicha(int initPosX, int initPosY, int futPosX, int futPosY) {
		int [] newPos = new int [2];
		newPos[0]= futPosX;
		newPos[1]= futPosY;
		return newPos;
	}

	@Override
	public boolean validarMovimiento(int initPosX, int initPosY, int futPosX, int futPosY) {
		int [] init = new int[]{initPosX,initPosY};
		int [] movement = new int[]{futPosX,futPosY};
		
		if(((init[0]-movement[0]) - (movement[1]-init[1]) )==0){
			return true;
		}else if (((init[0]-movement[0]) - (init[1]-movement[1]) )==0){
			return true;
		}
		
		return false;
	}

	@Override
	public List< int[]> posiblesPosiciones(int initPosX, int initPosY) {
	List< int[]> map = new ArrayList<>();
		
		int [] init = new int[]{initPosX,initPosY};
		
		
		for (int a1 =0 ; a1<Tablero.tablero.length;a1++){
			int [] pos = Tablero.tablero[a1]; 
			
			if(validarMovimiento(initPosX,initPosY,pos[0],pos[1])){
				map.add( pos);
			}	
		}	
		return map;
	}

	
	
	

	

}
