public class CurrentTime {

	public static void main(String[] args){

	long currentTime = System.currentTimeMillis ();

	long totalSeconds = currentTime / 1000;
	long currentSeconds = totalSeconds % 60;

	long totalMinutes = totalSeconds / 60;
	long currentMinutes = totalMinutes % 60;

	long totalHours = totalSeconds / 60;
	long currentHour = totalHours % 24;

	System.out.printf("The time is %d : %d : %d%n", currentHour, currentMinutes, currentSeconds);
	}
}