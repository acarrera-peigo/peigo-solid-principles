package interface_segregation.bad;

public interface SocialMedia {

	//@support WhatsApp,Instagram
	void chatWithFriend();

	//@support Instagram
	void publishPost(Object post);

	//@support WhatsApp,Instagram
	void sendPhotosAndVideos();

	//@support WhatsApp
	void groupVideoCall(String... users);
}
