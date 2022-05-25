package apple.factory.abstractFactory;

import apple.model.certificate.Certificate;
import apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
