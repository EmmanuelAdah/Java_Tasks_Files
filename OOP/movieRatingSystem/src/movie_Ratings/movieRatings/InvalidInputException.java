package movieRatings;

public class InvalidInputException extends RuntimeException{
    public InvalidInputException(String message){
        System.out.println("Invalid input! Please try again.");
    }
}
