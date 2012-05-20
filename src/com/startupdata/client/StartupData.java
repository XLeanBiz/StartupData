package com.startupdata.client;

import com.google.gwt.json.client.JSONObject;
import com.startupdata.client.startupdb.GetStartupDataTopics;
import com.startupdata.client.utilities.ConvertJson;

public class StartupData {

	public static JSONObject company = null;

	public static JSONObject companyTopics = null;

	public static void init(final JSONObject companyReference) {

		company = companyReference;
		companyTopics = null;

		String companyID = ConvertJson.convertToString(StartupData.company
				.get("ID"));

		GetStartupDataTopics.get(companyID, null);
	}
}
