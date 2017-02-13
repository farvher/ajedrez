package com.ajedrez;

public abstract class AbstractFicha {
	
	int initPosX;
	int initPosY; 
	int futPosX; 
	int futPosY;
	
	
	public int getInitPosX() {
		return initPosX;
	}
	public void setInitPosX(int initPosX) {
		this.initPosX = initPosX;
	}
	public int getInitPosY() {
		return initPosY;
	}
	public void setInitPosY(int initPosY) {
		this.initPosY = initPosY;
	}
	public int getFutPosX() {
		return futPosX;
	}
	public void setFutPosX(int futPosX) {
		this.futPosX = futPosX;
	}
	public int getFutPosY() {
		return futPosY;
	}
	public void setFutPosY(int futPosY) {
		this.futPosY = futPosY;
	}
	
	
	

}
