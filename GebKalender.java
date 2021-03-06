import java.awt.*;
import java.awt.event.WindowListener;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

//This is the GUI for the birthday calender with java.awt.
public class GebKalender extends Frame // Frame erzeugt ein eigenständiges Programmfenster
implements WindowListener, ActionListener
{
	Label labText1, labText2;
	Button bAdd, bChange, bDelete;
	TextArea taInfo;
	
	public static void main(String [] args)
	{
		GebKalender gebkalender = new GebKalender();
	}
	public GebKalender ()
	{
		setSize (400,400); //setzt die Fenstergröße des Frame fest
		setLayout (null); //setLayout(Layout); legt verwendetes Layout fest, hier: kein (vorkonfiguriertes) Layout
		Font fntBold = new Font ("SansSerif", Font.BOLD, 14); //Font.BOLD gibt Schriftstil wieder (als int), 0 = PLAIN, 1 = BOLD, 2 = ITALIC -> auch Zahleingabe möglich
		Font fntHead = new Font ("SansSerif", 1, 20);
		Font fntOutput = new Font ("SansSerif", 0, 12);
		//labText1
		labText1 = new Label ("Geburtstagskalender",Label.CENTER);
		labText1.setFont(fntHead);
		labText1.setBounds(20,25,350,25);	//setBounds (int x, int y, int b, int h); legt Position sowie Höhe und Breite einer Komponente fest (in Pixel)
		labText1.setBackground(Color.blue);
		labText1.setForeground(Color.lightGray);
		add(labText1); //add(Component c); fügt Komponente der GUI hinzu
		//labText2
		labText2 = new Label ("Heute haben folgende Personen Geburtstag:");
		labText2.setFont(fntBold);
		labText2.setBounds(20,70,350,25);
		labText2.setBackground(Color.cyan);
		labText2.setForeground(Color.black);
		add(labText2);
		//taInfo
		taInfo = new TextArea();
		taInfo.setFont(fntOutput);
		taInfo.setBounds(20,115,360,140);
		taInfo.setBackground(Color.yellow);
		taInfo.setForeground(Color.black);
		add(taInfo);
		//bAdd
		bAdd = new Button ("Hinzufügen");
		bAdd.setFont(fntBold);
		bAdd.setBounds(20,275,120,25);
		bAdd.setBackground(Color.green);
		bAdd.setForeground(Color.darkGray);
		add(bAdd);
		bAdd.addActionListener(this); //Events auf Button bInfo können abgerufen werden
		//bChange
		bChange = new Button ("Ändern");
		bChange.setFont(fntBold);
		bChange.setBounds(160,275,100,25);
		bChange.setBackground(Color.green);
		bChange.setForeground(Color.darkGray);
		add(bChange);
		bChange.addActionListener(this);
		//bDelete
		bDelete = new Button ("Löschen");
		bDelete.setFont(fntBold);
		bDelete.setBounds(280,275,100,25);
		bDelete.setBackground(Color.green);
		bDelete.setForeground(Color.darkGray);
		add(bDelete);
		bDelete.addActionListener(this);
		setVisible(true); //ohne diese Methode ist das Fenster nicht sichtbar
		addWindowListener(this); //Events auf das Fenster können abgerufen werden
	}
	// 7 Methoden aus WindowListener
	public void windowClosing (WindowEvent e)
	{
		dispose();
		System.exit(0);
	}
	public void windowClosed (WindowEvent e)
	{}
	public void windowOpened (WindowEvent e)
	{}
	public void windowActivated (WindowEvent e)
	{}
	public void windowDeactivated (WindowEvent e)
	{}
	public void windowIconified (WindowEvent e)
	{}
	public void windowDeiconified (WindowEvent e)
	{}
	// 1 Methode aus ActionListener
	public void actionPerformed (ActionEvent e)
	{
		if (e.getSource() == bDelete)
		{
			deleteClicked();
		}
		if (e.getSource() == bChange)
		{
			changeClicked();
		}
		if (e.getSource() == bAdd)
		{
			addClicked();
		}
	}
	private void deleteClicked()
	{
		taInfo.append("\"Löschen\" wurde geklickt.\n");
	}
	private void changeClicked()
	{
		taInfo.append("\"Ändern\" wurde geklickt.\n");
	}
	private void addClicked()
	{
		taInfo.append("\"Hinzufügen\" wurde geklickt.\n");
	}
	
}
