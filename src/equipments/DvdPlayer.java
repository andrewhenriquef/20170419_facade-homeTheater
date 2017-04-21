package equipments;

public class DvdPlayer {

	Amplifier amplifier;
	
	public void on(){
	
		System.out.println("CD on");
	
	}
	
	public void off(){
	
		System.out.println("CD off");
	
	}
	
	public void eject(){
	
		System.out.println("eject");
	
	}
	
	public void pause(){
		
		System.out.println("pause");
	
	}
	
	public void play(String movie){
	
		System.out.println("Play " + movie);
	
	}
	
	public void stop(){
		
		System.out.println("stop");
	
	}

	public void setSurrounfAudio(){
		
		System.out.println("surround audio");
	
	}

	public void setTwoChannelAudio(){
		
		System.out.println("two channel audio");
	
	}

	
}

