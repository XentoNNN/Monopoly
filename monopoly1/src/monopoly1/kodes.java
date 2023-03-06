package monopoly1;

import java.util.Scanner;

public class kodes {
Player player;
public boolean jail=false;
public boolean jail2=false;
int i=0;
int x=0;



public void isJail2(Player p) {
	if(this.jail2==true) {i++;
		if(i<2) {
			
			
			
			this.jail2=true;
		}
		
		else {
			
			this.jail2=false;
			i=0;
		}
		
	}
	else {
		
		i=0;
		this.jail2=false;
		
	}
	
}


public void kodes2(Player p){
	int ek=p.getKonum();

	System.out.println("You're going to jail right now...");
	System.out.println("Updating your location..");
	p.setKonum(6);
	System.out.println("There are two options for getting out of jail:pay $200 or wait for 2 turns.");
	System.out.println("<M>oney : <W>ait");
	String al=input.nextLine();

	

	
	if(al.equalsIgnoreCase("m")) {
		if(p.getMoney()>=200) {
			p.setMoney(p.getMoney()-200);
			p.setKonum(ek);
			System.out.println("The money has been paid, you are now free and you were sent to your old location...");
			this.setJail2(false);
			
		}
		else {
			System.out.println("You don't have enough money to get out of jail");
			System.out.println("You have to wait in jail");
			this.setJail2(true);
		}
		
		
		
	}
	else  {
		System.out.println("You decided to wait in jail");
		
		this.setJail2(true);
		
		
	}
	
	
}



public boolean getjail() {
	return jail;
}

public boolean getjail2() {
	return jail2;
}
public void setJail2(boolean jail2) {
	this.jail2 = jail2;
}

public void isJail(Player p) {
	if(this.jail==true) {x++;
	if(x<2) {
		
		
		
		this.jail=true;
	}
	
	else {
		
		this.jail=false;
		x=0;
	}
	
}
else {
	
	x=0;
	this.jail=false;
	
}
}

public void setJail(boolean jail) {
	this.jail = jail;
}
Scanner input=new Scanner(System.in);
	
	public kodes() {
		// TODO Auto-generated constructor stub
	}
	public void kodess(Player p) {
		int ek=p.getKonum();
		System.out.println("You're going to jail right now...");
		System.out.println("Updating your location..");
		p.setKonum(6);
		System.out.println("There are two options for getting out of jail:pay $200 or wait for 2 turns.");
		System.out.println("<M>oney : <W>ait");
		String al=input.nextLine();

	
		
		if(al.equalsIgnoreCase("m")) {
			if(p.getMoney()>=200) {
				p.setMoney(p.getMoney()-200);
				p.setKonum(ek);
				System.out.println("The money has been paid, you are now free and you were sent to your old location...");
				this.setJail(false);
				
			}
			else {
				System.out.println("You don't have enough money to get out of jail");
				System.out.println("You have to wait in jail");
				this.setJail(true);
			}
			
			
			
		}
		else  {
			System.out.println("You decided to wait in jail");
			
			this.setJail(true);
			
			
		}
		
		
	}

	
	

	
}
