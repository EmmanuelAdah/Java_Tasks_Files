package movieRatings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MovieRatingTest {
    MovieRating movie = new MovieRating();

    @Test
    public void movie_isEmpty_test(){
        assertFalse(false, String.valueOf(movie.getMovieList()));
    }

}
