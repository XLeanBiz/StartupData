package com.startupdata.client.topics;

import com.google.gwt.core.client.GWT;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.startupdata.client.StartupDataGlobalVariables;

public class GetStartupDataTopics {

	public static void get(final String startupID, final String topicName) {

		final StartupDataServiceAsync startupDataService = GWT
				.create(StartupDataService.class);

		startupDataService.getStartupData(startupID,
				new AsyncCallback<String>() {

					public void onFailure(Throwable caught) {

					}

					public void onSuccess(String jsonResult) {

						if (jsonResult != null && !jsonResult.equals("")) {

							JSONObject obj = (JSONObject) JSONParser
									.parseStrict(jsonResult);

							StartupDataGlobalVariables.companyTopics = obj;

							StartupDataGlobalVariables.vpStartupTopic.clear();
							StartupDataGlobalVariables.vpStartupTopic
									.add(new StartupDataTextTopic(topicName));
						}

					}
				});

	}
}
