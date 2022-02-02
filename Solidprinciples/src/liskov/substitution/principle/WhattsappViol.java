package liskov.substitution.principle;

public class WhattsappViol implements SocialMedia
{

	@Override
	public void chatWithFrnds() {
		//logic here
		
	}

	@Override
	public void sharePhotosAndVideos() {
		// logic here
		
	}

	@Override
	public void groupVideoCall() {
		// logic here
		
	}

	@Override
	public void sharePost() {
		// does not support
		
	}

	
}
