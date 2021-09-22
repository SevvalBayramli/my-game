
public class Game {
	private int Id;
	private String GameName;
	private String Category;
	private int Price;
	
	
	public Game(int id, String gameName, String category, int price) {
		super();
		Id = id;
		GameName = gameName;
		Category = category;
		Price= price;
	}
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getGameName() {
		return GameName;
	}
	public void setGameName(String gameName) {
		GameName = gameName;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}


	public int getPrice() {
		return Price;
	}


	public void setPrice(int price) {
		Price = price;
	}

}
