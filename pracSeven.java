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