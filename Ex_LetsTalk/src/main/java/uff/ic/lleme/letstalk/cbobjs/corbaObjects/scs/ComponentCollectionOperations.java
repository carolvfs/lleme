package uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs;

/**
 * corbaObjects/scs/ComponentCollectionOperations.java . Generated by the
 * IDL-to-Java compiler (portable), version "3.2" from deployment.idl
 * Sexta-feira, 9 de Dezembro de 2005 18h26min28s BRST
 */

public interface ComponentCollectionOperations {
	uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentHandle[] getComponent(
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentId id)
			throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InvalidName;

	uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentHandle[] getComponents()
			throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InvalidName;
} // interface ComponentCollectionOperations
