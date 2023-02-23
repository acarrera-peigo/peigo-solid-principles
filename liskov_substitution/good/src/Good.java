package liskov_substitution.good.src;


import java.util.ArrayList;

public class Good {


	public static void main(String[] args) {
		WhatsApp whatsapp = new WhatsApp();
		Instagram instagram = new Instagram();

		whatsapp.sendPhotosAndVideos();
		instagram.sendPhotosAndVideos();

		ArrayList<SocialMedia> socialMediaArrayList = new ArrayList<>();

		socialMediaArrayList.add(whatsapp);
		socialMediaArrayList.add(instagram);

		for (SocialMedia socialMedia : socialMediaArrayList) {
			socialMedia.sendPhotosAndVideos();
		}

	}

}
