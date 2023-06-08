package assignment5;

public class MainComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Computer[] coms = new Computer[] {new Computer("Apple", "M2", 32, 1080)};
           
          for(Computer com: coms) {
        	  System.out.println("Result : "  +    com.equals(new Computer("Dell", "Intel7", 16, 890)));
        	  System.out.println("Result of HashCode of Apple: "  +    com.hashCode());
        	  System.out.println("Result of HashCode of Dell: "  +    new Computer("Dell", "Intel7", 16, 890).hashCode());
          }
	}

}
