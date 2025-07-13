package movieRatings;
import java.util.ArrayList;

public class Rating extends Movie {
    private ArrayList<ArrayList<Float>> ratingList = new ArrayList<>();

    public void addListToRatingList() {
        this.ratingList.add(new ArrayList<>());
    }

    public boolean getRatingListSize() {
        return this.ratingList.isEmpty();
    }

    public void averageMovieRating() {
        int count = 0;
        for (String[] movie : getMovieList()){
            double sum = 0;
            for (int index = 0; index < ratingList.get(count).size(); index++){
                sum += ratingList.get(count).get(index);
            }
            float average = (float) (sum / ratingList.get(count).size());
            System.out.printf("%s  %.1f%n", movie[0], average);
            count++;
        }
    }

    public void addMovieRating(String title, float rating) {
        int count = 0;
        for (String[] movie : getMovieList()){
            if (movie[0].equalsIgnoreCase(title)){
                this.ratingList.get(count).add(rating);
            } count++;
        }
    }
}