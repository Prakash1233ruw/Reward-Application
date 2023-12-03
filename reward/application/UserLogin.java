package reward.application;

import java.util.Scanner;

public class UserLogin {
	private int userId;
	private String userPassword;
	
	public int getUserId() {
		return userId;
	}
	public void input() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("kindly enter your id");
		userId=scanner.nextInt();
		System.out.println("kindly enter your password");
		userPassword=scanner.next();
		
	}
	public void authentication() {
		UserManager userManager=new UserManager();
		
		try {
			input();
			userManager.authenticateUser(userId,userPassword);
		} catch (NotMatchingException e) {
			System.out.println(e.getMessage());
			try {
				input();
				userManager.authenticateUser(userId,userPassword);
			} catch (NotMatchingException e1) {
				System.out.println(e.getMessage());
				System.out.println("sorry no more chances");
				System.exit(0);
			}
		}
		
		

		
		
	}
}