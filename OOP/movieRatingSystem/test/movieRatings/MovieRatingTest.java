package movieRatings;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MovieRatingTest {
    MovieRating movieRating = new MovieRating();

    @Test
    public void movieListIsEmptyTest(){
        assertFalse(movieRating.getListSize() > 0);
    }

    @Test
    public void movieListIsNotEmptyTest(){
        movieRating.addMovieToList("Semi");
        assertTrue(movieRating.getListSize() > 0);
    }

    @Test
    public void addMovieToListTest(){
        movieRating.addMovieToList("Coco");
        assertEquals(1, movieRating.getListSize());
        movieRating.addMovieToList("Baghban");
        assertEquals(2, movieRating.getListSize());
    }


    @Test
    public void rateMovieInListTest(){
        movieRating.addMovieToList("Semi");
        movieRating.addMovieToList("Coco");
        movieRating.addMovieToList("Baghban");
        movieRating.rateMovie("semi",2.3);
        movieRating.rateMovie("coco",4.5);
        movieRating.rateMovie("coco",4.2);
        ArrayList<ArrayList<Double>> list = movieRating.getRatingList();
        assertEquals(list, movieRating.getRatingList());
    }
}