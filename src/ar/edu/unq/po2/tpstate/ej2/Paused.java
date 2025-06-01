package ar.edu.unq.po2.tpstate.ej2;

public class Paused extends SongState {

	public SongState play() {
		return new Playing();
	}
	
	public SongState pause() {
		return new Playing();
	}
	
}
