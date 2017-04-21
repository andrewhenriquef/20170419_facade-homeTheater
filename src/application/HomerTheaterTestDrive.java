package application;

import equipments.Amplifier;
import equipments.CdPlayer;
import equipments.DvdPlayer;
import equipments.PopcornPopper;
import equipments.Projector;
import equipments.Screen;
import equipments.TheaterLights;
import equipments.Tuner;

public class HomerTheaterTestDrive {

	public static void main(String[] args) {
		

		Amplifier amplifier = new Amplifier();
		CdPlayer cd = new CdPlayer();
		DvdPlayer dvd = new DvdPlayer();
		PopcornPopper popcorn = new PopcornPopper();
		Projector projector = new Projector();
		Screen screen = new Screen();
		TheaterLights lights = new TheaterLights();
		Tuner tuner = new Tuner();
		
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, 
				cd,
				dvd,
				popcorn,
				projector, 
				screen,
				lights,
				tuner);

		homeTheater.watchMovie("Star Wars");
		homeTheater.endMovie();
	}
	

}
