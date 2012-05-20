package com.startupdata.client.interviewsdb;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("interviewsData")
public interface InterviewsDatabaseService extends RemoteService {

	String listPersonas();

}
