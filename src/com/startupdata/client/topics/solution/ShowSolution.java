package com.startupdata.client.topics.solution;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.MyCompanyPanel;
import com.startupdata.client.StartupData;
import com.startupdata.client.StartupDataTopics;
import com.startupdata.client.utilities.ConvertJson;

public class ShowSolution {

	public ShowSolution() {

		if (StartupData.companyTopics != null) {

			String solution = ConvertJson
					.convertToString(StartupData.companyTopics
							.get(StartupDataTopics.TopicID.Solution.toString()));

			if (solution != null) {

				VerticalPanel vp = new VerticalPanel();

				vp.setSpacing(20);

				String companyID = ConvertJson
						.convertToString(StartupData.company.get("ID"));

				HTML htmlDescription = new HTML(
						"<a href='http://startupsdata.appspot.com?company="
								+ companyID + "&solution=" + solution
								+ "' target='_blank'><b>" + solution
								+ "</b></a>");
				vp.add(htmlDescription);

				MyCompanyPanel.vpStartupTopic.add(vp);
			}
		}
	}
}
