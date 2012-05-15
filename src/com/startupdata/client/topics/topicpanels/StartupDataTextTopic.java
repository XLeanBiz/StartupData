package com.startupdata.client.topics.topicpanels;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.StartupData;
import com.startupdata.client.utilities.ConvertJson;

public class StartupDataTextTopic extends VerticalPanel {

	public StartupDataTextTopic(final String topicID) {

		this.setSpacing(10);

		String companyTopicDescription = ConvertJson
				.convertToString(StartupData.companyTopics.get(topicID));

		HTML htmlDescription = new HTML(companyTopicDescription);
		this.add(htmlDescription);

	}
}
