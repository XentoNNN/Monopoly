package monopoly1;

import java.util.HashMap;
import java.util.Scanner;

public class Otopark {
	
	
	HashMap <String,Integer> b=new HashMap();
	
	
	Scanner input=new Scanner(System.in);
	public void oCard(Player p){
		
		
		
		b.put("Start",1 );
		b.put("Bolu",2 );
		b.put( "Van",3);
		
		b.put("Kütahya",5 );
		
		b.put("Rize", 7);
		
		b.put("Mardin",8 );
		
		b.put( "Sakarya",10);
		
		b.put( "Hatay",12);
		b.put( "Trabzon",13);
		
		b.put( "Bursa",15);
		
		b.put( "Antalya",17);
		b.put( "Ankara",18);
		
		b.put( "İstanbul",20);
		
		
		System.out.println("For $200, you can go to any city, but even if you go through the starting point, you won't get any money, but you can buy a property.");
		System.out.println("Do you want to go?  {Y:N}");
		String al=input.nextLine();
		if(al.equalsIgnoreCase("y")) {
			if(p.getMoney()>=200) {

					System.out.println("Write the city you want to go to");
					String i=input.nextLine();
					p.setKonum(b.get(i));
		
					System.out.println("Your new location "+i+" as has been updated");
				
				
				p.setMoney(p.getMoney()-200);
				
			}
			else {
				System.out.println("There is not enough money for this");
				System.out.println("You will continue to wait in the parking lot");
			}
		}
		else {
			System.out.println("You decided to wait in the parking lot");
		}
		
		
		
	
	}

}
