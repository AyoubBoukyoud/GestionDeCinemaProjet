// src/model/Movie.java
package model;

public class Movie {
    private final int    id;
    private final String title;
    private final String genre;
    private final int    duration;
    private final String releaseDate;
    private final String posterPath;

    public Movie(int id, String title, String genre, int duration, String releaseDate, String posterPath) {
        this.id          = id;
        this.title       = title;
        this.genre       = genre;
        this.duration    = duration;
        this.releaseDate = releaseDate;
        this.posterPath  = posterPath;
    }
    public int    getId()          { return id; }
    public String getTitle()       { return title; }
    public String getGenre()       { return genre; }
    public int    getDuration()    { return duration; }
    public String getReleaseDate() { return releaseDate; }
    public String getPosterPath()  { return posterPath; }
}
