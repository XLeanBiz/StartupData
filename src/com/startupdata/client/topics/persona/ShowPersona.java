package com.startupdata.client.topics.persona;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.MyCompanyPanel;
import com.startupdata.client.StartupData;
import com.startupdata.client.StartupDataTopics;
import com.startupdata.client.utilities.ConvertJson;

public class ShowPersona {

	public ShowPersona() {

		if (StartupData.companyTopics != null) {

			String persona = ConvertJson
					.convertToString(StartupData.companyTopics
							.get(StartupDataTopics.TopicID.Persona.toString()));

			if (persona != null) {

				VerticalPanel vp = new VerticalPanel();

				vp.setSpacing(20);

				String companyID = ConvertJson
						.convertToString(StartupData.company.get("ID"));

				HTML htmlDescription = new HTML(
						"<a href='http://startupsdata.appspot.com?company="
								+ companyID + "&persona=" + persona
								+ "' target='_blank'><b>" + persona
								+ "</b></a>");
				vp.add(htmlDescription);

				MyCompanyPanel.vpStartupTopic.add(vp);
			}
		}
	}
}
