package programs;

import java.util.Locale;
import java.util.Scanner;
import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] rooms = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int rents = sc.nextInt();
		
		if(rents>0 && rents<=10) {			
			for(int i=0; i<rents; i++) {
				System.out.printf("Rent #%d%n", i+1, ": ");
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.nextLine();
				System.out.print("Room: ");
				int roomOption = sc.nextInt();
				rooms[roomOption] = new Rent(name, email);	
				System.out.println("");
			}
			
			System.out.println("Busy rooms: ");
			for(int i=0; i<rooms.length; i++) {
				if(rooms[i] != null) { //ignora quartos vazios!
					System.out.println(i+": "+rooms[i]);
				}
			}
		}
		
		sc.close();
	}

}
