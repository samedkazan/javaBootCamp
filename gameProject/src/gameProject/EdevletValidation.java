package gameProject;

public class EdevletValidation implements Validation {

	@Override
	public boolean Validate(Gamer gamer) {

		if (gamer.getFirstName() == "Samet" && gamer.getLastName() == "Kazan" && gamer.getBirthYear() == 2000
				&& gamer.getIdentityNumber() == 118943) {

			return true;

		} else {

			return false;
		}
	}

}
