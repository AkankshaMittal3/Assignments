 /**
  * Create an java program to search through the home directory and look for files that match a
  * regular expression. The program should be able to take inputs repeatedly and should print out
  * full absolute path of the matching files found.
  */

 /**
  * @author Akanksha Mittal
  */

 import java.util.Scanner;
 import java.io.File;
 import java.util.regex.Pattern;


 public class javaAssignment1 {

     /**
      * This method searches files in the home directory.
      * @param directoryName this is the directory we're searching in.
      * @param pattern this is regex pattern to be matched with file names.
      *
      */

     static void searchFiles( String homeDir, String pattern ) {
	
     }
     public static void main( String[] args ) {
	Scanner scan = new Scanner( System.in );
	System.out.println( "Enter Regex to search or -1 to quit" );
	String pattern = scan.next();
	String FLAG = "-1";
	String homeDir = "/home/user";

	//Runs until user enters -1
	while( !pattern.equals( FLAG ) ) {
	searchFiles( homeDir, pattern );
	System.out.println( "\nEnter Regex to search or -1 to quit" );
	pattern = scan.next();
	}
    }
 }
