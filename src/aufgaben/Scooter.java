package aufgaben;

import java.util.Scanner;

public class Scooter {
	
	public static class Offer{
		private String name;
		private double unlockFee;
		private double costsPerKilometer;
		
		public Offer(String name, double unlockFee, double costsPerKilometer) {
			this.name = name;
			this.unlockFee = unlockFee;
			this.costsPerKilometer = costsPerKilometer;
		}
		
		public String getName() {
			return this.name;
		}
		
		public double getUnlockFee() {
			return this.unlockFee; 
		}
		
		public double getCostsProKilometer() {
			return this.costsPerKilometer;
		}
			
		
	}
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Offer offer1 = new Offer("Offer 1", 1, 1); 
		Offer offer2 = new Offer("Offer 2", 0, 1.5); 
		Offer offer3 = new Offer("Offer 3", 5, 0); 
		Offer offer4 = new Offer("Offer 4", 1, 1.10);
		
		Offer[] offers = {offer1,offer2,offer3,offer4};
		System.out.println("Please enter the distance in meter");
		double km = (scan.nextInt() / 1000.0);
		
		System.out.println(km + "km. should be driven. The scooter has been unlocked. "
				+ "There are 4 offers for you:\n");
		
		for(int i = 0; i < offers.length; i++) {
			Offer object = offers[i];
			String offerMsg = object.getName()+" with unlock fee " + object.getUnlockFee() +
					"€ and cost "+  object.getCostsProKilometer() +"€ per 1 kilometer.";
			System.out.println(offerMsg);
		}
		
		System.out.println("But there's an Offer 5, which can help you to find"
				+ " the best offer from above, according to your entered kilometers.");
		System.out.println("Choose an offer option from 1 to 5.");
		int choice = scan.nextInt();
		Offer choiceOffer = null;
		switch (choice) {
	        case 1:
	        	choiceOffer = offers[0];
	        	break;
	        case 2:
	        	choiceOffer = offers[1];
	        	break;
	        case 3:
	        	choiceOffer = offers[2];
	        	break;
	        case 4:
	        	choiceOffer = offers[3];
	        	break;
	        case 5:
	        	choiceOffer = findBestOffer(km, offers);
	        }

		if (choice != 5) {
			System.out.println("Your offer is "+ choiceOffer.getName()+ ""
					+ " and it costs " + getPrice(choiceOffer, km)+"€");
		}
		
		System.out.println("Thank you that you have chosen the " + choiceOffer.getName());
        	
	}
	public static Offer findBestOffer(double kilometers, Offer[] offersArray) {
	    double bestPrice = Double.MAX_VALUE; 
	    Offer bestOffer = null; 
	    
	    for (Offer offer : offersArray) {
	        double totalCost = getPrice(offer, kilometers);

	        if (totalCost < bestPrice) {
	            bestPrice = totalCost;
	            bestOffer = offer;
	        }
	    }

	    if (bestOffer != null) {
	    	String  roundedBestPrice = String.format("%.2f", bestPrice);
	        System.out.println("Best offer: " + bestOffer.getName() + " with total cost " + roundedBestPrice + "€");
	    } else {
	        System.out.println("No offers available.");
	    }

	    return bestOffer;
	}
	public static double getPrice(Offer offer, double kilometers) {
		double totalCost = offer.getUnlockFee() + offer.getCostsProKilometer() * kilometers;
		return totalCost;
	}

}
