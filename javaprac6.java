import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTabbedPaneDemo {

	JTabbedPane jp;
	JTextField jt;
	JPanel p;
	JFrame jf;

	JTabbedPaneDemo() {
		jp = new JTabbedPane(); // Corrected typo: JTabbedPanel -> JTabbedPane
		jp.add("Sis", new SisPanel());
		jp.add("Radio", new ColorPanel());
		p = new JPanel();
		p.setLayout(new FlowLayout());
		p.add(jp);
		jf = new JFrame();
		jf.getContentPane().add(p);
		jf.setSize(400, 500);
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		new JTabbedPaneDemo();
	}
}

class SisPanel extends JPanel {
	JComboBox<String> jc; // Added explicit type parameter
	SisPanel() {
		jc = new JComboBox<>();
		jc.addItem("abc");
		jc.addItem("pqr"); // Corrected typo: Missing closing double-quote
		jc.addItem("Mpn");
		jc.addItem("hehe");
		add(jc);
	}
}

class ColorPanel extends JPanel { 	
	JRadioButton r1, r2, r3, r4;
	ButtonGroup bg;
	ColorPanel() {
		r1 = new JRadioButton("A");
		r2 = new JRadioButton("B");
		r3 = new JRadioButton("C");
		r4 = new JRadioButton("D");
		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		add(r1);
		add(r2);
		add(r3);
		add(r4);
	}
}

/*
atomic,intermediat, top level
*/
