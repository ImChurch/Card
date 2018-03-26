
public class BillfoldTester {
	public static void main(String[] args) {
		IdCard id = new IdCard("James", 12345);
		DriversLicense driver = new DriversLicense("James", 1920);
		DriversLicense driver2 = new DriversLicense("Joeseph", 1945);
		CallingCard call = new CallingCard("Jeremy", 1292, 124510);
		Billfold formating = new Billfold(id, driver);
		Billfold summary = new Billfold(id, driver);

		
		formating.formatCards(id, call);
		System.out.println("card is expired: " + call.isExpired(driver.getExpirationYear()));
		System.out.println("number of expired cards: " + summary.getExpiredCardCount(driver2, driver));
		
	}

}