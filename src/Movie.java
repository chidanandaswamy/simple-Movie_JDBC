

public class Movie {
   
	private int movieID;
	private String movieName;
	private String languge;
	private int year;
	private double revenue;
	
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int movieID, String movieName, String languge, int year, double revenue) {
		super();
		this.movieID = movieID;
		this.movieName = movieName;
		this.languge = languge;
		this.year = year;
		this.revenue = revenue;
	}
	public Movie(String string, String string2, String string3, int int1, long long1) {
	}
	@Override
	public String toString() {
		return "movieDTO [movieID=" + movieID + ", movieName=" + movieName + ", languge=" + languge + ", year=" + year
				+ ", revenue=" + revenue + "]";
	}
	public int getMovieID() {
		return movieID;
	}
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLanguge() {
		return languge;
	}
	public void setLanguge(String languge) {
		this.languge = languge;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getRevenue() {
		return revenue;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	
	
	}
