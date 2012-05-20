package com.startupdata.server.interviewsdb;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.startupdata.client.interviewsdb.InterviewsDatabaseService;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class InterviewsDatabaseServiceImpl extends RemoteServiceServlet
		implements InterviewsDatabaseService {

	public String listPersonas() {

		return ListPersonas.list();
	}
}
