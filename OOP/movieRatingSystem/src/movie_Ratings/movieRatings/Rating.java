package movieRatings;
import java.util.ArrayList;

public class Rating extends Movie {
    private ArrayList<ArrayList<Double>> ratingList = new ArrayList<>();

    public void addListToRatingList() {
        this.ratingList.add(new ArrayList<>());
    }

    public boolean getRatingListSize() {
        return this.ratingList.isEmpty();
    }
}
