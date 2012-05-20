package com.startupdata.client.topics.team;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.StartupData;
import com.startupdata.client.utilities.ConvertJson;

public class TeamPanel extends VerticalPanel {

	public TeamPanel() {

		this.setSpacing(10);

		JSONArray jsonArray = (JSONArray) StartupData.company
				.get("FoundedEntities");

		for (int i = 0; i < jsonArray.size(); i++) {

			final JSONObject contactJson = (JSONObject) jsonArray.get(i);

			String entityName = ConvertJson.getStringValue(contactJson,
					"entityName");

			String imageURL = ConvertJson.getStringValue(contactJson, "image");

			String id = ConvertJson.getStringValue(contactJson, "ID");

			HorizontalPanel hpName = new HorizontalPanel();

			hpName.setSpacing(5);
			hpName.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);

			if (imageURL != null) {

				HTML image = new HTML("<a href='http://uniqueid.co?ID=" + id
						+ "' target='_blank'><img src='" + imageURL
						+ "' border=0 width='25px' height='25px'></a>");
				hpName.add(image);
			}

			HTML name = new HTML(
					"<font size=2 color=blue><a href='http://uniqueid.co?ID="
							+ id + "' target='_blank'>" + entityName
							+ "</a></font>");
			hpName.add(name);

			this.add(hpName);
		}
	}
}
