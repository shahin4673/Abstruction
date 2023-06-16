package Code3;

public class CDPlayer implements Player {

	@Override
	public void play() {
		System.out.println(" Play Audio");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(" Stop Audio");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println(" Play Audio");
		
	}

	@Override
	public void reverse() {
		System.out.println(" Reverse Audio");
		
	}
	
    public void audio() {
    	System.out.println(" Audio is Playing");
    	
    }
}
