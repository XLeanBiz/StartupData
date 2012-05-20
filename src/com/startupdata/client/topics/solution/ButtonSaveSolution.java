package com.startupdata.client.topics.solution;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.startupdata.client.StartupData;
import com.startupdata.client.StartupDataTopics;
import com.startupdata.client.startupdb.GetStartupDataTopics;
import com.startupdata.client.topics.textTopics.SaveStartupDataTopic;
import com.startupdata.client.utilities.ConvertJson;

public class ButtonSaveSolution extends Button {

	public ButtonSaveSolution() {

		this.setHTML("Save");
		this.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				String companyID = ConvertJson
						.convertToString(StartupData.company.get("ID"));

				SaveStartupDataTopic.save(companyID, "UniqueValueProposition",
						EditSolution.uniqueValuePropositionField.getHTML());

				SaveStartupDataTopic.save(companyID, "Vision",
						EditSolution.visionField.getHTML());

				SaveStartupDataTopic.save(companyID, "Goals",
						EditSolution.goalsField.getHTML());

				GetStartupDataTopics.get(companyID,
						StartupDataTopics.TopicID.Solution.toString());
			}
		});
	}
}
