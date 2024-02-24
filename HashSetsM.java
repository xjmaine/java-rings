/*
 * Maps
 * Sets
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

 public class HashSetsM {
 
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<String>();
        hash.add("localhost");
        hash.add("URL");
        hash.add("CONTENT_TYPE");
        hash.add("CONTENT_LENGTH");
        hash.add("CONTENT_MD5");

        // hash.remove("URL");
        // hash.clear();
        // hash.size();

        //using iterator
        Iterator<String> iterator = hash.iterator();
        // Scanner sc = new Scanner(System.in);

        while(iterator.hasNext()){
            // System.out.println(iterator.next());

            // if(iterator.hasNext() == )
        }

        System.out.println("\n "+"Total HashSet Size: " +hash.size());
    }
 }