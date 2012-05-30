package com.startupdata.client.custdevframework;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface CustDevFrameworkServiceAsync {

	void listPersonas(AsyncCallback<String> callback);

}
