package movieRatings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieRatingTest {
    MovieRating movieRating = new MovieRating();

    @Test
    public void movie_isEmpty_test(){
        assertEquals(0, movieRating.getListSize());
        movieRating.addMovieToList("Semi");
        assertEquals(1, movieRating.getListSize());
    }
}
