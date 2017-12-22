package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CriarLog
{
	public CriarLog(){}
	
	public String Log(String file, String message) throws IOException
	{
		// TODO Auto-generated method stub
		File f= new File(file);
		FileWriter writer = new FileWriter(f,false);
		PrintWriter saida = new PrintWriter(writer,true);
		saida.println(message);
		saida.close();
		writer.close();
		return f.getAbsolutePath();
	}
}
