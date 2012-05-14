package com.startupdata.client.topics;

import com.startupdata.client.StartupData;
import com.startupdata.client.topics.topicpanels.Blog;
import com.startupdata.client.topics.topicpanels.BrandName;
import com.startupdata.client.topics.topicpanels.Domain;
import com.startupdata.client.topics.topicpanels.Logo;
import com.startupdata.client.topics.topicpanels.StartupDataTextTopic;
import com.startupdata.client.utilities.ConvertJson;

public class VerifyTopic {

	public VerifyTopic(final String topicID) {

		StartupData.vpStartupTopic.clear();

		StartupDataTopics.TopicID topicEnum = StartupDataTopics.TopicID
				.valueOf(topicID);

		switch (topicEnum) {

		case BrandName:
			StartupData.vpStartupTopic.add(new BrandName(StartupData.company));
			break;

		case Logo:
			StartupData.vpStartupTopic.add(new Logo(StartupData.company));
			break;

		case Domain:
			StartupData.vpStartupTopic.add(new Domain(StartupData.company));
			break;

		case Blog:
			StartupData.vpStartupTopic.add(new Blog(StartupData.company));
			break;

		default:

			if (StartupData.companyTopics != null) {

				StartupData.vpStartupTopic
						.add(new StartupDataTextTopic(topicID));

			} else {

				String companyID = ConvertJson
						.convertToString(StartupData.company.get("ID"));

				GetStartupDataTopics.get(companyID, topicID);
			}

			break;
		}
	}
}
