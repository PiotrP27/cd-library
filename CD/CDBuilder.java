package cd_library.CD;

import cd_library.Genre;
import cd_library.track.Track;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CDBuilder {
    private UUID uuid;
    private String title;
    private String artist;
    private int releaseYear;
    private String producer;
    private boolean isOriginal;
    private int discCount;
    private List<Track> tracks = new ArrayList<>();

    public CDBuilder setUUID(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    public CDBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public CDBuilder setArtist(String artist) {
        this.artist = artist;
        return this;
    }

    public CDBuilder setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
        return this;
    }

    public CDBuilder setProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public CDBuilder setIsOriginal(boolean isOriginal) {
        this.isOriginal = isOriginal;
        return this;
    }

    public CDBuilder setDiscCount(int discCount) {
        this.discCount = discCount;
        return this;
    }

    public CDBuilder setTrack(Track track) {
        tracks.add(track);
        return this;
    }

    public CDBuilder setTracks(List<Track> tracks) {
        this.tracks.addAll(tracks);
        return this;
    }

    public CD build() {
        return new CD(uuid, title, artist, releaseYear, producer, tracks, isOriginal, discCount);
    }
}
