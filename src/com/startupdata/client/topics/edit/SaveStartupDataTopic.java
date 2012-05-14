package com.startupdata.client.topics.edit;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.startupdata.client.topics.GetStartupDataTopics;
import com.startupdata.client.topics.StartupDataService;
import com.startupdata.client.topics.StartupDataServiceAsync;

public class SaveStartupDataTopic {

	public static void save(final String startupID, final String topicName,
			final String topicDescription) {

		final StartupDataServiceAsync startupDataService = GWT
				.create(StartupDataService.class);

		startupDataService.saveStartupData(startupID, topicName,
				topicDescription, new AsyncCallback<Void>() {

					public void onFailure(Throwable caught) {

					}

					public void onSuccess(Void result) {

						GetStartupDataTopics.get(startupID, topicName);
					}
				});

	}
}
