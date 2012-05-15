package com.startupdata.client.topics;

import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.MyCompanyPanel;
import com.startupdata.client.StartupData;
import com.startupdata.client.topics.edit.EditStartupDataTextTopic;
import com.startupdata.client.topics.topicpanels.Blog;
import com.startupdata.client.topics.topicpanels.BrandName;
import com.startupdata.client.topics.topicpanels.Domain;
import com.startupdata.client.topics.topicpanels.Logo;
import com.startupdata.client.topics.topicpanels.StartupDataTextTopic;
import com.startupdata.client.topics.topicpanels.Team;
import com.startupdata.client.utilities.ConvertJson;

public class VerifyTopic {

	public VerifyTopic(final String topicID) {

		StartupDataTopics.TopicID topicEnum = StartupDataTopics.TopicID
				.valueOf(topicID);

		switch (topicEnum) {

		case BrandName:
			MyCompanyPanel.vpStartupTopic
					.add(new BrandName(StartupData.company));
			break;

		case Logo:
			MyCompanyPanel.vpStartupTopic.add(new Logo(StartupData.company));
			break;

		case Domain:
			MyCompanyPanel.vpStartupTopic.add(new Domain(StartupData.company));
			break;

		case Blog:
			MyCompanyPanel.vpStartupTopic.add(new Blog(StartupData.company));
			break;

		case Team:
			MyCompanyPanel.vpStartupTopic.add(new Team(StartupData.company));
			break;

		default:

			if (StartupData.companyTopics != null) {

				MyCompanyPanel.vpStartupTopic.add(showTextTopic(topicID));

			} else {

				String companyID = ConvertJson
						.convertToString(StartupData.company.get("ID"));

				GetStartupDataTopics.get(companyID, topicID);
			}

			break;
		}
	}

	public static VerticalPanel showTextTopic(final String topicID) {

		String companyTopicDescription = ConvertJson
				.convertToString(StartupData.companyTopics.get(topicID));

		if (companyTopicDescription != null) {

			return (new StartupDataTextTopic(topicID));

		} else {

			return (new EditStartupDataTextTopic(topicID));
		}
	}
}
