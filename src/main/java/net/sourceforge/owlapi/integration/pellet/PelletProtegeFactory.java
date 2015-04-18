package net.sourceforge.owlapi.integration.pellet;

import org.protege.editor.owl.model.inference.AbstractProtegeOWLReasonerInfo;
import org.semanticweb.owlapi.reasoner.BufferingMode;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;

import com.clarkparsia.pellet.owlapiv3.PelletReasonerFactory;

public class PelletProtegeFactory extends AbstractProtegeOWLReasonerInfo {

    private PelletReasonerFactory factory;

    @Override
    public void initialise() {
        factory = new PelletReasonerFactory();
    }
    @Override
    public void dispose() {
        factory = null;
    }

	@Override
	public BufferingMode getRecommendedBuffering() {
		return BufferingMode.BUFFERING;
	}

	@Override
	public OWLReasonerFactory getReasonerFactory() {
		return factory;
	}
}



