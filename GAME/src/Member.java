
public class Member {
	private int Id;
	private String FirstName;
	private String LastName;
	private String NationalityNumber;
	private int DateOfTime;
	
	
	public Member() {
		super();
		FirstName = getFirstName();
		LastName = getFirstName();
		NationalityNumber = getNationalityNumber();
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getNationalityNumber() {
		return NationalityNumber;
	}
	public void setNationalityNumber(String nationalityNumber) {
		NationalityNumber = nationalityNumber;
	}
	public int getDateOfTime() {
		return DateOfTime;
	}
	public void setDateOfTime(int dateOfTime) {
		DateOfTime = dateOfTime;
	}


}
