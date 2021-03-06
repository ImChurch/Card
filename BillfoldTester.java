
public class BillfoldTester {
	public static void main(String[] args) {
		IdCard id = new IdCard("Jonathan", 12345);
		DriversLicense driver = new DriversLicense("Jonathan", 1920);
		DriversLicense driver2 = new DriversLicense("Joeseph", 1945);
		CallingCard call = new CallingCard("Jotaro", 1292, 124510);
		Billfold formatting = new Billfold(id, driver);
		
		formatting.formatCards(id, call);
		System.out.println(driver.getName() + "'s card is expired: " + call.isExpired(driver.getExpirationYear()));
		System.out.println("number of expired cards: " + formatting.getExpiredCardCount(driver2, driver));
	}
}
