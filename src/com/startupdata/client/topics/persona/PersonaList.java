package com.startupdata.client.topics.persona;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.ListBox;
import com.startupdata.client.StartupData;
import com.startupdata.client.StartupDataTopics;
import com.startupdata.client.utilities.ConvertJson;

public class PersonaList extends ListBox {

	public PersonaList(final JSONArray personas) {

		String persona = ConvertJson.convertToString(StartupData.companyTopics
				.get(StartupDataTopics.TopicID.Persona.toString()));

		this.setWidth("200px");

		this.addItem("");

		if (personas != null) {

			for (int i = 0; i < personas.size(); i++) {

				JSONObject json = (JSONObject) personas.get(i);

				String ID = ConvertJson.getStringValue(json, "ID");

				this.addItem(ID);

				if (ID.equals(persona)) {
					
					this.setSelectedIndex(i+1);
				}
			}
		}

	}
}
