package gameProject;

public class GamerManager implements GamerSevice {

	@Override
	public void signUp(Gamer gamer) {

		EdevletValidation edevletValidation = new EdevletValidation();

		if (edevletValidation.Validate(gamer) == true) {
			System.out.println("E-devlet Sistemi Ýle Doðrulandý...");
			System.out.println(gamer.getFirstName() + " Kayýt Yapýldý...");
		} else {
			System.out.println("Kayýt yapýlamadý, Bilgilerinizi kontrol ediniz...");
		}
	}

	@Override
	public void update(Gamer gamer) {

		EdevletValidation edevletValidation = new EdevletValidation();

		if (edevletValidation.Validate(gamer) == true) {

			System.out.println(gamer.getFirstName() + " Bilgilerini güncelledi...");
		} else {
			System.out.println("Lütfen giriþ Yapýnýz...");
		}

	}

	@Override
	public void deleted(Gamer gamer) {

		EdevletValidation edevletValidation = new EdevletValidation();

		if (edevletValidation.Validate(gamer) == true) {

			System.out.println(gamer.getFirstName() + " Kaydýnýz silindi...");
		} else {
			System.out.println("Lütfen giriþ yapýnýz...");
		}

	}

}
