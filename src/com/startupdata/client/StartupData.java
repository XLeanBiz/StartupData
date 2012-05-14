package com.startupdata.client;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.topics.VerifyTopic;
import com.startupdata.client.topics.edit.EditStartupDataTextTopic;

public class StartupData {

	public static JSONObject company = null;

	public static JSONObject companyTopics = null;

	public static VerticalPanel vpStartupTopic = new VerticalPanel();

	public static void init(final JSONObject companyReference) {

		company = companyReference;
		companyTopics = null;
	}

	public static void showTopic(final String topicID) {

		new VerifyTopic(topicID);
	}

	public static void editTopic(final String topicID) {

		vpStartupTopic.clear();
		vpStartupTopic.add(new EditStartupDataTextTopic(topicID));
	}
}
