package com.startupdata.client.interviewsdb;

import com.google.gwt.core.client.GWT;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.startupdata.client.MyCompanyPanel;
import com.startupdata.client.topics.persona.EditPersona;

public class ListPersonas {

	public static void list() {

		final InterviewsDatabaseServiceAsync dataService = GWT
				.create(InterviewsDatabaseService.class);

		dataService.listPersonas(new AsyncCallback<String>() {

			public void onFailure(Throwable caught) {

			}

			public void onSuccess(String jsonResult) {

				JSONArray jsonArray = (JSONArray) JSONParser
						.parseStrict(jsonResult);


				MyCompanyPanel.vpStartupTopic.clear();
				MyCompanyPanel.vpStartupTopic.add(new EditPersona(jsonArray));
			}
		});

	}
}
