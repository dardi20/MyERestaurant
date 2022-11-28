package org.MyRestaurant.entity;

public class Client {
	private String name;
	private String adress;
	private String cel;
	private String email;

	public Client(String name, String adress, String cel, String email) {

		this.name = name;
		this.adress = adress;
		this.cel = cel;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

}
