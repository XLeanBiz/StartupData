package com.startupdata.client.topics;

import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.MyCompanyPanel;
import com.startupdata.client.StartupData;
import com.startupdata.client.StartupDataTopics;
import com.startupdata.client.topics.brand.BrandPanel;
import com.startupdata.client.topics.brand.EditCompanyIcon;
import com.startupdata.client.topics.persona.EditPersonaIcon;
import com.startupdata.client.topics.persona.ShowPersona;
import com.startupdata.client.topics.solution.EditSolutionIcon;
import com.startupdata.client.topics.solution.SolutionPanel;
import com.startupdata.client.topics.team.TeamPanel;
import com.startupdata.client.topics.textTopics.EditStartupDataTextTopic;
import com.startupdata.client.topics.textTopics.EditTextIcon;
import com.startupdata.client.topics.textTopics.StartupDataTextTopic;
import com.startupdata.client.utilities.ConvertJson;

public class VerifyTopic {

	public VerifyTopic(final String topicID) {

		MyCompanyPanel.vpEditTopic.clear();
		MyCompanyPanel.vpStartupTopic.clear();

		StartupDataTopics.TopicID topicEnum = StartupDataTopics.TopicID
				.valueOf(topicID);

		switch (topicEnum) {

		case Persona:
			MyCompanyPanel.vpEditTopic.add(new EditPersonaIcon());
			new ShowPersona();
			break;

		case Solution:
			MyCompanyPanel.vpEditTopic.add(new EditSolutionIcon());
			MyCompanyPanel.vpStartupTopic.add(new SolutionPanel());
			break;

		case Team:
			MyCompanyPanel.vpEditTopic.add(new EditCompanyIcon());
			MyCompanyPanel.vpStartupTopic.add(new TeamPanel());
			break;

		case Brand:
			MyCompanyPanel.vpEditTopic.add(new EditCompanyIcon());
			MyCompanyPanel.vpStartupTopic.add(new BrandPanel(
					StartupData.company));
			break;

		default:

			MyCompanyPanel.vpEditTopic.add(new EditTextIcon(topicID));
			MyCompanyPanel.vpStartupTopic.add(showTextTopic(topicID));
			break;
		}
	}

	public static VerticalPanel showTextTopic(final String topicID) {

		if (StartupData.companyTopics != null) {

			String companyTopicDescription = ConvertJson
					.convertToString(StartupData.companyTopics.get(topicID));

			if (companyTopicDescription != null) {

				return (new StartupDataTextTopic(topicID));

			} else {

				return (new EditStartupDataTextTopic(topicID));
			}
		} else {

			return new VerticalPanel();
		}
	}
}
