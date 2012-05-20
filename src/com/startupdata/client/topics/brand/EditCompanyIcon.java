package com.startupdata.client.topics.brand;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Anchor;
import com.startupdata.client.StartupData;
import com.startupdata.client.utilities.ConvertJson;
import com.startupdata.client.utilities.UseTracking;

public class EditCompanyIcon extends Anchor {

	public EditCompanyIcon() {

		this.setHTML("<a href=#><img src='"
				+ GWT.getModuleBaseURL()
				+ "startupstages/EditIcon.jpg' width='18px' height='18px' border=0></a>");

		this.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

				new UseTracking(
						"com.startupdata.client.topics.edit.EditTeamIcon");

				String companyID = ConvertJson
						.convertToString(StartupData.company.get("ID"));

				Window.open("http://uniqueid.co?ID=" + companyID, "_blank", "");
			}
		});
	}

}
