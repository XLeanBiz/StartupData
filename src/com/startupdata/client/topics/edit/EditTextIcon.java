package com.startupdata.client.topics.edit;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.startupdata.client.MyCompanyPanel;
import com.startupdata.client.utilities.UseTracking;

public class EditTextIcon extends Anchor {

	public EditTextIcon(final String topicID) {

		this.setHTML("<a href=#><img src='"
				+ GWT.getModuleBaseURL()
				+ "startupstages/EditIcon.jpg' width='18px' height='18px' border=0></a>");

		this.setSize("22px", "20px");

		this.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

				new UseTracking(
						"com.startupdata.client.topics.edit.EditTextIcon");

				MyCompanyPanel.vpStartupTopic.clear();
				MyCompanyPanel.vpStartupTopic.add(new EditStartupDataTextTopic(
						topicID));
			}
		});
	}

}
