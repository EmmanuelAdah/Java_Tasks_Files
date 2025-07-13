package movieRatings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieRatingTest {
    movieRatings.Movie movie = new movieRatings.Movie();

    @Test
    public void movieListIsEmptyTest(){
        assertTrue(movie.movieListIsEmpty());
    }

    @Test
    public void movieListIsNotEmptyTest(){
        movie.addMovieToList("Semi");
        assertFalse(movie.movieListIsEmpty());
    }

    @Test
    public void addMovieToListTest(){
        movie.addMovieToList("Semi");
        movie.addMovieToList("coco");
        assertEquals(2, movie.movieListSize());
    }

    @Test
    public void removeMovieFromListTest(){
        movie.addMovieToList("Semi");
        movie.addMovieToList("Race");
        movie.removeMovie("Semi");
        assertEquals(1, movie.movieListSize());
    }

    @Test
    public void removeMovieWithSameNameFromListTest(){
        movie.addMovieToList("Semi");
        movie.addMovieToList("coco");
        movie.addMovieToList("Race");
        movie.addMovieToList("Coco");
        movie.removeMovie("coco");
        assertEquals(2, movie.movieListSize());
    }
}