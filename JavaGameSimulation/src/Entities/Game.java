package Entities;

import Abstract.Entity;

public class Game implements Entity {
	private int gameId;
	private String gameName;
	private double price;

	public Game(int gameId, String gameName, double price) {
		this.gameId = gameId;
		this.gameName = gameName;
		this.price = price;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
