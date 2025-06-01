package ar.edu.unq.po2.tpstate.ej2;

public class MusicPlayer {

	private ISong song;
	
	public MusicPlayer() {
		
	}
	
	public void setSong(ISong s) {
		song = s;
	}
	
	public void removeSong(ISong s) {
		song = null;
	}
	
	public void play() throws Exception {
		if(this.song != null) {
			this.song.play();
		} else {throw new Exception("The song hasn't been chosen");}
	}
	
	public void pause() {
		if(song != null) { this.song.pause();}
	}
	
	public void stop() {song = null;}
}
