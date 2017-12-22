package utils;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FxDialog
{
	public FxDialog(){}
	
	public void ShowMessage(String title, String message)
	{
		JFrame frame=new JFrame(title);
		JOptionPane.showMessageDialog(frame, message,title,JOptionPane.WARNING_MESSAGE);
		
		
		
	}
}
