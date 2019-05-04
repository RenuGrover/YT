package org.testing.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logs 
{
	public static void Takelogs(String classname,String message)
	{
		DOMConfigurator.configure("../org.testing.TestCases/Layout.xml");
		Logger l= Logger.getLogger(classname);
		l.info(message);
	}
}
