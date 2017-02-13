package com.ajedrez.dto;

import java.util.List;
import java.util.Map;

public class ResponseDTO {
	
	
	private String fichaName;
	
	private int newPosX;
	
	private int newPosY;
	
	private String response ;
	
	private int status ;
	
	private List< int[]> posiblePositions;

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List< int[]> getPosiblePositions() {
		return posiblePositions;
	}

	public void setPosiblePositions(List< int[]> posiblePositions) {
		this.posiblePositions = posiblePositions;
	}

	public String getFichaName() {
		return fichaName;
	}

	public void setFichaName(String fichaName) {
		this.fichaName = fichaName;
	}

	public int getNewPosX() {
		return newPosX;
	}

	public void setNewPosX(int newPosX) {
		this.newPosX = newPosX;
	}

	public int getNewPosY() {
		return newPosY;
	}

	public void setNewPosY(int newPosY) {
		this.newPosY = newPosY;
	}
	
	

}
