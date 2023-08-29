import javax.swing.*;
public class ImageDemo {
	//atmoic 
	JLabel jl;
	JComboBox<String> cb;
	//intermediate
	JPanel p;
	//top level
	JFrame f;
	
	ImageDemo(){
		cb = new JComboBox<String>();
		cb.addItem("cat");
		cb.addItem("Camel");
		cb.addItem("Parrot");
		jl = new JLabel("Testing");
		
		//intermediate
		p = new JPanel();
		p.add(cb);
		p.add(jl);
		
		//toplevel 
		f = new JFrame();
		f.add(p);
		f.setVisible(true);
		f.setSize(400, 500);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageDemo();
	}

}