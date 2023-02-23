package liskov_substitution.bad.src;

public abstract class SocialMedia {

	public abstract void chatWithFriend();

	public abstract void publishPost(Object post);

	public abstract void publishStatus(Object post);

	public abstract void sendPhotosAndVideos();

	public void refreshPost() {
		//doSomething
	}

	public void refreshStatus() {
		//doSomething
	}
}
