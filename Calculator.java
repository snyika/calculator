//Calculator.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener
{
	JLabel lblX=new JLabel("X:");
	JLabel lblY=new JLabel("Y:");
	JLabel lblResult=new JLabel("Result:");
	JTextField txtX=new JTextField(10);
	JTextField txtY=new JTextField(10);
	JTextField txtResult=new JTextField(10);
	JButton btnPlus=new JButton("+");
	JButton btnExit=new JButton("Exit");
	public Calculator()
	{
		super("Calculator");
		setLayout(new GridLayout(4,2,5,5));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		add(lblX);
		add(txtX);
		add(lblY);
		add(txtY);
		add(lblResult);
		add(txtResult);
		txtResult.setEditable(false);
		add(btnPlus);btnPlus.addActionListener(this);
		add(btnExit);btnExit.addActionListener(this);
		pack();
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object source=e.getSource();
		if(source==btnExit)
		{
			System.exit(0);
		}
		else
		if(source==btnPlus)
		{
			int x=Integer.parseInt(txtX.getText());
			int y=Integer.parseInt(txtY.getText());
			int sum=x+y;
			Integer total=new Integer(sum);
			txtResult.setText(total.toString());
		}
	}
}
