package monopoly1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Player {
	
	static int  pNumber=1;
	private int money=1500;
	private int konum=1;
	private boolean kpara=true;
	private String name=" ";
	Dice dice;
	private kodes kodes;
	 Boolean sıra=true;
	 ArrayList ptapu=new ArrayList();
	 
		int zar1;
		int zar2;
		int i=1;
	Scanner input=new Scanner(System.in);
	public kodes getKodes() {
		return kodes;
	}
	public void setKodes(kodes kodes) {
		
		this.kodes = kodes;
	}
	public boolean isSıra() {
		return sıra;
	}
	public void setSıra(boolean sıra) {
		this.sıra = sıra;
	}

	
	
	
	public Dice getDice() {
		
		return dice;
	}
	public void setDice(Dice dice) {
		this.dice = dice;
	}
	
	public int getKonum() {
		return konum;
	}
	public void setKonum(int konum) {
		this.konum = konum;
	}
	
	public ArrayList getPtapu() {
		return ptapu;
	}
	public void setPtapu(ArrayList ptapu) {
		this.ptapu = ptapu;
	}
	
	public Player(String isim) {
		this.name=isim;
		
		this.money=1000;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean kPara() {
		if(this.getMoney()<0) {
			return false;
			
		}
		else {
			return true;
		}
	}
	
	public void move(int diceTotal) {
		
		
	}
	
	public void endturn() {
		
	}
	

	public static void pStats(Player p,Player o ) {
		
		
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("The name of the player: "+p.getName()+"\t The player money: "+p.getMoney()+" \t  Where the player is located: "+p.getKonum());
		System.out.println("Properties owned by the player: ");
		p.ptapu.forEach(item -> System.out.print(item+","));
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("The name of the player: "+o.getName()+"\t The player money: "+o.getMoney()+" \t  Where the player is located: "+o.getKonum());
		System.out.println("Properties owned by the player: ");
		o.ptapu.forEach(item -> System.out.print(item+","));
		System.out.println();
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------------------");
		
	}
	
	
	
	
	
	
	public int getpNumber() {
		return pNumber;
	}
	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
	}
	public  void turn() {
		if(pNumber==1) {
			pNumber=2;
		}
		else {
			pNumber=1;
		}
	}
	
	

}
