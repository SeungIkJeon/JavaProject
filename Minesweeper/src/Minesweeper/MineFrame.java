package Minesweeper;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MineFrame extends JFrame {
	public MineFrame(String title) {
		setTitle(title);		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		MineFrame frame  = new MineFrame("MineSweeper");
	}
}
