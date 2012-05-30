package com.startupdata.client.topics.persona;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.startupdata.client.custdevframework.ListPersonas;
import com.startupdata.client.utilities.UseTracking;

public class EditPersonaIcon extends Anchor {

	public EditPersonaIcon() {

		this.setHTML("<a href=#><img src='"
				+ GWT.getModuleBaseURL()
				+ "startupstages/EditIcon.jpg' width='18px' height='18px' border=0></a>");

		this.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

				new UseTracking(
						"com.startupdata.client.topics.edit.EditPersonaIcon");

				ListPersonas.list();
			}
		});
	}

}
