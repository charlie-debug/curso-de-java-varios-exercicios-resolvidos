package application;

import entities.ComboDevice;
import entities.PrinterConcreto;
import entities.ScannerConcreto;

public class Program {

	public static void main(String[] args) {
		PrinterConcreto p = new PrinterConcreto("1080");
		p.docProcessado("minha carta");
		p.print("minha carta");
		System.out.println("===================================");
		ScannerConcreto s = new ScannerConcreto("2003");
		s.docProcessado("meu email");
		System.out.println("resultado scan: " + s.scan());
		System.out.println("===================================");
		ComboDevice device = new ComboDevice("1111");
		device.docProcessado("meu documentário:");
		device.print("documentário: ");
		System.out.println("meu scan: " + device.scan());

	}

}
