package com.startupdata.client.topics.textTopics;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.startupdata.client.startupdb.GetStartupDataTopics;
import com.startupdata.client.startupdb.StartupDataService;
import com.startupdata.client.startupdb.StartupDataServiceAsync;

public class SaveStartupDataTopic {

	public static void save(final String startupID, final String topicID,
			final String topicDescription) {

		final StartupDataServiceAsync startupDataService = GWT
				.create(StartupDataService.class);

		startupDataService.saveStartupData(startupID, topicID,
				topicDescription, new AsyncCallback<Void>() {

					public void onFailure(Throwable caught) {

					}

					public void onSuccess(Void result) {

						GetStartupDataTopics.get(startupID, topicID);
					}
				});

	}
}
