package practice;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Practice {

	public static void main(String[] args) {
		 JFrame frm = new JFrame("�̹��� ���� �غ���");
	     ImageIcon ic  = new ImageIcon("C:\\Users\\������\\Desktop\\����\\JavaProject\tetris.jpg");
	     //�̹��� �����غ��� ������ ���� �ϼ���������..
	     JLabel lbImage1  = new JLabel(ic);
	    
	     frm.add(lbImage1);
	     frm.setVisible(true);
	     frm.setBounds(10, 10, 800, 600);
	     frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
