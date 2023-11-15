package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {

	public static void main(String[] args) {

		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11Factory = new IPhone11Factory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone1 = iphoneXFactory.orderIphone("standard");
		System.out.println(iphone1);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iphone11Factory.orderIphone("highEnd");
		System.out.println(iphone2);
	}

}
