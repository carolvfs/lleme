package uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs;

/**
 * corbaObjects/scs/NodeLookupOperations.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from deployment.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min28s BRST
 */

public interface NodeLookupOperations {
	uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.NodeDescription getNode(String name);

	uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.NodeDescription[] getNodes(
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.Property[] props);

	uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.NodeDescription[] getAllNodes();
} // interface NodeLookupOperations
