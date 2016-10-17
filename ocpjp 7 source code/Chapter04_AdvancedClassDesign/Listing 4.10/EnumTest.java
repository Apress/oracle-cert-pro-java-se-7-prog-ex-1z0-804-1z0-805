/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/
public class EnumTest {
	PrinterType printerType;

	public EnumTest(PrinterType pType) {
		printerType = pType;
	}

	public void feature() {
		switch (printerType) {
		case DOTMATRIX:
			System.out.println("Dot-matrix printers are economical");
			break;
		case INKJET:
			System.out.println("Inkjet printers provide decent quality prints");
			break;
		case LASER:
			System.out.println("Laser printers provide the best quality prints");
			break;
		}
		System.out.println("Print page capacity per minute: " + 
			printerType.getPrintPageCapacity());
	}

	public static void main(String[] args) {
		EnumTest enumTest1 = new EnumTest(PrinterType.LASER);
		enumTest1.feature();
		EnumTest enumTest2 = new EnumTest(PrinterType.INKJET);
		enumTest2.feature();
	}
}
