package cd_library.track;

import cd_library.Genre;
import cd_library.TimeUtil;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Set;
import java.util.stream.Collectors;



@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Track {
    private String title;
    private int time;
    private String artist;
    private Set<Genre> genres;

//    public Track(String title, int time, String artist, Set<Genre> genres) {
//        this.title = title;
//        this.time= time;
//        this.artist = artist;
//        this.genres = genres;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }



    @Override
    public String toString() {
        return "Title: " + title +
                ", time: " + TimeUtil.intTimeToString(time) +
                ", artist: " + artist +
                ", genres: " + getGenresDescription();
    }

    private String getGenresDescription() {
        return genres.stream()
                .map(Genre::getDescription)
                .collect(Collectors.joining(", "));
    }
}
