package com.startupdata.client.topics.persona;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.MyCompanyPanel;
import com.startupdata.client.StartupData;
import com.startupdata.client.interviewsdb.ListPersonas;
import com.startupdata.client.utilities.ConvertJson;

public class ShowPersona {

	public ShowPersona() {

		String persona = ConvertJson.convertToString(StartupData.company
				.get("Persona"));

		if (persona != null) {

			VerticalPanel vp = new VerticalPanel();

			vp.setSpacing(20);

			HTML htmlDescription = new HTML("<b>" + persona + "</b>");
			vp.add(htmlDescription);

			MyCompanyPanel.vpStartupTopic.add(vp);

		} else {

			ListPersonas.list();
		}
	}
}
