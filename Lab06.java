/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Yoni Lavi>  // replace <...> with your name
* @version <13/11/14> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab06 {

     public static void main(String[] args) {
     String filename = JOptionPane.showInputDialog("What robot map?");  	
     Display.openWorld("maps/" + filename + ".map");
          Display.setSize(10, 10);
          Display.setSpeed(10);
          Robot karel = new Robot(1, 1, Display.EAST, 0);
          Robot bob = new Robot(1, 2, Display.EAST, 0);
          Robot tom =  new Robot(1, 3, Display.EAST, 0);
          Robot jerry = new Robot(1, 4, Display.EAST, 0);
          Robot mary = new Robot(1, 5, Display.EAST, 0);
          Robot maria = new Robot(1, 6, Display.EAST, 0);
          
          while(karel.nextToABeeper())
          {
            karel.move();
          }
          while(!bob.nextToABeeper())
          {
            bob.move();
          }
          while(tom.frontIsClear())
          {
            tom.move();
          }
          while(jerry.frontIsClear()) 
          {
            while(jerry.nextToABeeper()) {
               jerry.pickBeeper();
            }
            jerry.move();
          }
          while(!jerry.frontIsClear()&&jerry.nextToABeeper()) 
          {
            jerry.pickBeeper();
          }

          while(mary.frontIsClear()) 
          {
            while(mary.nextToABeeper()) {
               mary.pickBeeper();
            }
            mary.move();
          }
          while(!mary.frontIsClear()&&mary.nextToABeeper()) 
          {
            mary.pickBeeper();
          }
          while(maria.nextToABeeper())
          {
            maria.move();   
          }
          while(!maria.nextToABeeper())
          {
            maria.move();
          }
          while(maria.nextToABeeper())
          {
            maria.move();   
          }
     }
}

