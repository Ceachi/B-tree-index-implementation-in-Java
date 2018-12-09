package main;

import bTree.BTree;

/*
 * deci fii atent,
 * 
 * am clasa Btree care face arborele
 * - un vector database, in care i-am pus eu date incepand cu 6 -> pana la 100
 * 
 */
public class App {
	
	private static BTree bTree = new BTree(); // asta este B-Tree-ul meu
	private static int databaseSize = 100;
	private static int database[] = new int[databaseSize]; // asta e vectorul unde vreau sa caut cheia
	private static int pageSize = 4; // si am impartit vectorul asta in pageSize, ca aiciS
	
	
    public static void main( String[] args ) {
    	constructDatabase(); // construiesc vectorul
    	printDatabase(); // afisez
    	constructInitialBTree(); // construiesc B-Tree
    	
    	int key = 19;
    	
    	System.out.println(bTree.search(key)); // caut sa zicem o cheie, si imi da pozitia de inceput in page-ul in care sar afla
    	int pos = (Integer) bTree.search(key); 
    	System.out.println(binarySearch(database,pos, pos + pageSize - 1, key));// acum caut cheia respectiva in acel page
    	
    	/*
    	 * 0 - fiid pozitia de unde incepe page-ul in care se afla 8
    	 * 2 -> pozitia lui, vector ce incepe de la 0
    	 */
    }
    
    private static void printDatabase() {
    	for(int i = 0; i < databaseSize; i++) {
    		System.out.printf("%d ", database[i]);
    	}
    	System.out.println("");
    }
    private static void constructDatabase() {
    	int startFromNumber = 6;
    	for(int i = 0; i < databaseSize; i++) {
    		database[i] = startFromNumber + i;
    	}
    }
    
    private static void constructInitialBTree() {
    	int pos = 0;
    	for(int i = 0; i < databaseSize; i++) {
    		
    		if(i % pageSize == 0) {
    			pos = i;   			
    		}
    		add(database[i],pos);    	
    	}
    }
    
    public static void add(Integer key, Integer value) {
    	bTree.insert(key, value);
    }
    
    

	public static int binarySearch(int arr[], int l, int r, int x) 
	{ 
	   if (r >= l) 
	   { 
	        int mid = l + (r - l)/2; 
	  
	        // If the element is present at the middle  
	        // itself 
	        if (arr[mid] == x)   
	            return mid; 
	  
	        // If element is smaller than mid, then  
	        // it can only be present in left subarray 
	        if (arr[mid] > x)  
	            return binarySearch(arr, l, mid-1, x); 
	  
	        // Else the element can only be present 
	        // in right subarray 
	        return binarySearch(arr, mid+1, r, x); 
	   } 
	  
	   // We reach here when element is not  
	   // present in array 
	   return -1; 
	} 
    
    
    
    
    
}
