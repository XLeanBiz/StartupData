package com.startupdata.client.topics;

import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.MyCompanyPanel;
import com.startupdata.client.StartupData;
import com.startupdata.client.StartupDataTopics;
import com.startupdata.client.topics.brand.BrandPanel;
import com.startupdata.client.topics.brand.EditCompanyIcon;
import com.startupdata.client.topics.idea.EditIdeaIcon;
import com.startupdata.client.topics.idea.IdeaPanel;
import com.startupdata.client.topics.persona.EditPersonaIcon;
import com.startupdata.client.topics.persona.ShowPersona;
import com.startupdata.client.topics.problem.EditProblemIcon;
import com.startupdata.client.topics.problem.ShowProblem;
import com.startupdata.client.topics.solution.EditSolutionIcon;
import com.startupdata.client.topics.solution.ShowSolution;
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

		case Idea:
			MyCompanyPanel.vpEditTopic.add(new EditIdeaIcon());
			MyCompanyPanel.vpStartupTopic.add(new IdeaPanel());
			break;

		case Team:
			MyCompanyPanel.vpEditTopic.add(new EditCompanyIcon());
			MyCompanyPanel.vpStartupTopic.add(new TeamPanel());
			break;

		case Persona:
			MyCompanyPanel.vpEditTopic.add(new EditPersonaIcon());
			new ShowPersona();
			break;

		case Problem:
			MyCompanyPanel.vpEditTopic.add(new EditProblemIcon());
			new ShowProblem();
			break;

		case Solution:
			MyCompanyPanel.vpEditTopic.add(new EditSolutionIcon());
			new ShowSolution();
			break;

		case Brand:
			MyCompanyPanel.vpEditTopic.add(new EditCompanyIcon());
			MyCompanyPanel.vpStartupTopic.add(new BrandPanel());
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
