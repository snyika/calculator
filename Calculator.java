//Calculator.java
public class Calculator extends JFrame implements ActionListener
{
	JLabel lblX=new JLabel("X:");
	JLabel lblY=new JLabel("Y:");
	JTextField txtX=new JTextField(10);
	JTextField txtY=new JTextField(10);
	JButton btnPlus=new JButton("+");
	JButton btnExit=new JButton("Exit");
	public Calculator()
	{
		super("Calculator");
		setLayout(new GridLayout(3,2,5,5));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		add(lblX);
		add(txtX);
		add(lblY);
		add(txtY);
		add(btnPlus);btnPlus.addActionListener(this);
		add(btnExit);btnExit.addActionListener(this);
		pack();
		setVisible(true);
	}
}
