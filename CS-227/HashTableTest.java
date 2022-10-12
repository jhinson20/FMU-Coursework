import java.util.Scanner;

public class HashTableTest {
    
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter some lowercase characters to store as keys in the hash table ");
       System.out.println("(Their uppercase equivalents will be used as the corresponding values):");
       String charsToHash = scanner.nextLine();
       System.out.println();
       
       HashTable<Character,Character> ht = new HashTable<Character,Character>();

       for (int i = 0; i < charsToHash.length(); i++) {
           ht.put(charsToHash.charAt(i), charsToHash.toUpperCase().charAt(i));
       }
       
       System.out.println(ht);
       
       System.out.println("Testing retrieval:");
       for (int i = 0; i < charsToHash.length(); i++) {
           System.out.print(ht.get(charsToHash.charAt(i)));
       }
       System.out.println("\n");
       
       System.out.println("Now enter one or more lowercase character keys to delete from the hash table: ");
       String charsToDelete = scanner.nextLine();
       scanner.close();
       for (int i = 0; i < charsToDelete.length(); i++) {
           ht.delete(charsToDelete.charAt(i));
       }
       System.out.println();
       
       System.out.println("Testing retrieval after deletion:");
       for (int i = 0; i < charsToHash.length(); i++) {
           Character v = ht.get(charsToHash.charAt(i));
           System.out.print(v != null ? v : '-');
       }
   }
}


class HashTable<Key, Value> {
   private int size;              // how many key/value pairs are stored
   private int arrayLength;       // size of the array (and consequently, the mod)
   private Key[] keys;
   private Value[] vals;
   private boolean[] tombstones;  // true if element at this index has been deleted, false otherwise

   public HashTable() {  
       this(1);  // chains to the other constructor with 1 specified as capacity.
   }

   public HashTable(int capacity) {

      
      // INSERT CODE HERE //
      
   }

   private int hash(Key key) {
      return (key.hashCode() & 0x7fffffff) % arrayLength;
   }
   
   public String toString() { 
       String s = "";
       for (int i = 0; i < arrayLength; i++) {
           s += i + " : " + keys[i] + "/" + vals[i] + "\n";
       }
       return s;
   }

   public void put(Key key, Value val) {
       // insert or update the value associated with the given key 
       // in the array by hashing and handling any collisions

       
       // INSERT CODE HERE //
       
   }

   public Value get(Key key) {
	   
	   if(contains(key)) {
		   
		   int index = -1;
		   
		   for(int i = 0; i < keys.length; i++) {
	    	   if(keys[i] == key)
	    		   index = i;
	       }
		   
		   return vals[index];
		   
	   }
	   
	   else
		   System.out.println("The key is not contained within the table.");
       
   }
   
   public boolean contains(Key key) {
   
       for(int i = 0; i < keys.length; i++) {
    	   if(keys[i] == key)
    		   return true;
       }
       
       return false;
       
   }

   public void delete(Key key) {
       
       if(contains(key)) {
    	   
    	   int index = -1;
    	   
    	   for(int i = 0; i < keys.length; i++) {
    		   
        	   if(keys[i] == key) {
        		   index = i;
        	   }
        	   
           }
    	   
    	   keys[index] = null;
    	   vals[index] = null;
    	   tombstones[index] = true;
    	   size--;
    	   
       }
       
       else
    	   System.out.println("The key is not contained within the table.");
       
   }

   private void resize(int capacity) {
       // resize the array to have the given capacity 
       // (requires a rehashing of all items).
       
       
       // INSERT CODE HERE //
       
   }
}