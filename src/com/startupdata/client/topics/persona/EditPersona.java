package com.startupdata.client.topics.persona;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class EditPersona extends HorizontalPanel {

	public static PersonaList personaList;

	public EditPersona(final JSONArray personas) {

		this.setSpacing(20);

		personaList = new PersonaList(personas);

		this.add(personaList);

		this.add(new ButtonSavePersona());
	}

}
