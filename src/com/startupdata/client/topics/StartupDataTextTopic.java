package com.startupdata.client.topics;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.StartupData;
import com.startupdata.client.StartupDataGlobalVariables;
import com.startupdata.client.utilities.ConvertJson;

public class StartupDataTextTopic extends VerticalPanel {

	public StartupDataTextTopic(final String topicName) {

		this.setSpacing(20);

		if (StartupDataGlobalVariables.companyTopics != null) {

			String companyTopicDescription = ConvertJson
					.convertToString(StartupDataGlobalVariables.companyTopics
							.get(topicName));

			if (companyTopicDescription != null) {

				HTML htmlDescription = new HTML(companyTopicDescription);
				add(htmlDescription);

			} else {

				StartupData.editTopic(topicName);
			}

		} else {

			GetStartupDataTopics.get(StartupDataGlobalVariables.companyID,
					topicName);
		}
	}
}
