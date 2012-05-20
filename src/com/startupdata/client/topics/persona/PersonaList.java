package com.startupdata.client.topics.persona;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.ui.ListBox;
import com.startupdata.client.utilities.ConvertJson;

public class PersonaList extends ListBox {

	public PersonaList(final JSONArray personas) {
		
		this.setWidth("200px");
		
		this.addItem("");

		if (personas != null) {

			for (int i = 0; i < personas.size(); i++) {

				JSONObject json = (JSONObject) personas.get(i);

				String ID = ConvertJson.getStringValue(json, "ID");

				this.addItem(ID);
			}
		}
	}
}