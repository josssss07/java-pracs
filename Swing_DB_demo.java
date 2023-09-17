
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class Swing_DB_demo implements ActionListener
{
	JLabel j1,j2,j3;
	JTextField t1;
	JPasswordField pwd;
	JButton b1;
	JPanel p1;
	JFrame f1;
	
	Swing_DB_demo()
	{
		j1 = new JLabel("ENO");
		j2 = new JLabel("EName");
		j3 = new JLabel(" ");
		pwd = new JPasswordField(20);
		t1 = new JTextField(20);
		b1 = new JButton("Submit");
		b1.addActionListener(this);
		
		p1 = new JPanel();
		p1.setLayout(new GridLayout(3,2));
		p1.add(j1);p1.add(t1);
		p1.add(j2);p1.add(pwd);
		p1.add(j3);p1.add(b1);
		
		f1 = new JFrame();
		f1.add(p1);
		f1.pack();
		f1.setVisible(true);		
	}
	
	public static void main(String[] args)
	{
		new Swing_DB_demo();
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/java","root","himanshu@2005");					
			PreparedStatement ps = connection.prepareStatement
					("select Eno,Password from employee where Eno=? And Password=? and Department=?");
			ps.setInt(1,Integer.parseInt(t1.getText()));
			ps.setString(2, pwd.getText());
			ps.setString(3, "IT");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
		 {
		 	System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		 }
		}
		
		catch(Exception e1)
		{
			e1.printStackTrace();		
		}		
	}
}

