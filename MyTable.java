package assignment6;

public class MyTable {
	private Entry[] entries = new Entry[26];
	private int index = 0;
	//returns the String that is matched with char c in the table
	public String get(char c){
	//implement
		return entries[Character.toUpperCase(c) - 'A' + 1].str;
    }
	//adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
	        // Calculate the index
		entries[Character.toUpperCase(c) - 'A' + 1] = new Entry(c, s); 
		
		System.out.println(new Entry(c, s).toString());
	}
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		//implement
		return null;
	}
	private class Entry {
		char ch;
		String str;
		Entry(char ch, String str){
		  this.ch = ch;
		  this.str = str;	 
		}
		@Override
		public String toString() {
			
		return ch +"->" + str;
		
		}
	}
}
