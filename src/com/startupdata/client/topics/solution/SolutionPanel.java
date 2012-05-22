package com.startupdata.client.topics.solution;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.StartupData;
import com.startupdata.client.StartupDataTopics;
import com.startupdata.client.utilities.ConvertJson;

public class SolutionPanel extends VerticalPanel {

	public SolutionPanel() {

		this.setSpacing(20);

		if (StartupData.companyTopics != null) {

			String uniqueValueProposition = ConvertJson
					.convertToString(StartupData.companyTopics
							.get(StartupDataTopics.TopicID.UniqueValueProposition
									.toString()));

			if (uniqueValueProposition != null) {

				HTML htmlDescription = new HTML(
						"<font color=blue><b>Unique Value Proposition:</b></font><br><blockquote>"
								+ uniqueValueProposition + "</blockquote>");
				this.add(htmlDescription);
			}

			String vision = ConvertJson
					.convertToString(StartupData.companyTopics
							.get(StartupDataTopics.TopicID.Vision.toString()));

			if (vision != null) {

				HTML htmlVision = new HTML(
						"<font color=blue><b>Vision:</b></font><br><blockquote>"
								+ vision + "</blockquote>");
				this.add(htmlVision);
			}

			String goals = ConvertJson
					.convertToString(StartupData.companyTopics
							.get(StartupDataTopics.TopicID.Goals.toString()));

			if (goals != null) {

				HTML htmlGoals = new HTML(
						"<font color=blue><b>Goals:</b></font><br><blockquote>"
								+ goals + "</blockquote>");
				this.add(htmlGoals);
			}
		}
	}
}
