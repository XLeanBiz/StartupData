package com.startupdata.client.topics.brand;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.StartupData;
import com.startupdata.client.utilities.ConvertJson;

public class BrandPanel extends VerticalPanel {

	public BrandPanel(final JSONObject company) {

		HorizontalPanel hp = new HorizontalPanel();
		hp.setSpacing(20);

		String imageURL = ConvertJson.convertToString(StartupData.company
				.get("image"));

		if (imageURL != null) {

			HTML image = new HTML("<a href='#'><img src='" + imageURL
					+ "' border=0 ></a>");
			hp.add(image);
		}

		VerticalPanel vp = new VerticalPanel();

		String companyName = ConvertJson.convertToString(StartupData.company
				.get("entityName"));

		if (companyName != null) {

			HTML htmlDescription = new HTML("<b>" + companyName + "</b>");
			vp.add(htmlDescription);
		}

		String domain = ConvertJson.convertToString(StartupData.company
				.get("aboutmeURL"));

		if (domain != null) {

			HTML html = new HTML("<a href='" + domain + "' target='_blank'><b>"
					+ domain + "</b></a>");
			vp.add(html);
		}

		String blogURL = ConvertJson.convertToString(StartupData.company
				.get("blogURL"));

		if (blogURL != null) {

			HTML html = new HTML("<a href='" + blogURL
					+ "' target='_blank'><b>" + blogURL + "</b></a>");
			vp.add(html);
		}

		hp.add(vp);

		this.add(hp);
	}
}
