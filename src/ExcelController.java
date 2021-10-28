import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;


public class ExcelController {

	private HSSFSheet  sheet;
	private String[] headers;
	private String[][] data;

	/**
	 * Lê um ficheiro Excel localizado em <i>path</i>.
	 * 
	 * @param path 				Localização do ficheiro Excel.
	 * @throws Exception		Erro quando localização dada em <i>path</i> está incorreta.
	 * 
	 * @author Francisco Mendes
	 */
	public void readExcel(String path) throws Exception {
		FileInputStream fis =new FileInputStream(new File(path));  
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);

		DataFormatter dataFormatter = new DataFormatter();
		headers = new String[sheet.getRow(0).getLastCellNum()];
		data = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for (Row row : sheet) {
			for (Cell cell : row) {
				String cellValue = dataFormatter.formatCellValue(cell);
				System.out.println(cellValue);
				
				if (cell.getRowIndex() != 0) {
					data[row.getRowNum() - 1][cell.getColumnIndex()] = cellValue;
				} else {
					headers[cell.getColumnIndex()] = cellValue;
				}
			}
		}
	}


	/**
	 * Devolve os headers do excel num vetor.
	 * 
	 * @return String[] 	Devolve um vetor de strings com os headers do excel.
	 * 
	 * @author Francisco Mendes.
	 */
	public String[] getHeaders() {
		return headers;
	}

	/**
	 * Devolve os dados do excel numa matriz.
	 * 
	 * @return String[][] 	Devolve uma matriz de strings com os dados do excel.
	 * 
	 * @author Francisco Mendes.
	 */
	public String[][] getData() {
		return data;
	}
	
	
}

