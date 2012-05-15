package com.startupdata.client;

import java.util.Arrays;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.topics.StartupDataTopics;
import com.startupdata.client.topics.VerifyTopic;
import com.startupdata.client.topics.edit.EditTextIcon;

public class MyCompanyPanel extends VerticalPanel {

	public static VerticalPanel vpStartupTopic = new VerticalPanel();

	public MyCompanyPanel(final String topicId) {

		vpStartupTopic.clear();

		if (showMyCompany(topicId)) {

			this.setSpacing(10);
			this.setWidth("100%");

			HorizontalPanel hp = new HorizontalPanel();
			hp.setWidth("100%");

			HTML htmlMyCompany = new HTML(
					"<font size=4><b>My Company</b></font>", true);
			hp.add(htmlMyCompany);

			hp.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);
			hp.add(new EditTextIcon(topicId));

			this.add(hp);

			this.add(vpStartupTopic);

			new VerifyTopic(topicId);
		}
	}

	public static boolean showMyCompany(final String topicId) {

		if (StartupData.company != null) {

			String values = Arrays.deepToString(StartupDataTopics.TopicID
					.values());

			values.replaceAll("]", ",");

			if (values.contains(topicId + ",")) {

				return true;
			}
		}

		return false;
	}
}
