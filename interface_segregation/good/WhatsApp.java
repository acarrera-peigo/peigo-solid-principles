package interface_segregation.good;

public class WhatsApp implements SocialMedia, SocialVideoCallManager {

	public void chatWithFriend() {

	}

	public void sendPhotosAndVideos() {

	}

	public void groupVideoCall(String... users) {

	}
}
