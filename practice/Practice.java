package practice;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Practice {

	public static void main(String[] args) {
		 JFrame frm = new JFrame("이미지 삽입 해보기");
	     ImageIcon ic  = new ImageIcon("C:\\Users\\전선미\\Desktop\\승익\\JavaProject\tetris.jpg");
	     //이미지 삽입해보려 했으나 아직 완수하지못함..
	     JLabel lbImage1  = new JLabel(ic);
	    
	     frm.add(lbImage1);
	     frm.setVisible(true);
	     frm.setBounds(10, 10, 800, 600);
	     frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
