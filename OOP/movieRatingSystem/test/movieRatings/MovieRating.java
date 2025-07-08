package movieRatings;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class MovieRating {
    private ArrayList<String[]> movieList = new ArrayList<>();
    private ArrayList<ArrayList<Double>> ratingList = new ArrayList<>();
    private String dateAndTime;
    private int listSize;

    public ArrayList<String[]> getMovieList() {
        return movieList;
    }

    public void addMovieToList(String title) {
        validateDateAndTime();
        this.movieList.add(new String[]{title, getDateAndTime()});
        this.ratingList.add(new ArrayList<>());
    }

    private void validateDateAndTime() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy hh:mm");
        this.dateAndTime = formatter.format(date);
    }

    public void addMovieRatings(String title, double rating) {
        int count = 0;
        for(String[] movie : movieList){
            if(movie[0].equalsIgnoreCase(title)) this.ratingList.get(count).add(rating);
            count++;
        }
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public int getListSize() {
        this.listSize = movieList.size();
        return listSize;
    }

    public void removeMovieFromList(String title) {
        int count = 0;
        for(String[] movie : movieList){
            if(movie[0].equalsIgnoreCase(title)) {
                this.ratingList.remove(count);
                this.movieList.remove(count);
            }
            count++;
        }
    }

    public void rateMovie(String title, double rating) {
        int count = 0;
        for(String[] movie : movieList) {
            if (movie[0].equalsIgnoreCase(title)) {
                if (rating < 0 || rating > 5) throw new RatingOutOfBoundException("Rating is from 1-5");
                ratingList.get(count).add(rating);
            } count++;
        }
    }

    public ArrayList<ArrayList<Double>> getRatingList() {
        return this.ratingList;
    }
}