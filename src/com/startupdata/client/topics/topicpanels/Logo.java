package com.startupdata.client.topics.topicpanels;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.StartupData;
import com.startupdata.client.utilities.ConvertJson;

public class Logo extends VerticalPanel {

	public Logo(final JSONObject company) {

		this.setSpacing(20);

		String imageURL = ConvertJson.convertToString(StartupData.company
				.get("image"));

		if (imageURL != null) {

			HTML image = new HTML("<a href='#'><img src='" + imageURL
					+ "' border=0 ></a>");
			add(image);
		}
	}
}
