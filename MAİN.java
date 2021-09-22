
public class MAÝN {
	
	public static void main(String[] args) {
		Member member1=new Member(1,"Þevval","Bayramlý","11111111111",2002);
		
		MemberManager memberManager=new MemberManager();
		memberManager.Add(member1);
		memberManager.Remove(member1);
		memberManager.Update(member1);
		
		System.out.println("-----------------------------");
		
		Offer offer1 =new Offer(25, "Yaz Sezonu Ýndirimi", 3);
		
		OfferManager offerManager=new OfferManager();
		offerManager.Add(offer1);
		offerManager.Remove(offer1);
		offerManager.Update(offer1);
		
		System.out.println("-----------------------------");

		
		Game game1 =new Game(0001,"PUBG","Hayatta Kalma",1200);
		System.out.println("Oyunun adý: "+game1.getGameName());
		
		System.out.println("-----------------------------");

		CreditCardManager creditCardManager= new CreditCardManager();
		creditCardManager.AddCreditCard();
		creditCardManager.Sale(member1, game1, offer1);
		
		System.out.println("-----------------------------");

		
	}
}

