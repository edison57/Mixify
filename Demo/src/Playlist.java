import java.util.ArrayList;

public class Playlist {
	
	ArrayList<Song> thePlaylist = new ArrayList<Song>();
	
	public Playlist() {
		//creates empty playlist
	}
	
	public Playlist(ArrayList<Song> thePlaylist) {
		this.thePlaylist = thePlaylist;
	}
	
	public void addSong(Song theSong) {
		thePlaylist.add(theSong);
	}
	
	public void clear() {
		thePlaylist = new ArrayList<Song>();
	}
	
	public Playlist matches(Playlist otherPlaylist) {
		Playlist matchedPlaylist = new Playlist();
		
		for (Song checkSong : thePlaylist) {
			if (otherPlaylist.thePlaylist.contains(checkSong) && !matchedPlaylist.thePlaylist.contains(checkSong)) {
				matchedPlaylist.addSong(checkSong);
			}
		}
		
		return matchedPlaylist;
	}
	
	@Override
	public String toString() {
		String output = "Song		Artist		Length\n";
		for (Song checkSong : thePlaylist) {
			output = output + checkSong.name + "\t\t" + checkSong.artist + "\t\t" + checkSong.length + "\n";
		}
		return output;
	}
	
}
