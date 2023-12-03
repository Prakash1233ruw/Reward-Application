package reward.application;

public class GiftCard {
  String Catagory;
  String name;
  int pointsRequired;
  double value;
public String getCatagory() {
	return Catagory;
}
public String getName() {
	return name;
}
public int getPointsRequired() {
	return pointsRequired;
}
public double getValue() {
	return value;
}
public GiftCard(String catagory, String name, int  pointsRequired, double value) {
	super();
	Catagory = catagory;
	this.name = name;
	this.pointsRequired = pointsRequired;
	this.value = value;
}
@Override
public String toString() {
	return "GiftCard [Catagory=" + Catagory + ", name=" + name + ", pointsRequired=" + pointsRequired + ", value="
			+ value + "]";
}

}
