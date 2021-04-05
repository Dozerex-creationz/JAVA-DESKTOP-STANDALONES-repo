package TTT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

class Game {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
			
				EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game window = new Game();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Game() {
		int[] a= {0,0,0,0,0,0,0,0,0,0,0};
		initialize(a);
	}
	public void winner(int a[])
	{
		if((a[1]==1 &&a[2]==1&&a[3]==1)||(a[4]==1 &&a[5]==1&&a[6]==1)||(a[7]==1 &&a[8]==1&&a[9]==1)||(a[1]==1 &&a[4]==1&&a[7]==1)||(a[2]==1 &&a[5]==1&&a[8]==1)||(a[3]==1 &&a[6]==1&&a[9]==1)||(a[1]==1 &&a[5]==1&&a[9]==1)||(a[3]==1 &&a[5]==1&&a[7]==1))
		{	a[10]=1;
			JOptionPane.showMessageDialog(null, "The winnner is  X\nCLICK ON NEW GAME");
			
		}
		
		else if((a[1]==2 &&a[2]==2 &&a[3]==2)||(a[4]==2 &&a[5]==2 &&a[6]==2)||(a[7]==2 &&a[8]==2 &&a[9]==2)||(a[1]==2 &&a[4]==2&&a[7]==2)||(a[2]==2 &&a[5]==2 &&a[8]==2)||(a[3]==2 &&a[6]==2&&a[9]==2)||(a[1]==2 &&a[5]==2&&a[9]==2)||(a[3]==2 &&a[5]==2&&a[7]==2))
		{	a[10]=2;
			JOptionPane.showMessageDialog(null, "The winnner is  O\nCLICK ON NEW GAME");
			
		}
		else if(a[0]==9)
		{	a[10]=3;
			JOptionPane.showMessageDialog(null, "Its the same old DRAW!!\nCLICK ON NEW GAME");
			
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize(int a[]) {
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 253, 275);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//X=1.....O=2......null=0.....a[0]=chaalIndex

		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(a[10]==0)
				{
					if(a[0]%2==0)
					{
						if(a[1]==0)
						{
							btnNewButton.setText("X");
							a[1]=1;
							a[0]+=1;
						}
					
					}
					else
					{
						if(a[1]==0)
						{
							btnNewButton.setText("O");
							a[1]=2;
							a[0]+=1;
						}
					}
					
					winner(a);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "The game is already over!!");
				}
				
			}
		});
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(a[10]==0)
				{
					if(a[0]%2==0)
					{
						if(a[2]==0)
						{
							btnNewButton_1.setText("X");
							a[2]=1;
							a[0]+=1;
						}
					
					}
					else
					{
						if(a[2]==0)
						{
							btnNewButton_1.setText("O");
							a[2]=2;
							a[0]+=1;
						}
					}winner(a);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "The game is already over!!");
				}
				
			}
		});
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(a[10]==0)
				{
					if(a[0]%2==0)
					{
						if(a[3]==0)
						{
							btnNewButton_2.setText("X");
							a[3]=1;
							a[0]+=1;
						}
					
					}
					else
					{
						if(a[3]==0)
						{
							btnNewButton_2.setText("O");
							a[3]=2;
							a[0]+=1;
						}
					}winner(a);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "The game is already over!!");
				}
				
			}
		});
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(a[10]==0)
				{
					if(a[0]%2==0)
					{
						if(a[4]==0)
						{
							btnNewButton_3.setText("X");
							a[4]=1;
							a[0]+=1;
						}
					
					}
					else
					{
						if(a[4]==0)
						{
							btnNewButton_3.setText("O");
							a[4]=2;
							a[0]+=1;
						}
					}winner(a);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "The game is already over!!");
				}
				
			}
			
		});
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(a[10]==0)
				{
					if(a[0]%2==0)
					{
						if(a[5]==0)
						{
							btnNewButton_4.setText("X");
							a[5]=1;
							a[0]+=1;
						}
					
					}
					else
					{
						if(a[5]==0)
						{
							btnNewButton_4.setText("O");
							a[5]=2;
							a[0]+=1;
						}
					}winner(a);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "The game is already over!!");
				}
				
			}
		});
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(a[10]==0)
				{
					if(a[0]%2==0)
					{
						if(a[6]==0)
						{
							btnNewButton_5.setText("X");
							a[6]=1;
							a[0]+=1;
						}
					
					}
					else
					{
						if(a[6]==0)
						{
							btnNewButton_5.setText("O");
							a[6]=2;
							a[0]+=1;
						}
					}winner(a);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "The game is already over!!");
				}
			
			}
		});
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(a[10]==0)
				{
					if(a[0]%2==0)
					{
						if(a[7]==0)
						{
							btnNewButton_6.setText("X");
							a[7]=1;
							a[0]+=1;
						}
					
					}
					else
					{
						if(a[7]==0)
						{
							btnNewButton_6.setText("O");
							a[7]=2;
							a[0]+=1;
						}
					}winner(a);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "The game is already over!!");
				}
				
			}
		});
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(a[10]==0)
				{
					if(a[0]%2==0)
					{
						if(a[8]==0)
						{
							btnNewButton_7.setText("X");
							a[8]=1;
							a[0]+=1;
						}
					
					}
					else
					{
						if(a[8]==0)
						{
							btnNewButton_7.setText("O");
							a[8]=2;
							a[0]+=1;
						}
					}winner(a);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "The game is already over!!");
				}
				
			}
		});
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(a[10]==0)
				{
					if(a[0]%2==0)
					{
						if(a[9]==0)
						{
							btnNewButton_8.setText("X");
							a[9]=1;
							a[0]+=1;
						}
					
					}
					else
					{
						if(a[9]==0)
						{
							btnNewButton_8.setText("O");
							a[9]=2;
							a[0]+=1;
						}
					}winner(a);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "The game is already over!!");
				}
				
			}
		});
		
		JButton btnNewButton_9 = new JButton("New game");
		btnNewButton_9.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0;i<11;i++)
				{
					a[i]=0;
				}
				btnNewButton.setText("");
				btnNewButton_1.setText("");
				btnNewButton_2.setText("");
				btnNewButton_3.setText("");
				btnNewButton_4.setText("");
				btnNewButton_5.setText("");
				btnNewButton_6.setText("");
				btnNewButton_7.setText("");
				btnNewButton_8.setText("");
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addComponent(btnNewButton_9, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(123))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
							.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
							.addComponent(btnNewButton_8, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
							.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 118, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(59)
							.addComponent(btnNewButton_4, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
							.addGap(59))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(59)
							.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
							.addGap(59))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(59)
							.addComponent(btnNewButton_7, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
							.addGap(59))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton_6, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 118, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 118, Short.MAX_VALUE)))
					.addGap(29))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(btnNewButton_9, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 117, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
							.addComponent(btnNewButton_8, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(58)
							.addComponent(btnNewButton_5, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
							.addGap(59))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(58)
							.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
							.addGap(59))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(58)
							.addComponent(btnNewButton_4, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
							.addGap(59))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 117, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
							.addComponent(btnNewButton_7, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
							.addComponent(btnNewButton_6, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 117, Short.MAX_VALUE)))
					.addGap(23))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
		
}
