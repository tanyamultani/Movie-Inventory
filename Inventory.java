import java.util.ArrayList;

public class Inventory {
/**
 * instance variables initialization
 */
private ArrayList<Movie> list = new ArrayList<Movie>();
/**
 * void method to add a movie to the inventory if all parameters are valid
 * @param t for title
 * @param y for year of release
 * @param d for duration
 * @param r for rating
 */

public void Adding(String t, int y, int d, double r){
	//checks if all parameters are valid. If not, throws exception
	try{
	//if needed increases then movie already exists and if statement to add movie won't be valid
	int needed = 0;
	//for loop to compare all movie titles and years of release in the list
	for(int x=0; x < list.size();x++){
	//if title and year of release already exist in inventory
	if (list.get(x).getTitle().equals(t) && list.get(x).getYearReleased() == y) {
	needed=1;
	//get old quantity 
	int newQuantity = list.get(x).getQuantity();
	//increase it's value by one
	newQuantity++;
	//update quantity for that movie by one
	list.get(x).setQuantity(newQuantity);
	//update rating of movie to new one
	list.get(x).setRating(r);
	} 
	}
	//if needed is still 0
	if(needed == 0){
	//add new movie with all the parameters provided
	Movie movie = new Movie(t,y,r,d);	
	//location of arraylist where movie is added
	list.add(list.size(),movie);
	//since it's a new movie quantity is set to 1
	list.get((list.size())-1).setQuantity(1);
	}
	}
	// 
	catch(IllegalArgumentException e){
    	System.out.println("One of the parameters is invalid so the film was not added to the inventory! \n");
	}
	}

/**
 * void method to add a movie to the inventory (without duration because it's not needed) if all parameters are valid
 * @param t for the title
 * @param y for the year of release
 * @param r for the rating 
 */
public void add(String t, int y, double r){
	//checks if all parameters are valid. If not, throws exception
	try{	
	//if needed increases then movie already exists and if statement to add movie won't be valid
	int needed = 0;
	//for loop to compare all movie titles and years of release in the list
	for(int x=0; x < list.size();x++){
	//if title and year of release already exist in inventory
	if (list.get(x).getTitle().equals(t) && list.get(x).getYearReleased() == y) {
	needed=1;
	//get old quantity 
	int newQuantity = list.get(x).getQuantity();
	//increase it's value by one
	newQuantity++;
	//update quantity for that movie by one
	list.get(x).setQuantity(newQuantity);
	//update rating of movie to new one
	list.get(x).setRating(r);
	} 
	}
	//if needed is still 0
	if(needed == 0){	
	//add new movie with all the parameters provided
	Movie movie = new Movie(t,y,r,0);	
	list.add(movie);
	//since it's a new movie quantity is set to 1
	list.get((list.size())-1).setQuantity(1);
	}
	}
    catch(IllegalArgumentException e){
    	System.out.println("One of the parameters is invalid so the film was not added to the inventory! \n");
    }

	}

/**
 * void method to remove a movie to the inventory if all parameters are valid
 * @param t for title 
 * @param y for year of release 
 */
public void remove(String t,int y){
	//for loop to compare all movie titles and years of release in the list
	for(int x=0; x < list.size();x++){
		//if title and year of release already exist in inventory
	if (list.get(x).getTitle().equals(t) && list.get(x).getYearReleased() == y){
		//quantity of that movie is gotten
		int oldQuantity = list.get(x).getQuantity();
		//new quantity of movie is created by subtracting the old one by one
		int newQuantity = oldQuantity-1;
		//if either the new or old quantity is one, the object movie is completely removed
		if(oldQuantity == 0 || newQuantity==0){
		list.remove(x);	
		}
		//else the new quantity is set
		else{
		list.get(x).setQuantity(newQuantity);

		}
	}
	}
}
/**
 * toString method for object Movie. Prints list of movies in inventory
 */
public String toString() {
	String result = "";
    for (int x = 0; x < list.size(); x++) {
        result += list.get(x).toString();
    }
	return "Inventory: \n" + result + "\n";
}



}
