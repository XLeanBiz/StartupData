package com.startupdata.client.topics;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("startupData")
public interface StartupDataService extends RemoteService {

	String getStartupData(String startupID);

	void saveStartupData(String startupID, String topicName,
			String topicDescription);
}
