package com.startupdata.client;

import com.google.gwt.json.client.JSONObject;

public class StartupData {

	public static JSONObject company = null;

	public static JSONObject companyTopics = null;

	public static void init(final JSONObject companyReference) {

		company = companyReference;
		companyTopics = null;
	}
}
