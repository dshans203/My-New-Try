package ExcelFileHandling;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excelwrite 
{
	
	public void excelWriteData() throws IOException, RowsExceededException, WriteException
	{
		File f = new File("..\"../Project_1/Book22.xls\"");
		WritableWorkbook wk= Workbook.createWorkbook(f);
		WritableSheet ws= wk.createSheet("Deepansh", 0);
		
		for(int i=0; i<3;i++)
		{
			for(int j=0; j<3; j++)
			{
				Label l=new Label(j,i,"DC");
				ws.addCell(l);
				
			}
		}
		
		wk.write();
		wk.close();
		
	}
	
	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
		
		Excelwrite ex=new Excelwrite();
		ex.excelWriteData();
	}

}
