package Code3;

public class Test {

	public static void main(String[] args) {
		CDPlayer cp = new CDPlayer();
		cp.play();
		cp.stop();
		cp.pause();
		cp.reverse();
		cp.audio();
		System.out.println("");
		DVDPlayer dp = new DVDPlayer();
		dp.play();
		dp.stop();
		dp.pause();
		dp.reverse();
		dp.video();

	}

}
