import javax.swing.*;
import java.awt.event.*;


public class notepad extends JFrame {

	JMenuItem item1;
	JMenuItem item2;
	JMenuItem item3;
	JMenuItem item4;
	JMenuItem item5;
	JTextArea tarea;
	
	notepad(){
	
	item1=new JMenuItem("File");
	item2=new JMenuItem("Edite");
	item3=new JMenuItem("Format");
	item4=new JMenuItem("View");
	item5=new JMenuItem("Help");
	tarea=new JTextArea();
	
	item1.setBounds(0,0,50,20);
	item2.setBounds(50,0,50,20);
	item3.setBounds(100,0,50,20);
	item4.setBounds(150,0,50,20);
	item5.setBounds(200,0,50,20);
	//tarea.setBounds(10,0,500,460);
	
	
	add(item1);
	add(item2);
	add(item3);
	add(item4);
	add(item5);
	add(tarea);
	
	setSize(500,500);
	setVisible(true);
	setLayout(null);
	}
	public static void main(String[] args) {
		new notepad();
		
	}

}
