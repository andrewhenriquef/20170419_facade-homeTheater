package application;

import equipments.*;

public class HomeTheaterFacade {

	Amplifier amplifier;
	CdPlayer cd;
	DvdPlayer dvd;
	PopcornPopper popcorn;
	Projector projector;
	Screen screen;
	TheaterLights lights;
	Tuner tuner;
	
	public HomeTheaterFacade(
			Amplifier amplifier,
			CdPlayer cd, 
			DvdPlayer dvd, 
			PopcornPopper popcorn,
			Projector projector,
			Screen screen,
			TheaterLights lights,
			Tuner tuner){
		this.amplifier = amplifier;
		this.cd = cd;
		this.dvd = dvd;
		this.popcorn = popcorn;
		this.projector = projector;
		this.screen = screen;
		this.lights = lights;
		this.tuner = tuner;
		
	}
	
	public void watchMovie(String movie){
		System.out.println("Get ready to watch a movie ...");
		popcorn.on();
		popcorn.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amplifier.on();
		amplifier.setDvd(dvd);
		amplifier.setSurroundSound();
		amplifier.setVolume(6);
		dvd.on();
		dvd.play(movie);
	}
	
	public void endMovie(){
		System.out.println("Shutting movie Theather down...");
		popcorn.off();
		lights.on();
		screen.up();
		projector.off();
		amplifier.off();
		dvd.stop();
		dvd.off();		
		
	}
	
}
