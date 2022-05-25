package abstractfactory.apple.factory;

import abstractfactory.apple.model.iphone.IPhone;
import abstractfactory.apple.model.iphone.IPhoneX;
import abstractfactory.apple.model.iphone.IPhoneXSMax;
import apple.factory.abstractFactory.CountryRulesAbstractFactory;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX(rules);
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax(rules);
		} else return null;
	}

}
