package liskov_substitution.bad.src;

import java.util.ArrayList;

public class Bad {


	public static void main(String[] args) {
		Whatsapp whatsapp = new Whatsapp();
		Instagram instagram = new Instagram();

		whatsapp.sendPhotosAndVideos();
		instagram.sendPhotosAndVideos();

		ArrayList<SocialMedia> socialMediaArrayList = new ArrayList<>();

		//socialMediaArrayList.add(whatsapp);
		socialMediaArrayList.add(instagram);

		for (SocialMedia socialMedia : socialMediaArrayList) {
			socialMedia.sendPhotosAndVideos();
		}

	}

}
