package movieRatings;

import java.util.ArrayList;

public class MovieRating {
    private ArrayList<String> movieList = new ArrayList<>();
    private String title;
    private double rating;
    private boolean state;

    public ArrayList<String> getMovieList() {
        return movieList;
    }

    public void addMovieToList(String title) {
        movieList.add(title);
    }

    public void setListSize() {
        this.state = (!movieList.isEmpty());

    }

    public boolean getListState() {
        return state;
    }
}
