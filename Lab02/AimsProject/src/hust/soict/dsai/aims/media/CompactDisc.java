package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();

	public CompactDisc() {
		super();
	}
	
    public CompactDisc(String title, String category, float cost, String artist) {
        super();
        this.title = title;
        this.cost = cost;
        this.artist = artist;
    }

	public String getArtist() {
		return artist;
	}
	
	public List<Track> getTrack() {
		return tracks;
	}

	public int addTrack(Track track) {
		if (findTrack(track) == -1) {
			tracks.add(track);
			System.out.println("Added track: " + track.getTitle());
			return 1;
		} else {
			System.out.println("Track already added!");
			return 0;
		}
	}

	public int removeTrack(Track track) {
		int i = findTrack(track);
		if (i != -1) {
			tracks.remove(i);
			System.out.println("Removed track: " + track.getTitle());
			return 1;
		} else {
			System.out.println("Track not found!");
			return 0;
		}
	}

	private int findTrack(Track track) {
		for (int i = 0; i < tracks.size(); i++) {
			if (tracks.get(i).equals(track)) {
				return i;
			}
		}
		return -1;
	}

	public int getLength() {
		int length = 0;
		for (Track i : tracks) {
			length += i.getLength();
		}
		return length;
	}

	public void play() {
		for (Track track : tracks) {
			track.play();
		}
	}

	@Override
	public String toString() {
		return "CD: " + getTitle() + ", Artist: " + getArtist() + ", Category: " + getCategory() + ", Cost: "
				+ getCost();
	}
}
