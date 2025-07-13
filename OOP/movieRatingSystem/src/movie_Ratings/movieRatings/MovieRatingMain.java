package movieRatings;
import java.util.Scanner;

public class MovieRatingMain {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        Rating rating = new Rating();

        String movieMenu = """
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
        boolean movies = true;
        while(movies){
            System.out.printf("%s%nEnter your choice: ",movieMenu);
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter movie title: ");
                    String title = sc.next();
                    rating.addMovieToList(title);
                    rating.addListToRatingList();
                    break;
                case 2:
                    System.out.print("Enter movie name: ");
                    String name = sc.next();
                    System.out.print("Enter movie rating: ");
                    float rate = sc.nextFloat();
                    break;
                case 3:
                    if (!rating.movieListIsEmpty()){
                        rating.averageMovieRating();
                    } else {
                        System.out.println("There is no movie in the list");
                    } break;
                case 4:
                    System.out.println("Thank you for using Vince Movies \nGoodBye!...");
                    movies = false;
            }
        }
    }
}