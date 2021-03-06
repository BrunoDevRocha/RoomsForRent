package Entities;

public class Room {
	
	private int num;
	private String resident;
	private String email;
	
	public Room(int num, String resident, String email) {
		this.num = num;
		this.resident = resident;
		this.email = email;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getResident() {
		return resident;
	}

	public void setResident(String resident) {
		this.resident = resident;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return    "Room "
				+ num
				+ ": "
				+ resident
				+ ", "
				+ email
				+ ".";
	}
}
