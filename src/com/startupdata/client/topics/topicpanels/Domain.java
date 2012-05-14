package com.startupdata.client.topics.topicpanels;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.StartupData;
import com.startupdata.client.utilities.ConvertJson;

public class Domain extends VerticalPanel {

	public Domain(final JSONObject company) {

		this.setSpacing(20);

		String domain = ConvertJson.convertToString(StartupData.company
				.get("aboutmeURL"));

		if (domain != null) {

			HTML html = new HTML("<a href='" + domain + "' target='_blank'><b>"
					+ domain + "</b></a>");
			add(html);
		}
	}
}
