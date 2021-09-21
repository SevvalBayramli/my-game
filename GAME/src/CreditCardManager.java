
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
			System.out.println("İşleminiz başarıyla gerçekleşti!");
		}
		else {
			System.out.println("İşeleminiz gerçekleşemedi!");
		}
		
		return true;
		
	}

}
