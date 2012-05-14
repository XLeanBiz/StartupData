package com.startupdata.client;

import java.util.Arrays;

import com.startupdata.client.topics.StartupDataTopics;

public class MyCompanyLink {

	public static boolean showMyCompany(final String topicId) {

		if (StartupDataGlobalVariables.companyID != null) {

			String values = Arrays.deepToString(StartupDataTopics.TopicID.values());

			values.replaceAll("]", ",");

			if (values.contains(topicId + ",")) {

				return true;
			}
		}

		return false;
	}
}
