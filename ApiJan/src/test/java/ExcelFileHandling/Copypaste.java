package ExcelFileHandling;

	
	import java.io.File;
import java.io.IOException;
import java.util.Scanner;
	import jxl.Cell;
	import jxl.Sheet;
	import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
	import jxl.write.WritableSheet;
	import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

	public class Copypaste {
	    
	    public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
	        
	            // Open input file for reading
	            Workbook inputWorkbook = Workbook.getWorkbook(new File("input.xls"));
	            Sheet inputSheet = inputWorkbook.getSheet(0);
	            int numRows = inputSheet.getRows();
	            int numCols = inputSheet.getColumns();
	            
	            // Open output file for writing
	            WritableWorkbook outputWorkbook = Workbook.createWorkbook(new File("output.xls"));
	            WritableSheet outputSheet = outputWorkbook.createSheet("Sheet1", 0);
	            
	            // Copy data from input to output file
	            for (int row = 0; row < numRows; row++) {
	                for (int col = 0; col < numCols; col++) {
	                    Cell cell = inputSheet.getCell(col, row);
	                    String data = cell.getContents();
	                    Label label = new Label(col, row, data);
	                    outputSheet.addCell(label);
	                }
	            }
	            
	            // Save and close output file
	            outputWorkbook.write();
	            outputWorkbook.close();
	            System.out.println("Data written successfully to output.xls");
	            
	            // Close input file
	            inputWorkbook.close();
	       
	    }
	}



