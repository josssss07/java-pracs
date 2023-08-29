
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.*;

public class prac3 implements  TreeSelectionListener{
	JFrame f;
	DefaultMutableTreeNode a, a1, a2, a3;
	DefaultMutableTreeNode r, b, b1, b2, b3;
	JPanel p;
	JTree t; 
	JTextField jt;
	prac3(){
		jt = new JTextField();
		p = new JPanel();
		f = new JFrame();
		a = new DefaultMutableTreeNode("A");
		r = new DefaultMutableTreeNode("R");
		a1 = new DefaultMutableTreeNode("A1");
		a2 = new DefaultMutableTreeNode("A3");
		a3 = new DefaultMutableTreeNode("A3");
		b = new DefaultMutableTreeNode("B");
		b1 = new DefaultMutableTreeNode("B1");
		b2 = new DefaultMutableTreeNode("B2");
		b3 = new DefaultMutableTreeNode("B3");
		
		a.add(a1);
		a.add(a2);
		a.add(a3);
		b.add(b1);
		b.add(b2);
		b.add(b3);
		r.add(a);
		r.add(b);
		t = new JTree(r);
		t.addTreeSelectionListener(this);
		
		p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add("Center", t);
		p.add("South", jt);
		//top level
		f = new JFrame();
		f.add(p);
		f.setSize(200, 300);
		f.setVisible(true);
		

	}
	

	public void valueChanged(TreeSelectionEvent e) {
		jt.setText(e.getPath().toString());
		
	}

	public static void main(String[] args) {
		new prac3();
		
	}

}