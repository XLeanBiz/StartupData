package com.startupdata.client.startupdb;

import com.google.gwt.core.client.GWT;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.startupdata.client.StartupData;
import com.startupdata.client.topics.VerifyTopic;

public class GetStartupDataTopics {

	public static void get(final String startupID, final String topicID) {

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

							StartupData.companyTopics = obj;

							if (topicID != null) {

								new VerifyTopic(topicID);
							}
						}

					}
				});

	}
}
