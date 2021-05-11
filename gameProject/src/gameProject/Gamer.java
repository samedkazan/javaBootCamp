package gameProject;

public class Gamer {

	private int id;
	private String firstName;
	private String lastName;
	private int birthYear;
	private long ýdentityNumber;
	private String cart;
	private String game;

	public Gamer(int id, String firstName, String lastName, int birthYear, long identityNumber, String cart,String game) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.cart= cart;
		this.game = game; 
		ýdentityNumber = identityNumber;
	}

	public Gamer() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public long getIdentityNumber() {
		return ýdentityNumber;
	}

	public void setIdentityNumber(long identityNumber) {
		ýdentityNumber = identityNumber;
	}

	public String getCart() {
		return cart;
	}

	public void setCart(String cart) {
		this.cart = cart;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

}
