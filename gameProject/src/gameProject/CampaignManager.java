package gameProject;

public class CampaignManager {
	public void addToCart(Gamer gamer, Campaign campaign) {
		gamer.setCart(gamer.getCart() +" "+ campaign.getCampaignName());
		System.out.println("Kampanya eklendi : " + campaign.getCampaignName() +" : "+ gamer.getFirstName() );
		
	}
}
