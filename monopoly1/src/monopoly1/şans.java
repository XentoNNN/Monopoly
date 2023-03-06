package monopoly1;

import java.util.Random;

public class şans {

	Random rand=new Random();
	kodes kodes=new kodes();
	public void card(Player p){
		
		int cardno=rand.nextInt(10)+1;
		
		switch(cardno) {

		case 1:
			System.out.println("Today is your lucky day! $100 has been added to your account.");
			p.setMoney(p.getMoney()+100);
			break;
			
		case 2:
			System.out.println("Your game of chance has been very lucky for you. $200 has been added to your account.");
			p.setMoney(p.getMoney()+200);
			break;
		
		case 3:
			System.out.println("You lost the bet you entered with your friends and donated $200 to a charity.");
			p.setMoney(p.getMoney()-200);
			break;
			
		case 4:
			System.out.println("The next stop on your journey is Ice Cream City. Sorry Hatay.");
			p.setKonum(12);
			break;
		case 5:
			System.out.println("It seems like a lucky day, go to the other lucky card. Let's see if your luck will make you laugh too?");
			if (p.getKonum()==4) {
			p.setKonum(14);
			}
			else {
				p.setKonum(4);
			}
			break;
		case 6:
			System.out.println("It seems that the weather is very hot. You deserve to cool off a little. Your luxury hotel is waiting for you for one night in Antalya.");
		    p.setKonum(17);
		    break;

		case 7:
			System.out.println("Everyone deserves a new beginning. Please go to the starting point.");
			p.setKonum(1);
			break;
			
		case 8:
			System.out.println("You need  to testify about an accident. Go back 3 frames.");
			p.setKonum(p.getKonum()-3);
			break;
			
		case 9:
			System.out.println("You got a tax amnesty for driving an environmentally friendly car. You won $150.");
			p.setMoney(p.getMoney()+150);
			break;
		case 10:
			System.out.println("One of your fancy friends has a birthday. She convinced you to come to the party. Go to the Istanbul.");
			p.setKonum(20);
			break;
		}
			
	
	}
	
	
}
