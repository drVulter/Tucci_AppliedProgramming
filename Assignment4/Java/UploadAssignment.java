import java.util.*;
import java.io.*;

//this hash object is code from the HashDemo.java
class HashObject {
    public String element;
    public int count = 1;
    // Constructor
    HashObject(String input) {
            element = input;   
    }
    // Find appropriate base class to override that include the hashCode
    // and equals member functions
    public int hashCode() {
            //System.out.println(" Code " + element.hashCode() + " Element " + element );
            return element.hashCode();
    }       
    public boolean equals(Object inputParam) {
       HashObject inputObject = (HashObject) inputParam;
       //System.out.println(element + " - = - " + inputObject.element);
       if (element.equals( inputObject.element)) {	
    	   //System.out.println("The current element is " + hashObject3element      
    	   inputObject.count++;
           return true;
        }
            else {
            	return false;
            }
    }
}

class UploadAssignment {
	ArrayList<String> wordInst = new ArrayList<String>();
	    public static void main(String args[]) {
      //Basic try and catch to read file
      public void printFile(String fileName) {
    	try {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        Scanner inputStream = new Scanner(fr);         
        while (inputStream.hasNextLine()) {        
           String line = inputStream.next();
           for (String element : line.split(" ")) {
              list.add(element);
                }
            }
            fr.close();
            inputStream.close();
        } catch ( IOException e ) {
            System.out.println(" Exception error" );
        }
    }      
      
			UploadAssignment ua = new UploadAssignment();
			HashSet<HashObject> hashSet = new HashSet<HashObject>();
			//iterate through array and adds them to hashset
			ua.printFile("input.txt");
			for(string s : wordInst) {
				HashObject hashObject = new HashObject(s);
				hashSet.add(hashObject);
			}
			ua.hashPrint(hashSet);
		}
	//Code from HashDemo
    public void hashPrint(HashSet<HashObject> hashSet){
		//Iterator to count word occurances
    	Iterator<HashObject> iter = hashSet.iterator();
        HashObject hashObject3;
        while (iter.hasNext()) {
                hashObject3 = iter.next();
                if(hashObject3.count !=1){
                	System.out.println("The word " + hashObject3.element + " appears " + hashObject3.count +" times");
                }
        }
		    //Iterator to go through unique words
        Iterator<HashObject> iterAgain = hashSet.iterator();
        HashObject hashObject4;
        while (iterAgain.hasNext()) {
            hashObject4 = iterAgain.next();
            if(hashObject4.count ==1){
            	System.out.println("Unique word: " + hashObject4);
            }
        } 
    }
}
