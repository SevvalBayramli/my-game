
public abstract class BaseSaleManager implements ICheckMemberService{


	@Override
	public boolean Verification(Member member) {
		System.out.println("Kullanýcý doðrulandý");
		return true;
	}
	

}
