package co.edu.uptc.metodos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class IoManager {
	private Scanner input;
	
	public IoManager(){
		input = new Scanner(System.in);
	}

    public void showGraficMessage(String message){
		JOptionPane.showMessageDialog(null, message);
	}
	public int readGraficInt(String message){
		
        return Integer.parseInt(JOptionPane.showInputDialog(message));
	}
	public short readGraficShort(String message){
		
		return Short.parseShort(JOptionPane.showInputDialog(message));

	}
	public String readGraficString(String message){
		
		return JOptionPane.showInputDialog(message);

	}
	public double readGraficDouble(String message){
		
		return Double.parseDouble(JOptionPane.showInputDialog(message));

	}
	public char readGraficChar(String message){
		
		return JOptionPane.showInputDialog(message).charAt(0);

	}
	public boolean readGraficBoolean(String message){

		return Boolean.parseBoolean(JOptionPane.showInputDialog(message));
	}
	

}
