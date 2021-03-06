package com.startupdata.client.topics.persona;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Anchor;
import com.startupdata.client.StartupData;
import com.startupdata.client.StartupDataTopics;
import com.startupdata.client.utilities.ConvertJson;

public class EditPersonaIcon extends Anchor {

	public EditPersonaIcon() {

		String persona = "";
		if (StartupData.companyTopics != null) {

			persona = ConvertJson.convertToString(StartupData.companyTopics
					.get(StartupDataTopics.TopicID.Persona.toString()));
		}

		String companyID = ConvertJson.convertToString(StartupData.company
				.get("ID"));

		this.setHTML("<a href='http://startupsdata.appspot.com?company="
				+ companyID
				+ "&persona="
				+ persona
				+ "' target='_blank'><img src='"
				+ GWT.getModuleBaseURL()
				+ "startupstages/EditIcon.jpg' width='18px' height='18px' border=0></a>");

	}

}
