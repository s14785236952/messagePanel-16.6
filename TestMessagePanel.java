//U10116024 ½²¸t¦w
package chapter13;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class TestMessagePanel extends JFrame {
	public TestMessagePanel() {
		//create messagePanel Object
		final MessagePanel messagePanel = new MessagePanel("Wecome to Java");
		messagePanel.setFont(new Font("SansSerif", Font.ITALIC, 20));
		// add it to the frame
		add(messagePanel);
		//define two String to change
		final String m1 = "Wecome to Java";
		final String m2 = "Java is fun";
		//mouseclicked to change two Strings
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (m1.equals(messagePanel.getMessage())) {
					messagePanel.setMessage(m2);
				} else {
					messagePanel.setMessage(m1);
				}
			}
		});

	}
//main method
	public static void main(String[] args) {
		TestMessagePanel frame = new TestMessagePanel();
		frame.setSize(300, 200);
		frame.setTitle("TestMessagePanel");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}