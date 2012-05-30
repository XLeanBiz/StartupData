package com.startupdata.client;

import java.util.Arrays;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.startupdb.GetStartupDataTopics;
import com.startupdata.client.topics.VerifyTopic;

public class MyCompanyPanel extends VerticalPanel {

	public static VerticalPanel vpEditTopic = new VerticalPanel();

	public static VerticalPanel vpStartupTopic = new VerticalPanel();

	public MyCompanyPanel(final JSONObject companyUniqueID, final String topicId) {

		vpStartupTopic.clear();

		if (showMyCompany(companyUniqueID, topicId)) {

			this.setSpacing(10);
			this.setWidth("100%");

			HorizontalPanel hp = new HorizontalPanel();
			hp.setWidth("100%");

			HTML htmlMyCompany = new HTML(
					"<font size=4><b>My Company</b></font>", true);
			hp.add(htmlMyCompany);

			hp.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);
			hp.add(vpEditTopic);

			this.add(hp);

			this.add(vpStartupTopic);

			new VerifyTopic(topicId);
		}
	}

	public static boolean showMyCompany(final JSONObject companyUniqueID,
			final String topicID) {

		if (companyUniqueID != null) {

			StartupData.company = companyUniqueID;

			if (StartupData.companyTopics == null) {

				GetStartupDataTopics.get(companyUniqueID, topicID);
			}

			String values = Arrays.deepToString(StartupDataTopics.TopicID
					.values());

			values = values.replaceAll("]", ",");

			if (values.contains(topicID + ",")) {

				return true;
			}
		} 

		return false;
	}
}
