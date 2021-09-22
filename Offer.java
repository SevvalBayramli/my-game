
public class Offer {
	
	private int Discount;
	private String OfferName;
	private int Day;
	
	public Offer(int discount, String offerName, int day) {
		super();
		Discount = discount;
		OfferName = offerName;
		Day = day;
	}
	
	public int getDiscount() {
		return Discount;
	}
	public void setDiscount(int discount) {
		Discount = discount;
	}
	public String getOfferName() {
		return OfferName;
	}
	public void setOfferName(String offerName) {
		OfferName = offerName;
	}
	public int getDay() {
		return Day;
	}
	public void setDay(int day) {
		Day = day;
	}

}
