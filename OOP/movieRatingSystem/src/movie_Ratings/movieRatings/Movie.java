package movieRatings;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Movie {
    private ArrayList<String[]> movieList = new ArrayList<>();
    private String dateAndTime;

    public boolean movieListIsEmpty(){
        return movieList.isEmpty();
    }

    private void validateDateAndTime() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy hh:mm a");
        this.dateAndTime = formatter.format(date);
    }

    public void addMovieToList(String title) {
        this.movieList.add(new String[]{title, dateAndTime});

    }

    public int movieListSize() {
        return this.movieList.size();
    }

    public void removeMovie(String title) {
        this.movieList.removeIf(movie -> movie[0].equalsIgnoreCase(title));
    }

    public ArrayList<String[]> getMovieList() {
        return this.movieList;
    }
}