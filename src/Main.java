import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

public class Main {
	public static void main(String[] args) throws Exception {
		ExcelController excel = new ExcelController();
		String path = "C:\\Users\\fnpm\\Downloads\\ADS.xls";
		excel.readExcel(path);
		String[] teste = excel.getHeaders();
		
		for(int i = 0; i < teste.length; i++) {
			System.out.println(teste[i]);
		}
	}
	
	
	
}
