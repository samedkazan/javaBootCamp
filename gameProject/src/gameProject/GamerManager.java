package gameProject;

public class GamerManager implements GamerSevice {

	@Override
	public void signUp(Gamer gamer) {

		EdevletValidation edevletValidation = new EdevletValidation();

		if (edevletValidation.Validate(gamer) == true) {
			System.out.println("E-devlet Sistemi �le Do�ruland�...");
			System.out.println(gamer.getFirstName() + " Kay�t Yap�ld�...");
		} else {
			System.out.println("Kay�t yap�lamad�, Bilgilerinizi kontrol ediniz...");
		}
	}

	@Override
	public void update(Gamer gamer) {

		EdevletValidation edevletValidation = new EdevletValidation();

		if (edevletValidation.Validate(gamer) == true) {

			System.out.println(gamer.getFirstName() + " Bilgilerini g�ncelledi...");
		} else {
			System.out.println("L�tfen giri� Yap�n�z...");
		}

	}

	@Override
	public void deleted(Gamer gamer) {

		EdevletValidation edevletValidation = new EdevletValidation();

		if (edevletValidation.Validate(gamer) == true) {

			System.out.println(gamer.getFirstName() + " Kayd�n�z silindi...");
		} else {
			System.out.println("L�tfen giri� yap�n�z...");
		}

	}

}
