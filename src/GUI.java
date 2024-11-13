import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GUI implements ActionListener{
	
	//1-ADD A JFRAME and import the package
	JFrame window;
	
	//ADD A JtextArea and import the package
	JTextArea textArea;
	
	//for scrolling the window and import the package
	JScrollPane scrollpane;
	
	//add MenuBar to the window
	JMenuBar menuBar;
	
	//add Menu
	JMenu menuFile, menuEdit , menuFormart, menuColor;
	
	//create items
	JMenuItem iNew,iOPen,iSave,iSaveAs,iExit;
	
	Function_File file=new Function_File(this);
	
	public static void main(String[] args) {
       
		
		
		new GUI();
	}
    public GUI() {
    	//4-call them
    	createWindow();
    	createTextArea();
    	createJMenuBar();
    	createFileMenu();
    	
    	window.setVisible(true);
    }
    //2-create method
    public void createWindow() {
    	
    	//3-create jframe with the name Notepad
    	window = new JFrame("Notepad");
    	window.setSize(600,600);
    	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void createTextArea() {
    	textArea=new JTextArea();
    	
    	scrollpane=new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    	//add scrollpane to the window
    	window.add(scrollpane);
    	//delete the bottom border
    	scrollpane.setBorder(BorderFactory.createEmptyBorder());
    }
    
    public void createJMenuBar() {
    	
    	menuBar = new JMenuBar();
    	window.setJMenuBar(menuBar);
    	
    	menuColor=new JMenu("Color");
    	menuFormart=new JMenu("Format");
    	menuEdit=new JMenu("Edit");
    	menuFile=new JMenu("File");
    	menuBar.add(menuFile);
    	menuBar.add(menuFormart);
    	menuBar.add(menuEdit);
    	menuBar.add(menuColor);
    

    }
    public void createFileMenu() {
    	
    	iNew=new JMenuItem("New");
    	iNew.addActionListener(this);
    	iNew.setActionCommand("New");
    	menuFile.add(iNew);
    	
    	iOPen=new JMenuItem("Open");
    	iOPen.addActionListener(this);
    	iOPen.setActionCommand("Open");
    	menuFile.add(iOPen);
    	
    	iSave=new JMenuItem("Save");
    	menuFile.add(iSave);
    	
    	
    	iSaveAs=new JMenuItem("SaveAs");
    	menuFile.add(iSaveAs);
    	
    	iExit=new JMenuItem("Exit");
    	menuFile.add(iExit);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	String command=e.getActionCommand();
    	
    	switch(command) {
    	case "New": file.newFile();break;
    	case "Open": file.open();break;

    	}
    }
}
