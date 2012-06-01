package com.startupdata.client.topics.problem;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.MyCompanyPanel;
import com.startupdata.client.StartupData;
import com.startupdata.client.StartupDataTopics;
import com.startupdata.client.utilities.ConvertJson;

public class ShowProblem {

	public ShowProblem() {

		if (StartupData.companyTopics != null) {

			String problem = ConvertJson
					.convertToString(StartupData.companyTopics
							.get(StartupDataTopics.TopicID.Problem.toString()));

			if (problem != null) {

				VerticalPanel vp = new VerticalPanel();

				vp.setSpacing(20);

				String companyID = ConvertJson
						.convertToString(StartupData.company.get("ID"));

				HTML htmlDescription = new HTML(
						"<a href='http://startupsdata.appspot.com?company="
								+ companyID + "&problem=" + problem
								+ "' target='_blank'><b>" + problem
								+ "</b></a>");
				vp.add(htmlDescription);

				MyCompanyPanel.vpStartupTopic.add(vp);
			}
		}
	}
}
