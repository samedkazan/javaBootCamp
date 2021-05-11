package gameProject;

public class Main {

	public static void main(String[] args) {

		Gamer gamer = new Gamer();
		gamer.setFirstName("Samet");
		gamer.setLastName("Kazan");
		gamer.setBirthYear(2000);
		gamer.setIdentityNumber(118943);
		gamer.setCart("");
		gamer.setGame("");
		////////////////////////////////////////////////////////
		Campaign campaign = new Campaign();
		campaign.setCampaignName("İlk satın alımda %25 indirim");
		Campaign campaign1 = new Campaign();
		campaign1.setCampaignName("Dev Ramazan Kampanyası ile %50 indirim");
		Campaign campaign2 = new Campaign();
		campaign2.setCampaignName("Seçili ürünlerde 2 al 1 öde");
		////////////////////////////////////////////////////////
		Game game = new Game();
		game.setGameName("League of Legends");
		Game game1 = new Game();
		game1.setGameName("Call Of Duty 2");
		////////////////////////////////////////////////////////
		GamerManager gamerManager = new GamerManager();
		gamerManager.signUp(gamer);
		gamerManager.update(gamer);
		////////////////////////////////////////////////////////
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addToCart(gamer, campaign);
		campaignManager.addToCart(gamer, campaign2);
		///////////////////////////////////////////////////////
		GameManager gameManager = new GameManager();
		gameManager.addGame(gamer, game);
		gameManager.addGame(gamer, game1);
		////////////////////////////////////////////////////////
		System.out.println(gamer.getFirstName() + " Mevcut bulunan kampanyaları : " + gamer.getCart());
		System.out.println(gamer.getFirstName() + " Mevcut Oyunları : " + gamer.getGame());

	}

}
