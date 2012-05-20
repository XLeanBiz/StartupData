package com.startupdata.server.startupdb;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.startupdata.client.startupdb.StartupDataService;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class StartupDataServiceImpl extends RemoteServiceServlet implements
		StartupDataService {

	public String getStartupData(final String startupID){

		return GetStartupData.getJsonString(startupID);
	}

	public void saveStartupData(final String startupID, final String topicName,
			final String topicDescription) {

		SaveStartupData.save(startupID, topicName, topicDescription);
	}
}
