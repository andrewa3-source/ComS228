package edu.iastate.cs228.hw2;

import java.io.FileNotFoundException;
import java.lang.NumberFormatException; 
import java.lang.IllegalArgumentException; 
import java.util.InputMismatchException;


/**
 *  
 * @author Andrew Ahrenkiel
 *
 */

/**
 * 
 * This class implements selection sort.   
 *
 */

public class SelectionSorter extends AbstractSorter
{
	// Other private instance variables if you need ... 
	
	/**
	 * Constructor takes an array of points.  It invokes the superclass constructor, and also 
	 * set the instance variables algorithm in the superclass.
	 *  
	 * @param pts  
	 */
	public SelectionSorter(Point[] pts)  
	{
		super(pts);
		algorithm = "selection sort";
	}	

	
	/** 
	 * Apply selection sort on the array points[] of the parent class AbstractSorter.  
	 * 
	 */
	@Override 
	public void sort()
	{
		int len = this.points.length;
		
		for ( int i = 0; i < len - 1; i++) {
			
			int minimum = i;
			for(int j = i+1; j < len; j++) {
				if (this.points[j].compareTo(this.points[minimum]) == -1) {
					minimum = j;
				}
			}
			
			
			Point temp = this.points[minimum];
			this.points[minimum] = this.points[i];
			this.points[i] = temp;
			
		}
	}	
}
