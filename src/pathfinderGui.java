import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

//Test comment for Git commit.
public class pathfinderGui extends JFrame
{
	JPanel pane = new JPanel();
	static ArrayList weaponList = new ArrayList();
	
	pathfinderGui()
	{
		super("Path Finder Character Sheets");
		setBounds(100,100,850,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.add(pane);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new pathfinderGui();
		try
		{
			getWeaponList();
		}
		catch (FileNotFoundException e)
		{
			System.out.println();
		}
	}
	
	public static void getWeaponList() throws FileNotFoundException
	{
		Scanner	scan = new Scanner(new FileReader("items.dat"));
		while (scan.hasNextLine())
		{
			String temp = scan.nextLine();
			String[] parts = temp.split(" ");
			weaponList.add(new Weapon(parts[0],Integer.parseInt(parts[1]),Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),Integer.parseInt(parts[4])));
		}
		scan.close();
	}
}