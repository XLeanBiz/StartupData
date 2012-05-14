package com.startupdata.client.topics.topicpanels;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.StartupData;
import com.startupdata.client.utilities.ConvertJson;

public class StartupDataTextTopic extends VerticalPanel {

	public StartupDataTextTopic(final String topicName) {

		this.setSpacing(20);

		String companyTopicDescription = ConvertJson
				.convertToString(StartupData.companyTopics.get(topicName));

		if (companyTopicDescription != null) {

			HTML htmlDescription = new HTML(companyTopicDescription);
			add(htmlDescription);

		} else {

			StartupData.editTopic(topicName);
		}
	}
}
