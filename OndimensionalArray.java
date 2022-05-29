package com.vstl.javaArray;

public class OndimensionalArray {
	
	int intarray[] = {10,12,24,31,4}; 
	int[] intarrayvalue;
	int intsum, intadd;
	
	public  void arraybasic() {
			
		intarrayvalue = new int[5]; 
		
		intarrayvalue[0] = 10;
		intarrayvalue[1] = 20;
		intarrayvalue[2] = 30;
		intarrayvalue[3] = 40;
		intarrayvalue[4] = 50;
		
		System.out.println("Array values : " +intarray[2]);
		System.out.println("ArrayValues given by object " +intarrayvalue[4]);
		
	}
	
	public void onedimensionalarrayaddition() {
		
		intarrayvalue = new int[5]; 
		
		intarrayvalue[0] = 10;
		intarrayvalue[1] = 20;
		intarrayvalue[2] = 30;
		intarrayvalue[3] = 40;
		intarrayvalue[4] = 50;
		
		for(int intloop = 0; intloop< intarray.length; intloop++)
		{
			intsum += intarray[intloop];
			
		}
		
		System.out.println("Addition of array values is " +intsum);
		
		for(int intlp = 0; intlp< intarray.length; intlp++)
			{
			intadd += intarrayvalue[intlp];
		
			}
	
		System.out.println("Addition of array values is " +intadd);
	}
	public void stringonedimensionalarray() {
		
		String[] stringarray = {"Happy", "Holidays", "normal", "Days"};
				
	while (stringarray!=null) {
			System.out.println(String.join("",stringarray));
			break;
		} 
		
		}
}















