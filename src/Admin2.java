



import java.sql.SQLException;
import java.util.Scanner;

public class Admin2 {

	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		MeetingServiceImpl2 m = new MeetingServiceImpl2();
		System.out.println("Enter 1 to add movie");
		System.out.println("Enter 2 to get movie after perticular yr");
		System.out.println("Enter 3 to update revenue");
		System.out.println("Enter 4 to delete moview");

		while (true) {
			int take = scanner.nextInt();
			switch (take) {
				case 1:

					m.addMovie();
					break;
				case 2:

					m.getMovies();
					break;
				case 3:

					m.updateRevenue();
					break;
				case 4:

					m.delete();
					break;
			}


		}
	}
}
