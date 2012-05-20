package com.startupdata.client.topics.solution;

import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.RichTextArea;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.startupdata.client.StartupData;
import com.startupdata.client.utilities.ConvertJson;
import com.startupdata.client.utilities.FormField;

public class EditSolution extends VerticalPanel {

	public static RichTextArea uniqueValuePropositionField = new RichTextArea();

	public static RichTextArea visionField = new RichTextArea();

	public static RichTextArea goalsField = new RichTextArea();

	public EditSolution() {

		this.setSpacing(10);
		this.setWidth("100%");
		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		uniqueValuePropositionField.setHTML("");
		uniqueValuePropositionField.setSize("500px", "60px");
		this.add(FormField.getFormField(
				"<font color=blue><b>Unique Value Proposition</b></font>",
				uniqueValuePropositionField));

		visionField.setHTML("");
		visionField.setSize("500px", "60px");
		this.add(FormField.getFormField(
				"<font color=blue><b>Vision</b></font>", visionField));

		goalsField.setHTML("");
		goalsField.setSize("500px", "60px");
		this.add(FormField.getFormField("<font color=blue><b>Goals</b></font>",
				goalsField));

		if (StartupData.companyTopics != null) {

			String uniqueValueProposition = ConvertJson
					.convertToString(StartupData.companyTopics
							.get("UniqueValueProposition"));

			uniqueValuePropositionField.setHTML(uniqueValueProposition);

			String vision = ConvertJson
					.convertToString(StartupData.companyTopics.get("Vision"));

			visionField.setHTML(vision);

			String goals = ConvertJson
					.convertToString(StartupData.companyTopics.get("Goals"));

			goalsField.setHTML(goals);
		}

		this.add(new ButtonSaveSolution());

	}
}
