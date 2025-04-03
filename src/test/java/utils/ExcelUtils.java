package utils;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

//The purpose of the class is reading Excel file
public class ExcelUtils {

	public static List<Map<String, Object>> readExcelFile() throws EncryptedDocumentException, IOException {

		File file = new File("data/TestData.xlsx"); // The Excel workbook is created as File instance
		FileInputStream fis = new FileInputStream(file);

		// workbook
		Workbook workbook = WorkbookFactory.create(fis);

		// sheet
		Sheet sheet = workbook.getSheetAt(0); // Create sheet instance and it access the intended sheet via workbook
												// instance

		Row headerRow = sheet.getRow(0); // Create instance for first row of the Excel sheet
		List<String> headerValues = new ArrayList<String>();
		
		for (Cell headerCell : headerRow) {
			headerValues.add(headerCell.getStringCellValue());
		}

		// reading data on the rows except the header row
		

		// Create map for each row's data as key-value pair
		Map<String, Object> dataRow = new HashMap<String, Object>();

		// The list is created for adding all the data row as a list
		List<Map<String, Object>> fullData = new ArrayList<Map<String, Object>>();

		// iterate through all the rows(except header row) in the Excel sheet
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			// iterate through all the cells in the particular row
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				String columnHeader = headerValues.get(j);

				switch (cell.getCellType()) {

				case STRING:
					dataRow.put(columnHeader, cell.getStringCellValue());
					break;

				case NUMERIC:
					dataRow.put(columnHeader, cell.getNumericCellValue());
					break;

				default:
					System.out.println("Any other cell type");
				}

			}

			fullData.add(dataRow);
			dataRow = new HashMap<String, Object>(); // empty the dataRow map for adding new map in the next iteration
		}

		workbook.close();
		fis.close();

		return fullData;
	}

}
