package sec03.exam02_console;

import java.io.*;

public class ConsoleExample {

	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.print("ID: ");
		String id = console.readLine();
		
		System.out.print("PASSWORD: ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass);
		
		System.out.println("---------------");
		System.out.println(id);
		System.out.println(strPassword);
	

	}

}
