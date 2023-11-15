package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhoneX;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory{

    @Override
    protected IPhone createIphone(String level) {
        if(level.equals("standard")){
            return new IPhoneX();
       }
       else if(level.equals("highEnd")){
            return new IPhoneXSMax();
       } else return null;
    }
}
