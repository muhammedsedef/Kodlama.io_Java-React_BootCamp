package core.adapters;

import googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements GoogleAuthServiceAdapter {

	@Override
	public void register(String email) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.register(email);
	}

	@Override
	public void login(String email) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.login(email);
	}

}
