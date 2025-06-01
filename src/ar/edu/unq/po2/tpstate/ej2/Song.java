package ar.edu.unq.po2.tpstate.ej2;

public class Song {

	private SongState state;
	
	public Song() {state = new Paused();}
	
	public void play() {
		state = this.state.play();
	}
	
	public void pause() {
		state = this.state.pause();}
	
	public void stop() {}
}
