package ExcelFileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

	public class WritedataRange {
	    
	    public static void writeData(int numRows, int numCols) throws IOException, RowsExceededException, WriteException {
	        
	            Scanner scanner = new Scanner(System.in);
	            
	            WritableWorkbook workbook = Workbook.createWorkbook(new File("output.xls"));
	            WritableSheet sheet = workbook.createSheet("Sheet1", 0);
	            
	            for (int row = 0; row < numRows; row++) {
	                for (int col = 0; col < numCols; col++) {
	                    System.out.print("Enter data for row " +  1) + " and column " + (col + 1) + ": ");
	                    String data = scanner.nextLine();
	                    Label label = new Label(col, row, data);
	                    sheet.addCell(label);
	                }
	            }
	            
	            workbook.write();
	            workbook.close();
	            scanner.close();
	            System.out.println("Data written successfully to output.xls");
	       
	    }
	    
	    public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
	        int numRows = 2;
	        int numCols = 3;
	        writeData(numRows, numCols);
	    }
	}

