package com.startupdata.client.topics.edit;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.StartupData;
import com.startupdata.client.utilities.ConvertJson;

public class EditStartupDataTextTopic extends VerticalPanel {

	public EditStartupDataTextTopic(final String topicName) {

		this.setSpacing(10);
		this.setWidth("100%");
		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		final TextArea topicField = new TextArea();
		topicField.setWidth("500px");

		add(topicField);

		Button save = new Button("Save");
		save.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				String companyID = ConvertJson
						.convertToString(StartupData.company.get("ID"));

				SaveStartupDataTopic.save(companyID, topicName,
						topicField.getValue());
			}
		});

		this.add(save);

		if (StartupData.companyTopics != null) {

			String companyTopicDescription = ConvertJson
					.convertToString(StartupData.companyTopics.get(topicName));

			topicField.setValue(companyTopicDescription);
		}

	}
}
