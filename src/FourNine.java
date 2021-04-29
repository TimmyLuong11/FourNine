import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FourNine extends JFrame
{
	private JButton b1;
	private JButton b2;
	
	public FourNine()
	{
		setSize(300,400);
		b1 = new JButton("One");
		b2 = new JButton("Two");
		
		BorderLayout bl = new BorderLayout();
		setLayout(bl);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.EAST);
		
		b1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("WOW");
				b2.setBackground(Color.BLUE);
			}
		});
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new FourNine();
	}	
}

