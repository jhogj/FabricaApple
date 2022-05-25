package abstractfactory.apple.factory;

import abstractfactory.apple.model.iphone.IPhone;
import abstractfactory.apple.model.iphone.IPhone11;
import abstractfactory.apple.model.iphone.IPhone11Pro;
import apple.factory.abstractFactory.CountryRulesAbstractFactory;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone11Factory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhone11(rules);
		} else if(level.equals("highEnd")) {
			return new IPhone11Pro(rules);
		} else return null;
	}

}
