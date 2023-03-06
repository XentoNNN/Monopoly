package monopoly1;

import java.util.Random;

public class chest {
Random rand=new Random();
	public void cCard(Player p){
	int cardno=rand.nextInt(4)+1;
		
		switch(cardno){
		case 1:
			System.out.println("You are so lucky! you have earned $150");
			p.setMoney(p.getMoney()+150);
			break;
		case 2:
			System.out.println("unfortunately, the treasury turned out to be empty");
			
			break;
		case 3:
			System.out.println("you have earned $50");
			p.setMoney(p.getMoney()+50);
			break;
		case 4:
			System.out.println("you have earned $75");
			p.setMoney(p.getMoney()+75);
		break;
		}
		
	}

	

}
