package movieRatings;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class MovieRating {
    private ArrayList<String[]> movieList = new ArrayList<>();
    private ArrayList<Double> ratings = new ArrayList<>();
    private String dateAndTime;
    private String title;
    private String rating;
    private int listSize;
    private int count;

    public ArrayList<String[]> getMovieList() {
        return movieList;
    }

    public void addMovieToList(String title) {
        setDateAndTime();
        this.movieList.add(new String[]{title, getDateAndTime()});
    }

    public void setDateAndTime() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy  HH:mm:ss");
        this.dateAndTime = formatter.format(date);
    }

    public void compareMovieTitle(String title) {
        for(String[] movie : movieList){
            if(movie[0].equalsIgnoreCase(title)){
                ratings.add(Double.parseDouble(movie[1]));
            }
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
}
