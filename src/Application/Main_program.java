package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Room;

public class Main_program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room[] room = new Room[9];
	
		System.out.print("How many rooms will be rented?  ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.printf("Rent #%d%n", i+1);
			System.out.print("Name of the Resident: ");
			sc.nextLine();
			String resident = sc.nextLine();
			System.out.print("E-mail contact: ");
			String email = sc.nextLine();
			System.out.print("Room to be rented: ");
			int num = sc.nextInt();
			room[num] = new Room(num, resident, email);
		}
		System.out.println("");
		System.out.println("Busy Rooms:");
		for(int i = 0; i<room.length; i++) {
			if(room[i] != null) {
				System.out.println(room[i]);
			}
		}
		
		
		sc.close();
	}

}
