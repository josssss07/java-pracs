/* 
import javax.swing.*;
public class pracSeven {

	//atomic level
	
	JComboBox<String>cb;
	JLabel jl;
	ImageIcon im;
	
	//intermediate level
	JPanel jp;
	//top level
	JFrame jf;
	
	pracSeven(){
		cb = new JComboBox<String>();
		cb.addItem("moon");
		cb.addItem("star");
		cb.addItem("earth");
		im = new ImageIcon("C:\\Users\\XKC21\\Downloads\\baller.jpg");
		jl = new JLabel();
		jl.setIcon(im);
		
		jp = new JPanel();
		jp.add(cb);
		jp.add(jl);
		jf = new JFrame();
		jf.add(jp);
		jf.setVisible(true);
		jf.setSize(900, 900);
		jf.pack();
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new pracSeven(); 
	}

}

*/

//next bit of code

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;


public class pracSeven implements ItemListener{

	//atomic level
	
	JComboBox<String>cb;
	JLabel jl;
	ImageIcon im;
	
	//intermediate level
	JPanel jp;
	//top level
	JFrame jf;
	
	pracSeven(){
		cb = new JComboBox<String>();
		cb.addItem("baller");
		cb.addItem("ballin");
		cb.addItem("balled");
		im = new ImageIcon("C:\\Users\\joshu\\OneDrive\\Pictures\\Screenshots\\xbox.jpg");
		cb.addItemListener(this);
		jl = new JLabel();
		jl.setIcon(im);
		
		jp = new JPanel();
		jp.add(cb);
		jp.add(jl);
		jf = new JFrame();
		jf.add(jp);
		jf.setVisible(true);
		jf.setSize(900, 900);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new pracSeven(); 
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String element= e.getItem().toString();
		im  = new ImageIcon("C:\\Users\\joshu\\OneDrive\\Pictures\\Screenshots\\"+element+".jpg");
		jl.setIcon(im);
	}

}
