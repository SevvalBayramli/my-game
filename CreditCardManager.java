

public class CreditCardManager extends BaseSaleManager implements ICreditCardService {

	double FinalPrice;
	boolean a;
	@Override
	public boolean AddCreditCard() {
		System.out.println("Kartýnýz baþarýyla eklendi!");
		return a=true;
	}
	
	@Override
	public void Sale(Member member,Game game,Offer offer) {
		if(a==true) {
			FinalPrice=((game.getPrice()/4)*3);
		System.out.println("Satýþ baþarýyla gerçekleþti!");
		System.out.println("Ýndirimli fiyatý "+FinalPrice+"TL'dir");
		}
		else {
			System.out.println("Satýþ gerçekleþmedi!");
		}
	}

	
		
}
	

