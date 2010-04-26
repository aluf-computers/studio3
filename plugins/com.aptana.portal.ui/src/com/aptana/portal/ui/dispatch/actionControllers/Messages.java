package com.aptana.portal.ui.dispatch.actionControllers;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS
{
	private static final String BUNDLE_NAME = "com.aptana.portal.ui.dispatch.actionControllers.messages"; //$NON-NLS-1$
	public static String AbstractActionController_invocationError;
	public static String GemsActionController_computingGemsJobName;
	public static String GemsActionController_internalError;
	static
	{
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages()
	{
	}
}
