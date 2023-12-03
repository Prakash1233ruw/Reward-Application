package reward.application;


public class MainApp {

	public static void main(String[] args) throws InterruptedException  {
		
	

	
	 RewardManager rewardManager1=new RewardManager();
	 rewardManager1.giftControl();
	
	 Thread.sleep(10000);

	 RewardManager rewardManager2=new RewardManager();
	 rewardManager2.giftControl();
	 
	 Thread.sleep(10000);

	 RewardManager rewardManager3=new RewardManager();
	 rewardManager3.giftControl();

		
	}

}
