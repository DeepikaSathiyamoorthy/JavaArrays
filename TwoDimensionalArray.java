package com.vstl.javaArray;

public class TwoDimensionalArray {

	int arrayrvalue[][] = {{10,20,30,40},{30,40,30,40}};	
	int arrayvauetoadd[][] = {{1,2,3,4},{3,4,5,6}};
	int sumofarrayvalue[][] = new int[4][4];
	
	//nested loop is used for arrays with more rows and columns
		
	public void additionoftwodimensionalarray() {
	
		for(int intnewarrayrow = 0; intnewarrayrow<arrayrvalue.length; intnewarrayrow++ )
		{
			for(int intnewarraycolumn=0; intnewarraycolumn<arrayrvalue[0].length;intnewarraycolumn++)
			{
				sumofarrayvalue[intnewarrayrow][intnewarraycolumn] = arrayrvalue[intnewarrayrow][intnewarraycolumn] + arrayvauetoadd[intnewarrayrow][intnewarraycolumn];
			}
		}
		
		for(int intnewarrayrow = 0; intnewarrayrow<arrayrvalue.length; intnewarrayrow++ )
		{
			for(int intnewarraycolumn=0; intnewarraycolumn<arrayrvalue[0].length;intnewarraycolumn++)
			{
				System.out.format("%d \t", sumofarrayvalue[intnewarrayrow][intnewarraycolumn]);
			}
			System.out.println("\t");
		}
		}
}
