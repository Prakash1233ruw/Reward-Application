package reward.application;



import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class NotMatchingException extends Exception{
	public NotMatchingException(String message) {
		super(message);
	}
}



public class UserManager {
	private List<User> users=null;
	public UserManager() {
		this.users=new ArrayList<User>();
				initializeUsers();
	}
	public void initializeUsers(){
		users.add(new User(5,"naruto","n5H",0));
		users.add(new User(43,"hinata","h43",100));
		users.add(new User(47,"sasuke","s47",0));
		users.add(new User(1,"RockLee","2",0));
		
	}
	
	
	public void authenticateUser( int userId,String userPassword) throws NotMatchingException {
		ListIterator<User> litr=users.listIterator();
		boolean flag=false;
	 while(litr.hasNext()) {
		 User validationUser=litr.next();
		 if(userId==validationUser.getId()&&userPassword.equals(validationUser.getPassword())) {
				System.out.println("welcome to our app "+ validationUser.getName());
				flag=true;
			  }
	 }

	
	if(flag==false)
	 throw new NotMatchingException("Incorrect credentials.Please try again");
	 
	
	}
	
	
	public  List<User> getUsers(){
		return users;
	}
	

}

