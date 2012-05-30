package com.startupdata.server.custdevframework;

import com.startupdata.server.utilities.EncryptText;
import com.startupdata.server.utilities.URLUtilities;

public class ListPersonas {

	// http://jsonpfy.startupsdata.appspot.com/ListDataService
	// ?kind=Personas&returnField=ID

	private static String getListUrl = "https://jsonpfy.startupsdata.appspot.com/ListDataService";

	public static String list() {

		String parameters = "kind=Personas&returnField=ID";

		final String jsonString = URLUtilities.fetchURLPost(getListUrl,
				parameters + EncryptText.getAuthParameter());

		return jsonString;
	}
}
