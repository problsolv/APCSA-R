package pixLab.classes;
/*
 * Purpose: to set a 2D array and perform calculations on it
 * 
 * Lydia Chung
 * 04/28/2019
 * 
 * In Activity 4, modify this class to include the methods:
 *    getCount
 *    getLargest
 *    getColTotal
*/

public class IntArrayWorker
{
  /** two dimensional matrix */
  private int[][] matrix = null;
  
  /** set the matrix to the passed one
    * @param theMatrix the one to use
    */
  public void setMatrix(int[][] theMatrix)
  {
    matrix = theMatrix;
  }
  
  /**
   * Method to return the total 
   * @return the total of the values in the array
   */
  public int getTotal()
  {
    int total = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        total = total + matrix[row][col];
      }
    }
    return total;
  }
  
  /**
   * Method to return the total using a nested for-each loop
   * @return the total of the values in the array
   */
  public int getTotalNested()
  {
    int total = 0;
    for (int[] rowArray : matrix)
    {
      for (int item : rowArray)
      {
        total = total + item;
      }
    }
    return total;
  }
  
  /**
   * Method to fill with an increasing count
   */
  public void fillCount()
  {
    int numCols = matrix[0].length;
    int count = 1;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < numCols; col++)
      {
        matrix[row][col] = count;
        count++;
      }
    }
  }
  
  /**
   * print the values in the array in rows and columns
   */
  public void print()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        System.out.print( matrix[row][col] + " " );
      }
      System.out.println();
    }
    System.out.println();
  }
  
  
  /** 
   * fill the array with a pattern
   */
  public void fillPattern1()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; 
           col++)
      {
        if (row < col)
          matrix[row][col] = 1;
        else if (row == col)
          matrix[row][col] = 2;
        else
          matrix[row][col] = 3;
      }
    }
  }
  
  /**
   * Method to return the number of times a value appears
   * @return count of appearances
   */
  public int getCount(int num)
  {
	  int total = 0;
	  for (int row = 0; row < matrix.length; row++)
	    {
	      for (int col = 0; col < matrix[0].length; 
	           col++)
	      {
	        if (matrix[row][col] == num) {
	        	total++;
	        }
	      }
	    }
	  return total;
  }
  
  /**
   * Method to return the largest value in a matrix
   */
  public int getLargest()
  {
	  int max = Integer.MIN_VALUE;
	  for (int row = 0; row < matrix.length; row++)
	    {
	      for (int col = 0; col < matrix[0].length; 
	           col++)
	      {
	        if (matrix[row][col] > max) {
	        	max = matrix[row][col];
	        }
	      }
	    }
	  return max;
  }
  /**
   * Method to return the sum of all the elements in a specified column
   * @return sum of elements
   */
  public int getColTotal(int column)
  {
	  int sum = 0;
	  for (int row = 0; row < matrix.length; row++)
	    {
	      sum += matrix[row][column];
	    }
	  return sum;
  }
 
}