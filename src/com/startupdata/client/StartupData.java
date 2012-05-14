package com.startupdata.client;

import com.startupdata.client.topics.StartupDataTextTopic;
import com.startupdata.client.topics.edit.EditStartupDataTextTopic;

public class StartupData {

	public static void init(final String companyID) {

		StartupDataGlobalVariables.companyID = companyID;
		StartupDataGlobalVariables.companyTopics = null;
	}

	public static void showTopic(final String topicName) {

		StartupDataGlobalVariables.vpStartupTopic.clear();
		StartupDataGlobalVariables.vpStartupTopic.add(new StartupDataTextTopic(
				topicName));
	}

	public static void editTopic(final String topicName) {

		StartupDataGlobalVariables.vpStartupTopic.clear();
		StartupDataGlobalVariables.vpStartupTopic
				.add(new EditStartupDataTextTopic(topicName));
	}
}
