package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
String score = JOptionPane.showInputDialog("what percent was your test score");

double scoreDouble = Double.parseDouble(score);     

if (score. equalsIgnoreCase("100%") || score.equalsIgnoreCase("100") || score.equalsIgnoreCase("ahuned")|| score.equalsIgnoreCase("one hundred percent")|| score.equals("100 percent")) {
	JOptionPane.showMessageDialog(null,"Congradultions You got an A+++++++++++++++++++");

}
else {
	JOptionPane.showMessageDialog(null, "WAS IT LIKE YOU WHERE EVEN TRYING????YOU ARE LUCKY THER IS NO GRADE UNDER F");
}


}

}
 