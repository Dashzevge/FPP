package assignment5;

public class Driver{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Figure[] figures = new Figure []{new UpwardHat(),new UpwardHat(), new DownwardHat(), new FaceMaker(), new Vertical()};
       
       for(Figure tmp : figures) {
    	   tmp.getFigure();  
       }
	}

}
