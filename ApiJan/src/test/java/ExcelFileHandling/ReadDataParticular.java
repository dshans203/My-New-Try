package ExcelFileHandling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadDataParticular 
{
	
	public static void readdata(int row, int col) throws BiffException, IOException
	{
		File f= new File("../Project_1/Book21.xls");
		Workbook wk= Workbook.getWorkbook(f);
		
		Sheet ws = wk.getSheet(0);
		
		Cell c1= ws.getCell(col,row);
		
		System.out.println(c1.getContents());		
	}

	public static void main(String[] args) throws BiffException, IOException 
	{
		ReadDataParticular ex= new ReadDataParticular();
		
		ex.readdata(1,1);
		
	}
}


