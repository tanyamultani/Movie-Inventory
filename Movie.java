
public class Movie {
/**
 * instance variables initialization
 */
private String title;
private int yearReleased;
private double rating;
private int quantity;
private int duration;

/**
 * Default constructor
 */
public Movie(){
	quantity = 0;
}
/**
 * constructor method to create an object of type Movie. 
 * Throws IllegalArgumentException if one of the parameters is invalid
 * @param t for String title
 * @param yr for integer year
 * @param r for double rating
 * @param d for integer duration
 */
public Movie(String t, int yr, double r, int d){
	title = t;
	yearReleased = yr;
	rating = r;
	duration = d;	
	if(yearReleased >=1870 && yearReleased <= 2016 && rating >=0 && rating <= 4 && duration >= 0){
		title = t;
		yearReleased = yr;
		rating = r;
		duration = d;	
	}
	else{
	throw new IllegalArgumentException("One of the parameters is invalid!");
	}
}

/**
 * accessor method for the quantity of a movie
 * @return quantity
 */
public int getQuantity() {
	return quantity;
}
/**
 * mutator method for the quantity of a movie with parameters that need to be valid 
 * @param q for quantity 
 */
public void setQuantity(int q) {
	if(quantity >= 0){
	quantity = q;
	}
	else{
		
	}
}
/**
 * accessor method for the rating of a movie
 * @return rating
 */
public double getRating() {
	return rating;
}
/**
 * mutator method for the rating of a movie 
 * @param rating
 */
public void setRating(double rating) {
	this.rating = rating;
}
/**
 * accessor method for the year of release of a movie
 * @return
 */
public int getYearReleased() {
	return yearReleased;
}
/**
 * mutator method for the year of release of a movie
 * @param yearReleased 
 */
public void setYearReleased(int yearReleased) {
	this.yearReleased = yearReleased;
}
/**
 * accessor method for the title of a movie
 * @return title
 */
public String getTitle() {
	return title;
}
/**
 * mutator method for the title of a movie
 * @param title
 */
public void setTitle(String title) {
	this.title = title;
}
/**
 * toString method for object Movie
 */
public String toString() {
	return String.format("%1$s %2$d , rating: %3$.1f, # in stock: %4$d \n", title, yearReleased, rating,quantity);
}


}
