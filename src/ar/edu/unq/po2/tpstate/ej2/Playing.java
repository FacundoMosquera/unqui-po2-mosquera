package ar.edu.unq.po2.tpstate.ej2;

public class Playing extends SongState{

	public SongState play() {
		return this;
	}
	
	public SongState pause() {
		return new Paused();
	}
}
