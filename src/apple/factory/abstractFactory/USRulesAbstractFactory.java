package apple.factory.abstractFactory;

import apple.model.certificate.Certificate;
import apple.model.certificate.USCertificate;
import apple.model.packing.Packing;
import apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new USCertificate();
	}

	public Packing getPacking() {
		return new USPacking();
	}

}
