package apple.factory.abstractFactory;

import apple.model.certificate.BrazilianCertificate;
import apple.model.certificate.Certificate;
import apple.model.packing.BrazilianPacking;
import apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	public Packing getPacking() {
		return new BrazilianPacking();
	}

}
