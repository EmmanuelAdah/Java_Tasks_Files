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

    public String averageMovieRating() {
        int count = 0;
        for (String[] movie : getMovieList()){
            for (ArrayList<Float> rating : ratingList){
                float total = rating.
                        stream().
                        mapToInt(Float::intValue).
                        sum();
                float average = (total / ratingList.get(count).size());
                if (rating.isEmpty()) average = 0;
                return String.format("Movie Name: %s %nAverage rating: %.1f%n", movie[0], average);
            }
            count++;
        }
        return null;
    }

    public void addMovieRating(String title, String rating) {
        int count = 0;
        for (String[] movie : getMovieList()){
            if (movie[0].equalsIgnoreCase(title)){
                this.ratingList.get(count).add(Float.parseFloat(rating));
            } count++;
        }
    }
}