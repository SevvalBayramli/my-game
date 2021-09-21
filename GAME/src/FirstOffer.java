
public class FirstOffer extends BaseOfferManager {
	@Override
	public void Suitability(Member member) {
		if(member.getDateOfTime()<2004)
			System.out.println(member.getFirstName()+" "+member.getLastName()+" seçili kampanyaya katýlabilir.");
		else
			System.out.println(member.getFirstName()+" "+member.getLastName()+" seçili kampanyaya katýlamaz.");
		
	}
	
	
	

}
