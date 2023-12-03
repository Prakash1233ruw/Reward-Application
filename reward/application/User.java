package reward.application;



public class User {
  private int id;
 private String name;
  private String password;
  private int points;
 
  

public User(int id, String name, String password, int points) {
	super();
	this.id = id;
	this.name = name;
	this.password = password;
	this.points = points;
	
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getPassword() {
	return password;
}
public int getPoints() {
	return points;
}
public void updatePoints(int newPoints) {
	this.points+=newPoints;
}

  
}

