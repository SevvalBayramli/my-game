
public class CreditCardManager extends BaseSaleManager {
	
	ICheckMemberService iCheckMemberService;
	
	public CreditCardManager(ICheckMemberService iCheckMemberService) {
		this.iCheckMemberService=iCheckMemberService;
	}
	public CreditCardManager() {
		
	}
	
	@Override
	public boolean Verification(Member member) {
		if(iCheckMemberService.Verification(member)==true) {
			System.out.println("Ýþleminiz baþarýyla gerçekleþti!");
		}
		else {
			System.out.println("Ýþeleminiz gerçekleþemedi!");
		}
		
		return true;
		
	}

}
