package com.startupdata.server.custdevframework;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.startupdata.client.custdevframework.CustDevFrameworkService;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class CustDevFrameworkServiceImpl extends RemoteServiceServlet
		implements CustDevFrameworkService {

	public String listPersonas() {

		return ListPersonas.list();
	}
}
