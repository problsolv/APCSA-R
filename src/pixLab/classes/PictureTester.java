package pixLab.classes;
/*
 * Purpose: To manipulate images using the Picture class
 * 
 * Lydia Chung
 * 06/03/2019
*/

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  public static void testGrayscale()
  {
	  Picture flower = new Picture("/Users/simon/Library/CloudStorage/OneDrive-PlanoISD/9/APCSA/APCSA/src/pixLab/images/whiteFlower.jpg");
	  flower.explore();
	  flower.grayscale();
	  flower.explore();
  }
  public static void testNegate()
  {
	  Picture bike = new Picture("/Users/simon/Library/CloudStorage/OneDrive-PlanoISD/9/APCSA/APCSA/src/pixLab/images/redMotorcycle.jpg");
	  bike.explore();
	  bike.negate();
	  bike.explore();
  }
  public static void testKeepOnlyBlue()
  {
	  Picture water = new Picture("/Users/simon/Library/CloudStorage/OneDrive-PlanoISD/9/APCSA/APCSA/src/pixLab/images/water.jpg");
	  water.explore();
	  water.keepOnlyBlue();
	  water.explore();
  }
  /** Method to test zeroBlue - Activity 5 */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("/Users/simon/Library/CloudStorage/OneDrive-PlanoISD/9/APCSA/APCSA/src/pixLab/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("/Users/simon/Library/CloudStorage/OneDrive-PlanoISD/9/APCSA/APCSA/src/pixLab/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture bike = new Picture("/Users/simon/Library/CloudStorage/OneDrive-PlanoISD/9/APCSA/APCSA/src/pixLab/images/redMotorcycle.jpg");
	  bike.explore();
	  bike.mirrorVerticalRightToLeft();
	  bike.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture pic = new Picture("/Users/simon/Library/CloudStorage/OneDrive-PlanoISD/9/APCSA/APCSA/src/pixLab/images/gorge.jpg");
	  pic.explore();
	  pic.mirrorHorizontal();
	  pic.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
	  Picture pic = new Picture("/Users/simon/Library/CloudStorage/OneDrive-PlanoISD/9/APCSA/APCSA/src/pixLab/images/kitten2.jpg");
	  pic.explore();
	  pic.mirrorHorizontalBotToTop();
	  pic.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("/Users/simon/Library/CloudStorage/OneDrive-PlanoISD/9/APCSA/APCSA/src/pixLab/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture pic = new Picture("/Users/simon/Library/CloudStorage/OneDrive-PlanoISD/9/APCSA/APCSA/src/pixLab/images/snowman.jpg");
	  pic.explore();
	  pic.mirrorArms();
	  pic.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture pic = new Picture("/Users/simon/Library/CloudStorage/OneDrive-PlanoISD/9/APCSA/APCSA/src/pixLab/images/seagull.jpg");
	  pic.explore();
	  pic.mirrorGull();
	  pic.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("/Users/simon/Library/CloudStorage/OneDrive-PlanoISD/9/APCSA/APCSA/src/pixLab/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  public static void testCopy()
  {
	  Picture canvas = new Picture("/Users/simon/Library/CloudStorage/OneDrive-PlanoISD/9/APCSA/APCSA/src/pixLab/images/640x480.jpg");
	  Picture pic = new Picture("/Users/simon/Library/CloudStorage/OneDrive-PlanoISD/9/APCSA/APCSA/src/pixLab/images/seagull.jpg");
	  canvas.copy(pic, 236, 236, 323, 345, 100, 100);
	  canvas.explore();
  }
  public static void testMyCollage()
  {
	  Picture canvas = new Picture("/Users/simon/Library/CloudStorage/OneDrive-PlanoISD/9/APCSA/APCSA/src/pixLab/images/640x480.jpg");
	  canvas.myCollage();
	  canvas.explore();
  }
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("/Users/simon/Library/CloudStorage/OneDrive-PlanoISD/9/APCSA/APCSA/src/pixLab/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testEdgeDetection2()
  {
	  Picture swan = new Picture("/Users/simon/Library/CloudStorage/OneDrive-PlanoISD/9/APCSA/APCSA/src/pixLab/images/swan.jpg");
	  swan.edgeDetection2(10);
	  swan.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test and 
    // comment out the ones you don't want to run
    
    // Activity 5
	/*
    testZeroBlue();
    testKeepOnlyBlue();
    testNegate();
    testGrayscale();
    */
    
    // Activity 5 Challenge - optional
    //testFixUnderwater();
    
    // Activity 6
	/*
    testMirrorVertical();
    testMirrorVerticalRightToLeft();
    testMirrorHorizontal();
    testMirrorHorizontalBotToTop();
    
    // Activity 6 Challenge - optional
    //testMirrorDiagonal();
    
    // Activity 7
    testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
	*/
    
    // Activity 8
    //testCollage();
    //testCopy();
    //testMyCollage();
    
    // Activity 9
    testEdgeDetection();
    testEdgeDetection2();
    
    // Extra methods
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}












