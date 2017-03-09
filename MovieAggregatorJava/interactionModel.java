package MovieAggregator;


import java.io.*;
import java.util.*;

public class interactionModel{
	static Map<Integer,List<String>> movies = new HashMap<Integer,List<String>>();
	public static List<String> getinputfromuser() {
        List<String> my_movie = new ArrayList<String>();
        BufferedReader br = null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter MovieName:");
            my_movie.add(br.readLine());
            System.out.println("Enter RunTime:");
            my_movie.add(String.valueOf(Integer.parseInt(br.readLine())));
            System.out.println("Enter Language:");
            my_movie.add(br.readLine());
            System.out.println("Enter LeadActor:");
            my_movie.add(br.readLine());
            System.out.println("Enter Genre:");
            my_movie.add(br.readLine());            
    }catch(IOException e) {
          System.out.println("Exception occured while reading values");
     }
     catch(NumberFormatException e) {
          System.out.println("Exception occred while parsing");
      }
        finally {
            if(br == null) {
                System.out.println("Error in reading.");
            }
            return my_movie;
        }
    }
	
	public static void main(String[] args) {		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Number of movies you wish to add");
		int n = sc1.nextInt();
		List<String> newmovie ; 
		for(int i=0; i< n;i++){
			newmovie = getinputfromuser();
			movies.put(i,newmovie);
		}
		for(Integer i: movies.keySet()){
			System.out.println(movies.get(i).size());
		}
		
		BufferedReader br = null;
	    writer wr = null;
	    try {
	    	br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter Export Format of the form Text or Pdf");
			String format = br.readLine();
	        try {
	        	wr = (writer) Class.forName("MovieAggregator." + format + "Write").newInstance();
	            } catch (InstantiationException e) {
	            	e.printStackTrace();
	            } catch (IllegalAccessException e) {
	            	e.printStackTrace();
	           	} catch (ClassNotFoundException e) {
	            	e.printStackTrace();
	           	}
	            if(wr != null) {
	            wr.write( movies,"/c:/Users/Windows/Documents/");
	            } else {
	                System.out.println("Unknown file format");
	            }
	        } catch (IOException e) {
	            System.out.println("exeption occured while reading");
	        } finally {
	            if(br != null) {
	                try{
	                    br.close();
	                }catch(IOException e){
	                    System.out.println("IoException occured");
	                }
	            }
	        }
		sc1.close();		
	}
}