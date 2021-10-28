
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
