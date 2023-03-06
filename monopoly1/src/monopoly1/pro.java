package monopoly1;

import java.util.HashMap;
import java.util.Scanner;

public class pro {
private int i =1;
	Player player;
	Scanner input=new Scanner(System.in);
	private int fiyat;
	private boolean sahip;
	private String isim;
	private int konum;
	private int kira1,kira2,kira3;
	HashMap <Integer,String> c=new HashMap<>();
	
	public void buy(Player mPlayer,Player otherP) {
		System.out.println("Your current location: "+this.getIsim());
		
		if(mPlayer.ptapu.contains(this.getIsim())) {
			System.out.println("This location belongs to you, so you can't take any action");
			
			
		}
		else if(otherP.ptapu.contains(this.getIsim())) {
			System.out.println("This place belongs to someone else please pay the rent");
			System.out.println("Rent of this city: "+this.getrKira());
			otherP.setMoney(this.getrKira()+otherP.getMoney());
			mPlayer.setMoney(mPlayer.getMoney()-this.getrKira());
			System.out.println("The rental level of the property has been increased");
			System.out.println("old rent: "+this.rKira);
			this.rkira();
			System.out.println("new rent: "+this.rKira);
			
			
			
			
			
		}
		
		else if(!mPlayer.ptapu.contains(this.getIsim()) && !otherP.ptapu.contains(this.getIsim())) {
			System.out.println("The price of the property: "+this.getFiyat());
			System.out.println("Do you want to buy this place?");
			System.out.println("<Y>es : <N>o");
			String istek=input.nextLine();
			
			
				if(istek.equalsIgnoreCase("y")) {
				if(mPlayer.getMoney()>=this.fiyat) {
					System.out.println("The purchase is taking place");
					mPlayer.setMoney(mPlayer.getMoney()-this.fiyat);
					System.out.println(this.getIsim()+" bought.");
					mPlayer.ptapu.add(this.getIsim());
					
							
				}
				else {
						System.out.println("Insufficient balance, you can not buy this place");
						
				}
				
				
				
			}
			
			else if(istek.equals("n")) {
				System.out.println("You are stopping until your turn comes");
				
			}
			
			
			
					
			
			
			
		}
		
				
		
	}
	
	
	
	public pro(String isim,int fiyat, int kira1,int kira2,int kira3,int rKira, int konum) {
		
		this.fiyat = fiyat;
		this.kira1 = kira1;
		this.kira2 = kira2;
		this.kira3 = kira3;
		this.rKira=rKira;
		this.isim = isim;
		this.konum = konum;
		
	}
	
	private int rKira;
	public int getFiyat() {
		return fiyat;
	}
	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	
	public int getKira1() {
		return kira1;
	}



	public void setKira1(int kira1) {
		this.kira1 = kira1;
	}



	public int getKira2() {
		return kira2;
	}



	public void setKira2(int kira2) {
		this.kira2 = kira2;
	}



	public int getKira3() {
		return kira3;
	}



	public void setKira3(int kira3) {
		this.kira3 = kira3;
	}



	public int getrKira() {
		return rKira;
	}



	public void setrKira(int rKira) {
		this.rKira = rKira;
	}



	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getKonum() {
		return konum;
	}
	public void setKonum(int konum) {
		this.konum = konum;
	}
	
	public int rkira() {
		++i;
		if(i==1) {
			this.setrKira(kira1);
			
		}
		else if(i==2) {
			this.setrKira(kira2);
			
		}
		else if(i==3) {
			this.setrKira(kira3);
			
		}
		else {
			this.setrKira(kira3);
		}
		return this.getrKira();
		
	}
	
}
