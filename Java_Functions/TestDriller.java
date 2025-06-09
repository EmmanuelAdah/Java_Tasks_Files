public class TestDriller {

	public static int priceList (int copies){

		int totalPriceCharged = 0;

		if (copies >= 1 && copies <= 4){
		final int pricePerCopy = 2000;
		totalPriceCharged += (pricePerCopy * copies);
		System.out.printf("The total price for %d copies is %d%n", copies, totalPriceCharged);
		}
		else if (copies >= 5 && copies <= 9){
		final int pricePerCopy = 1800;
		totalPriceCharged += (pricePerCopy * copies);
		System.out.printf("The total price for %d copies is %d%n", copies, totalPriceCharged);
		}
		else if (copies >= 10 && copies <= 29){
		final int pricePerCopy = 1600;
		totalPriceCharged += (pricePerCopy * copies);
		System.out.printf("The total price for %d copies is %d%n", copies, totalPriceCharged);
		}
		else if (copies >= 30 && copies <= 49){
		final int pricePerCopy = 1500;
		totalPriceCharged += (pricePerCopy * copies);
		System.out.printf("The total price for %d copies is %d%n", copies, totalPriceCharged);
		}
		else if (copies >= 50 && copies <= 99){
		final int pricePerCopy = 1300;
		totalPriceCharged += (pricePerCopy * copies);
		System.out.printf("The total price for %d copies is %d%n", copies, totalPriceCharged);
		}
		else if (copies >= 100 && copies <= 199){
		final int pricePerCopy = 1200;
		totalPriceCharged += (pricePerCopy * copies);
		System.out.printf("The total price for %d copies is %d%n", copies, totalPriceCharged);
		}
		else if (copies >= 200 && copies <= 499){
		final int pricePerCopy = 1100;
		totalPriceCharged += (pricePerCopy * copies);
		System.out.printf("The total price for %d copies is %d%n", copies, totalPriceCharged);
		}
		else if (copies >= 500){
		final int pricePerCopy = 1000;
		totalPriceCharged += (pricePerCopy * copies);
		System.out.printf("The total price for %d copies is %d%n", copies, totalPriceCharged);
		}
	return totalPriceCharged;
	}
}