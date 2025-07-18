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
            for (ArrayList<Float> rating : ratingList){
                double total = 0;
                for (Float ratingValue : rating){
                    total += ratingValue;
                }
                float average = (float)(total / ratingList.get(count).size());
                System.out.printf("Movie Name: %s  Average rating: %.1f%n", movie[0], average);
            }
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