package com.startupdata.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTEntryPoint implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		StartupData.company = companyTest();

		RootPanel.get().add(MyCompanyPanel.vpStartupTopic);
	}

	private JSONObject companyTest() {

		String companyString = "{\"image\":\"http://a7.sphotos.ak.fbcdn.net/hphotos-ak-ash4/422474_331005503607897_330997440275370_884079_1698126433_n.jpg\","
				+ " \"entityName\":\"eXtreme Lean Business\", \"email\":\"alline.oliveira@xlean.biz\", "
				+ "\"blogURL\":\"http://xleanbiz.wordpress.com\", "
				+ "\"aboutmeURL\":\"http://xlean.biz\", "
				+ "\"ID\":\"EXtremeLeanBusiness_1332812176007\", "
				+ "\"facebookLogin\":\"330997440275370\", "
				+ "\"FoundedEntities\":[{\"ID\":\"AllineWatkins_1332886062783\", "
				+ "\"image\":\"http://media.linkedin.com/mpr/pub/image-ioivm44h01ZaaEhYVyvKGB_zBA9zwCh71GpHI3PNBsCdwUGaioiHI_AhB7Kbw8VDn06c/alline-watkins.jpg\", "
				+ "\"entityName\":\"Alline Watkins\"}], "
				+ "\"githubLogin\":\"\"}";

		return (JSONObject) JSONParser.parseStrict(companyString);

	}
}
