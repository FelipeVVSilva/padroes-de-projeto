package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhoneSimpleFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone1 = IPhoneSimpleFactory.orderIphone("X", "standard");
		System.out.println(iphone1);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = IPhoneSimpleFactory.orderIphone("11", "highEnd");
		System.out.println(iphone2);
	}

}
