package monopoly1;
import java.util.Scanner;
public class game {
	private Player player1;
    chest chest;
	private Player player2;
	kodes kodes;
	şans şans;
	Dice dice;
	int zar1;
	int zar2;
	int i=1;
	
	Scanner input=new Scanner(System.in);
	
	
	
	

	public void login() {
		
System.out.println("---Welcome to Monopoly---");
		start();
		
		
		 
	}
	
	public void start(){
		chest=new chest();
		şans=new şans();
		Otopark o=new Otopark();
		System.out.println("Enter the first player name:");
		String isim=input.next();
		 player1=new Player(isim);
		kodes kodes=new kodes();
		System.out.println("Enter the name of the second player:");
		isim=input.next();
		 player2=new Player(isim);
		System.out.println("Players were created...");
		
		dice=new Dice();
	 loop:   while(true){
			
			
		
			if(kodes.getjail()) {
				kodes.isJail(player1);
							System.out.println(player1.getName() + " is in jail, you cannot play... ");
							player1.turn();
						}
			if(Player.pNumber==1) {
						
						System.out.println();
						System.out.println("right now " + player1.getName() + " is playing");
						
						System.out.println("Press <a> to roll the dice.");
						String at=input.nextLine();
						if(at.equalsIgnoreCase("a")) {
							zar1=dice.getFaceValue();
							zar2=dice.getFaceValue();
							System.out.println("Dice1: "+ zar1 +"   Dice2: "+ zar2);
							if(zar1==zar2) {
								
								// at=input.nextLine();
								while(zar1==zar2) {
									if(i==3) {
											kodes.kodess(player1);
											i=1;
											continue loop;
										}
										
									System.out.println("Your dice came out the same, please throw them again.");
							//	System.out.println("zar atmak için<a>'ya basınız");
									System.out.println("Press <a> to roll the dice.");
									 at=input.nextLine();
									 zar1=dice.getFaceValue();
										zar2=dice.getFaceValue();
										System.out.println("Dice1: "+zar1+"   Dice2: "+zar2);
										
										
										++i;
								}
								i=1;
							}
						//	else {
								
							
						if(player1.getKonum()+zar1+zar2>20) {
							System.out.println("You earned $75 for getting to the starting point.");
							player1.setMoney(player1.getMoney()+75);							
						}
						player1.setKonum((player1.getKonum()+zar1+zar2)%21);
						if(player1.getKonum()==0) {
							player1.setKonum(1);
						}
						switch(player1.getKonum()) {
						case 1:
							System.out.println("You're at the starting point.");
							//player1.turn();
							break;
						case 2:
							System.out.println("You are in Bolu city");
							pro Bolu=new pro("Bolu",150,50,100,150,50,2);
							 
							 Bolu.buy(player1, player2);
							// player1.pStats();
							 //	 player1.turn();
							 break;
						case 3:
							System.out.println("You are in Van city");
							pro van=new pro("Van",150,50,100,150,50,3);
							
							van.buy(player1, player2);
							//	player1.pStats();
							//player1.turn();
							break;
						case 4:
							System.out.println("You are in the Luck section");
							şans.card(player1);
							//	 player1.pStats();
							// player1.turn();
							break;
						case 5:
							System.out.println("You are in Kutahya city");
							pro kütahya=new pro("Kütahya",150,50,100,150,50,5);
							//	player1.pStats();
							kütahya.buy(player1, player2);
							//player1.turn();
							break;
						case 6:
							System.out.println("Visiting the jail");
							System.out.println("You don't need to do anything.");
							//	 player1.pStats();
							//	player1.turn();
							break;
						case 7:
							System.out.println("You are in Rize city");
							pro rize=new pro("Rize",250,100,150,200,100,7);
							//	 player1.pStats();
							rize.buy(player1, player2);
							//	player1.turn();
							break;
						case 8:
							
							System.out.println("You are in Mardin city");
							pro mardin=new pro("Mardin",250,100,150,200,100,8);
							//	player1.pStats();
							mardin.buy(player1, player2);
							//	player1.turn();
							 
							break;
						case 9:
							System.out.println("You have found the treasure");
							chest.cCard(player1);
							//	 player1.pStats();player1.turn();
							break;
						case 10:
							System.out.println("You are in Sakarya city");
							pro sakarya=new pro("Sakarya",250,100,150,200,100,10);
							//	player1.pStats();
							sakarya.buy(player1, player2);
							//	player1.turn();
							break;
						case 11:
							System.out.println("You're in the parking lot.");
							o.oCard(player1);
							//	 player1.pStats();player1.turn();
							break;
						case 12:
							System.out.println("You are in Hatay city");
							pro hatay=new pro("Hatay",350,150,200,250,150,12);
							//	 player1.pStats();
							hatay.buy(player1, player2);
							//	player1.turn();
							break;
						case 13:
							System.out.println("You are in Trabzon city");
							pro trabzon=new pro("Trabzon",350,150,200,250,150,13);
							//	player1.pStats();
							trabzon.buy(player1, player2);
							//	player1.turn();
							break;
						case 14:
							System.out.println("You are in the Luck section");
							şans.card(player1);
							//	 player1.pStats();player1.turn();
							break;
						case 15:
							System.out.println("You are in Bursa city");
							pro bursa=new pro("Bursa",350,150,200,250,150,15);
							//		 player1.pStats();
							bursa.buy(player1, player2);
							//	player1.turn();
							break;
						case 16:
							System.out.println("Go to jail");
							kodes.kodess(player1);
							//	 player1.pStats();
							//	 player1.turn();
							break;
						case 17:
							System.out.println("You are in Antalya city");
							pro antalya=new pro("Antalya",450,200,250,300,200,17);
							//	player1.pStats();
							//player1.turn();
							antalya.buy(player1, player2);
							 
							break;
						case 18:
							System.out.println("You are in Ankara city");
							pro ankara=new pro("Ankara",450,200,250,300,200,18);
							// player1.pStats();
							// player1.turn();
							ankara.buy(player1, player2);
						
							break;
						case 19:
							System.out.println("You have found the treasure");
							chest.cCard(player1);
						//	player1.pStats();
							// player1.pStats();
							// player1.turn();
							break;
						case 20:
							System.out.println("You are in İstanbul city");
							pro istanbul=new pro("İstanbul",450,200,250,300,200,20);
							//	player1.pStats();
							istanbul.buy(player1, player2);
							//	player1.turn();
							break;
						
						}
						//	}
						
						if(!player1.kPara()) {
							System.out.println("winner: "+player2.getName());
							System.out.println("GAME OVER!!!!!");
							break;
						}else {
							player1.turn();
						}
						
						
						
					}
						//}
						
					}if(kodes.getjail2()) {
						System.out.println(player2.getName() + " is in jail, you cannot play... ");
						kodes.isJail2(player2);
						player2.turn();
					}
					 if(Player.pNumber==2) {
						//dice.zarat(player2);
						 System.out.println();
						 System.out.println("right now "+ player2.getName() +" is playing");
					//	 if(kodes.kodess(player2)) {
							System.out.println("Press <a> to roll the dice.");
							String at=input.nextLine();
							if(at.equalsIgnoreCase("a")) {
								zar1=dice.getFaceValue();
								zar2=dice.getFaceValue();
								System.out.println("Dice1: "+zar1+"   Dice2: "+zar2);
								if(zar1==zar2) {
									
									while(zar1==zar2) {
										
										if(i==3) {
												System.out.println("you scored a double 3 times.");
												kodes.kodes2(player2);
												i=1;
												continue loop;
											}
										
										
										
										System.out.println("Your dice came out the same, please throw them again.");
										System.out.println("Press <a> to roll the dice.");
										at=input.nextLine();
									//	if(at.equalsIgnoreCase("a")){
										zar1=dice.getFaceValue();
										zar2=dice.getFaceValue();
										
										System.out.println("Dice1: "+zar1+"   Dice2: "+zar2);
										
										 
										 
											
											
									//	}
										
											++i;
											
									}
									i=1;
								}
						 
						 
						 
							//	else {
									
								
						if(player2.getKonum()+zar1+zar2>20) {
							System.out.println("You earned $75 for getting to the starting point.");
							player2.setMoney(player2.getMoney()+75);
							
						}
						player2.setKonum((player2.getKonum()+zar1+zar2)%21);
						if(player2.getKonum()==0) {
							player2.setKonum(1);
						}
						switch(player2.getKonum()) {
						case 1:
							System.out.println("You're at the starting point.");
							break;
						case 2:
							System.out.println("You are in Bolu city");
							pro Bolu=new pro("Bolu",150,50,100,150,50,2);							 
							 Bolu.buy(player2, player1);
							 //	player2.pStats();
							 break;
						case 3:
							System.out.println("You are in Van city");
							pro van=new pro("Van",150,50,100,150,50,3);							
							van.buy(player2, player1);
							//	 player2.pStats();
							break;
						case 4:
							System.out.println("You are in the Luck section");
							şans.card(player2);
							//	 player2.pStats();
							break;
						case 5:
							System.out.println("You are in Kutahya city");
							
							pro kütahya=new pro("Kütahya",150,50,100,150,50,5);
							kütahya.buy(player2, player1);
							//	player2.pStats();
							
							
							 
							break;
						case 6:
							System.out.println("Visiting the jail");
							System.out.println("You don't need to do anything.");
							//	 player2.pStats();
							break;
						case 7:
							System.out.println("You are in Rize city");
							pro rize=new pro("Rize",250,100,150,200,100,7);
							
							rize.buy(player2, player1);
							//	 player2.pStats();
							break;
						case 8:
							
							System.out.println("You are in Mardin city");
							pro mardin=new pro("Mardin",250,100,150,200,100,8);
							
							mardin.buy(player2, player1);
							//	player2.pStats();
							 
							break;
						case 9:
							System.out.println("You have found the treasure");
							chest.cCard(player2);
							//	 player2.pStats();
							break;
						case 10:
							System.out.println("You are in Sakarya city");
							pro sakarya=new pro("Sakarya",250,100,150,200,100,10);
							sakarya.buy(player2, player1);
							//	player2.pStats();
							
							 
							break;
						case 11:
							System.out.println("You're in the parking lot.");
							o.oCard(player2);
							//	 player2.pStats();
							break;
						case 12:
							System.out.println("You are in Hatay city");
							pro hatay=new pro("Hatay",350,150,200,250,150,12);
							hatay.buy(player2, player1);
							//	player2.pStats();
							
							
							break;
						case 13:
							System.out.println("You are in Trabzon city");
							pro trabzon=new pro("Trabzon",350,150,200,250,150,13);
							
							trabzon.buy(player2, player1);
							//		 player2.pStats();
							break;
						case 14:
							System.out.println("You are in the Luck section");
							şans.card(player2);
							//	 player2.pStats();
							break;
						case 15:
							System.out.println("You are in Bursa city");
							pro bursa=new pro("Bursa",350,150,200,250,150,15);
							
							bursa.buy(player2, player1);
							//	 player2.pStats();
							break;
						case 16:
							System.out.println("Go to jail");
							kodes.kodes2(player2);
							//	 player2.pStats();
							break;
						case 17:
							System.out.println("You are in Antalya city");
							pro antalya=new pro("Antalya",450,200,250,300,200,17);
							
							antalya.buy(player2, player1);
							//		 player2.pStats();
							break;
						case 18:
							System.out.println("You are in Ankara city");
							pro ankara=new pro("Ankara",450,200,250,300,200,18);
							
							ankara.buy(player2, player1);
							//	    player2.pStats();
							break;
						case 19:
							System.out.println("You have found the treasure");
							chest.cCard(player2);
							//	player2.pStats();
							 
							break;
						case 20:
							System.out.println("You are in İstanbul city");
							pro istanbul=new pro("İstanbul",450,200,250,300,200,20);
							
							istanbul.buy(player2, player1);
							//	 player2.pStats();
							break;
						
						}
						//		}
						if(!player2.kPara()) {
							System.out.println("Winner: "+player1.getName());
							System.out.println("GAME OVER!!!!!");
							break;
						}else {
							player2.turn();
						}
						
						
						
						
						
						
					}
					
			//	} 
				
		//	}
						 
					 }
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	//	}
		
		
					 System.out.println();
						Player.pStats(player1,player2);
						System.out.println();

	
	}

	
	
}
}