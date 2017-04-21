package equipments;

public class Amplifier {

	Tuner tuner;
	DvdPlayer dvdPlayer;
	CdPlayer cdPlayer;
	
	public void on(){
		System.out.println("Amplificador on");
	}
	
	public void off(){
		System.out.println("Amplificador off");
	}
	
	public void setCd(){
		cdPlayer.on();
		cdPlayer.eject();
		cdPlayer.play();
	}
	
	public void setDvd(DvdPlayer dvd){
		dvdPlayer = dvd;
		dvdPlayer.on();

	}
	
	public void setStereoSound(){
		dvdPlayer.setTwoChannelAudio();
	}
	
	public void setSurroundSound(){
		dvdPlayer.setSurrounfAudio();
	}
	
	public void setTuner(){
		tuner.on();
	}
	
	public void setVolume(int volume){
		System.out.println("Volume " + volume);
	}
}
