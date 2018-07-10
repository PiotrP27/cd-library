package cd_library.CD;

import cd_library.Genre;
import cd_library.TimeUtil;
import cd_library.track.Track;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class CD {
    private UUID uuid;
    private String title;
    private String artist;
    private int releaseYear;
    private String producer;
    private List<Track> tracks;
    private boolean original;
    private int discCount;

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public boolean isOriginal() {
        return original;
    }

    public void setOriginal(boolean original) {
        this.original = original;
    }

    public int getDiscCount() {
        return discCount;
    }

    public void setDiscCount(int discCount) {
        this.discCount = discCount;
    }

    public int getTotalTime() {
        if (tracks != null) {
            return tracks.stream()
                    .mapToInt(track -> track.getTime())
                    .sum();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        String result = "Title: " + title +
                ", UUID: " + uuid +
                ", artist: " + artist +
                ", release year: " + releaseYear +
                ", producer: " + producer +
                ", total time: " + TimeUtil.intTimeToString(getTotalTime());
        //TODO ", genre: " + genre.getDescription() + "\n";
        if (original) {
            result += "CD is original\n";
        }
        result += "disc count: " + discCount +
                "\nTracks:\n";
        for (int i = 0; i < tracks.size(); i++) {
            result += (i + 1) + " " + tracks.get(i).toString() + "\n";
        }
        return result;
    }

    public Set<Genre> getGenres() {
        return tracks.stream()
                .flatMap(track -> track.getGenres().stream())
                .collect(Collectors.toSet());
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public UUID getUuid() {
        return uuid;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}
