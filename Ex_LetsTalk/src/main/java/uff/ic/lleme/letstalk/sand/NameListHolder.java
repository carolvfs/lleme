package uff.ic.lleme.letstalk.sand;

/**
 * NameListHolder.java . Generated by the IDL-to-Java compiler (portable),
 * version "3.2" from scs.idl Friday, December 9, 2005 9:35:21 PM GMT
 */

public final class NameListHolder implements org.omg.CORBA.portable.Streamable {
	public String value[] = null;

	public NameListHolder() {
	}

	public NameListHolder(String[] initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = NameListHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		NameListHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return NameListHelper.type();
	}

}
