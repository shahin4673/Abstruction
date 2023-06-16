package Code3;

public class DVDPlayer implements Player {

	@Override
	public void play() {
		System.out.println(" Play Video");
		
	}

	@Override
	public void stop() {
		System.out.println(" Stop Video");
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println(" Pause Video");
		
	}

	@Override
	public void reverse() {
		System.out.println(" Reverse Video");
		
	}
	public void video() {
    	System.out.println(" video is Playing");
    	
    }

}
