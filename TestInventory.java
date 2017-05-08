import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestInventory {

public static void main(String[] args){
	Inventory movieList = new Inventory();
	Scanner input = null;
	//checks if all parameters are met. If not, throws exception.
	try {
		//file is gotten
		File file = new File("movies_db.txt");
		//entered into scanner
		input = new Scanner(new FileInputStream(file));
		// entered in buffered reader
		BufferedReader br = new BufferedReader(new FileReader(file));
		//while there is another line in the text document
		 while(input.hasNextLine()){
			 //line is read
			 String line = br.readLine();
			 //everytime there is a dash the input before is stored as string
	         String[] split = line.split("[-]");
	         //the first one is a title and trimmed of all white spaces
		     String title = split[0].trim();
		     //second spot in array is an integer for year which is also trimmed
		     String y = split[1].trim();
		     //converted from string to integer
		     int year = Integer.parseInt(y);
		     //third spot in array is an integer duration of the movie and trimmed of all white spaces
		     String d = split[2].trim();
		     //converted to int from string
		      int duration = Integer.parseInt(d);
		      // fourth spot in array is a double value for rating of the movie and trimmed of all white spaces
		      String r = split[3].trim();
		      //converted to double from string
		      double rating = Double.parseDouble(r);
		      //adding the movie to inventory 
	          movieList.Adding(title, year, duration, rating);
	          //input is skipped to next line
		      input.nextLine();
		    }
	} catch (FileNotFoundException e) {
		System.out.println("File Not Found!");
	} catch (IOException e) {
		System.out.println("Error!");

	}
	finally{
		input.close();
		
	}
	
	movieList.add("Bears", 2014, 3.5);
	movieList.add("Star Wars - A New Hope", 1977, 3.8);
	movieList.add("Casablanca", 1942, 3.9);
	movieList.add("Duck Soup", 1933, 3.75);
	
	System.out.println(movieList.toString());
	
	movieList.add("Casablanca", 1942, 3.9);

	System.out.println(movieList.toString());

	movieList.add("Bears", 2050, 3.5);

	System.out.println(movieList.toString());

	movieList.remove("The Nightmare Before Christmas", 1993);
	
	System.out.println(movieList.toString());

	movieList.remove("Duck Soup", 1933);

	System.out.println(movieList.toString());

}

}
