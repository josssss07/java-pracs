
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
		im = new ImageIcon("C:\\Users\\XKC21\\Downloads\\baller.jpg");
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
		jf.pack();
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new pracSeven(); 
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String element= e.getItem().toString();
		im  = new ImageIcon("C:\\Users\\XKC21\\Downloads\\"+element+".jpg");
		jl.setIcon(im);
	}

}
