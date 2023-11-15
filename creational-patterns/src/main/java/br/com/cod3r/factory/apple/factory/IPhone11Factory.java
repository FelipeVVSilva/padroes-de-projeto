package br.com.cod3r.factory.apple.factory;


import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory{

    @Override
    protected IPhone createIphone(String level) {
       if(level.equals("standard")){
            return new IPhone11();
       }
       else if(level.equals("highEnd")){
            return new IPhone11Pro();
       } else return null;
    }
    
}
