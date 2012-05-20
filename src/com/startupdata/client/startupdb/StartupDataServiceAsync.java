package com.startupdata.client.startupdb;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface StartupDataServiceAsync {

	void getStartupData(String startupID, AsyncCallback<String> callback);

	void saveStartupData(String startupID, String topicName,
			String topicDescription, AsyncCallback<Void> callback);

}
