package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.model.IPhoneX;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;

public class Client {
	
	private IPhone orderIPhone(String model, String level){
		IPhone device = null;

		if(model.equals("X")) {
			if(level.equals("standard")) {
				device = new IPhoneX();
			} else if(level.equals("highEnd")) {
				device = new IPhoneXSMax();
			}
		} else if(model.equals("11")) {
			if(level.equals("standard")) {
				device = new IPhone11();
			} else if(level.equals("highEnd")) {
				device = new IPhone11Pro();
			}
		}

		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();

		return device;
	}


	public static void main(String[] args) {

		Client cliente = new Client();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone1 = cliente.orderIPhone("X", "standard");
		System.out.println(iphone1);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = cliente.orderIPhone("11", "highEnd");
		System.out.println(iphone2);
	}

}
