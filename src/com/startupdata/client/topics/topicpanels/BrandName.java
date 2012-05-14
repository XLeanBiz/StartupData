package com.startupdata.client.topics.topicpanels;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.StartupData;
import com.startupdata.client.utilities.ConvertJson;

public class BrandName extends VerticalPanel {

	public BrandName(final JSONObject company) {

		this.setSpacing(20);

		String companyName = ConvertJson.convertToString(StartupData.company
				.get("entityName"));

		if (companyName != null) {

			HTML htmlDescription = new HTML("<b>" + companyName + "</b>");
			add(htmlDescription);
		}
	}
}
