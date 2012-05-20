package com.startupdata.client.interviewsdb;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface InterviewsDatabaseServiceAsync {

	void listPersonas(AsyncCallback<String> callback);

}
