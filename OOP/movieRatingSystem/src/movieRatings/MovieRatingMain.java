import java.util.Scanner;

public class MovieRatingMain {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);


        String movieMenu = """
                Welcome to the Movie Rating System!
                Press:-
                1 > Add Movie
                2 > Rate a movie
                3 > View movie ratings
                4 > Average movie rating
                5 > Remove a movie from list
                6 > Exit
                """;
        boolean movies = true;
        while (movies) {
            System.out.println(movieMenu);
            int choice = scan.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter movie name:");
                    String movieName = scan.next();
                    movieRating.addMovieToList(movieName);
                }
                case 2 -> {

                }
            }
        }
    }
}
