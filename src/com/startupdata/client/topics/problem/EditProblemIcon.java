package com.startupdata.client.topics.problem;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Anchor;
import com.startupdata.client.StartupData;
import com.startupdata.client.StartupDataTopics;
import com.startupdata.client.utilities.ConvertJson;

public class EditProblemIcon extends Anchor {

	public EditProblemIcon() {

		String problem = "";
		if (StartupData.companyTopics != null) {

			problem = ConvertJson.convertToString(StartupData.companyTopics
					.get(StartupDataTopics.TopicID.Problem.toString()));
		}

		String companyID = ConvertJson.convertToString(StartupData.company
				.get("ID"));

		this.setHTML("<a href='http://startupsdata.appspot.com?company="
				+ companyID
				+ "&problem="
				+ problem
				+ "' target='_blank'><img src='"
				+ GWT.getModuleBaseURL()
				+ "startupstages/EditIcon.jpg' width='18px' height='18px' border=0></a>");

	}

}
