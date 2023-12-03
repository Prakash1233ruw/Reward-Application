package reward.application;


import java.util.Scanner;

public class Transaction {
    
	private int userId;
	private double amount;
	private int pointsGained;
	final int point=100;
	

public int getPointsGained() {
    return pointsGained;
}
public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getUserId() {
		return userId;
	}
	public double getAmount() {
		return amount;
	}
	
	
	public void userDetails() {
		UserLogin userLogin=new UserLogin();
		userLogin.authentication();
		
		}
	
     public void transactionControl() {
		
		System.out.println("enter the amount ");
		Scanner sc = new Scanner(System.in);
			amount=sc.nextInt();
		pointsGained=(int)(amount/point); 
       
	  
	}
     
//     public void det() {
//	       
//	        List<User> list = userManager.getUsers();
//			ListIterator<User> litrIterator=list.listIterator();
//			System.out.println("litrIterator");
////			while(litrIterator.hasNext()) {
////			user=litrIterator.next();
////				
////	        	user.updatePoints(pointsGained);
////	        	System.out.println("points updated for user "+user.getName()+" "+user.getPoints());
////	        }

 //    }




	

}
