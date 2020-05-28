package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below */ 
  int yesno = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        if(yesno == 0) {
        	isWeekday = false;
        	}
        else {
        	isWeekday = true;
        }

        int noyes = JOptionPane.showConfirmDialog(null, "IS IT A VACATION THEN?????", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        if(noyes == 0) {
        	isVacation = false;
        	}
        else {
        	isVacation = true;
        }
if(isVacation == true || isWeekday == true) {
	System.out.println("THEN GO BACK 2 SLEEP!!!!!");
}
else if(isWeekday == true && isVacation == false) {
	System.out.println("GET YOUR LAZY BEHIND UP LAZY BONES");
}
else if(isWeekday == true && isVacation == true) {
	   System.out.println("ohh I'm so sorry you can GO BACK 2 SLEEP!!!!!!");
   }
/*
         * Print "sleep in"? if it is a vacation or a weekend. 
         * If it's a weekday, print "get up lazybones!"? 
         * If it's a weekday, but we are on vacation,  print "sleep in"?.
         */
    }
}
