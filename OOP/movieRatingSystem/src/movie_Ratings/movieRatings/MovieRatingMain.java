package movieRatings;
import javax.swing.*;
import java.util.Scanner;

public class MovieRatingMain {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        Rating rating = new Rating();

        boolean movies = true;
        while(movies){
            String choice = JOptionPane.showInputDialog(movieMenu());
            switch(choice){
                case "1":
                    String title = JOptionPane.showInputDialog("Enter movie title: ");
                    rating.addMovieToList(title);
                    rating.addListToRatingList();
                    JOptionPane.showMessageDialog(null,title + " was added successfully!...");
                    break;
                case "2":
                    String movieName = JOptionPane.showInputDialog("Enter movie name: ");
                    if (rating.getMovieList().stream().noneMatch(movie -> movie[0].equalsIgnoreCase(movieName))){
                        JOptionPane.showMessageDialog(null, "Movie does not exist!");
                    } else {
                        String rate = JOptionPane.showInputDialog("Enter movie rating: ");
                        rating.addMovieToList(movieName);
                        rating.addMovieRating(movieName, rate);
                        JOptionPane.showMessageDialog(null, "Rating added successfully!");
                    } break;
                case "3":
                    if (!rating.movieListIsEmpty()){
                        JOptionPane.showMessageDialog(null, rating.averageMovieRating());
                    } else {
                        JOptionPane.showMessageDialog(null, "There is no movie in the list");
                    } break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Thank you for using Vince Movies \nGoodBye!...");
                    movies = false;
                    break;
                default:
                    System.out.println("Invalid option. try again!...");
            }
        }
    }

    public static String movieMenu(){
        return """
                ===========================
                Welcome to Vince Movies
                ===========================
                Press:-
                ---------------------------
                1 -> Add movie
                2 -> Rate a movie
                3 -> View average ratings
                4 -> Exit
                ===========================
                """;
    }
}