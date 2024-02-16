package ExcelFileHandling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excelread 
{
	public void excelReadData() throws BiffException, IOException
	{
		File f= new File("../Project_1/Book21.xls");
		Workbook wk= Workbook.getWorkbook(f);
		Sheet ws= wk.getSheet(0);
		int row= ws.getRows();
		int col=ws.getColumns();
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				Cell c1 = ws.getCell(j,i);
				System.out.println(c1.getContents());
			}
		}
	}
	
	public static void main(String[] args) throws BiffException, IOException 
	{
		Excelread ob1= new Excelread();
		ob1.excelReadData();
		
	}
	
}
