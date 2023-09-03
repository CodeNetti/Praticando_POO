package calc;



public class Rectangle {
	 
	
	
	public double Area(  double height, double width) 
	{
		double area = height *  width;
		
		return area;
	}
	public double Perimeter(  double height, double width) 
	{
		double perimeter = 2 * (height +  width);
		
		return perimeter;
	}
	public double Diagonal(  double height, double width) 
	{
		 height = Math.pow(height, 2);
		 width = Math.pow(width, 2);
		 double diagonal = height + width;
		 diagonal = Math.sqrt(diagonal);		 
				 return diagonal;
		 
	}
	
	

}
