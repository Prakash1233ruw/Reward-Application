package reward.application;


import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class RewardManager  {
	
  	private int pointsGained=0;
	Scanner scanner=null;
	

	public void giftControl()  {
		
		 Transaction transactionProcess = new Transaction();
		 transactionProcess.userDetails();
		 transactionProcess.transactionControl();
		
	       

		 pointsGained= transactionProcess.getPointsGained();
		
		System.out.println("you got points from your recent transaction  :"+ pointsGained);
		System.out.println("do u want to redeem the gifts");
		GiftCard gc1=new GiftCard("coupon","amazon Coupon",100,10000);
		GiftCard gc2=new GiftCard("merch","itachi t shirt",200,20000);
		GiftCard gc3=new GiftCard("phone","iphone 17 pro max",400,40000);
		GiftCard gc4=new GiftCard("laptop","Mac BookPro",500,50000);
		ArrayList<GiftCard> list=new ArrayList<GiftCard>();
		list.add(gc1);
		list.add(gc2);
		list.add(gc3);
		list.add(gc4);
		ListIterator<GiftCard> allGiftsIterator=list.listIterator();
		
		while(allGiftsIterator.hasNext()) {
			GiftCard giftCard=allGiftsIterator.next();
			
			System.out.println(giftCard);
		}
		
		
		System.out.println("1: amazon coupon 2: itachi tshirt 3:iphone 17 pro max  4:mac book pro ");
		scanner=new Scanner(System.in);
		int option=scanner.nextInt();
		
		
		switch (option) {
		
		case 1-> redeemGiftCard(gc1);
		case 2-> redeemGiftCard(gc2);
		case 3-> redeemGiftCard(gc3);  
   		case 4-> redeemGiftCard(gc4);  
   		
		default ->System.out.println("invalid option");
		
		}
		

		
}
	public void redeemGiftCard(GiftCard gc) {
		
		if(pointsGained>=gc.getPointsRequired()) {
					System.out.println("u redeemed the "+gc.getName());
					
					int  rem=pointsGained-gc.getPointsRequired();
					System.out.println("points remaining :"+rem);
		}else {
			System.out.println("points not required for this gift card ");
		}
	}
	
}




