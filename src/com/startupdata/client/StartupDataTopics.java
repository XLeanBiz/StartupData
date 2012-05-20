package com.startupdata.client;


public class StartupDataTopics {

	public enum TopicID {

		Persona,
		Solution, UniqueValueProposition, Vision, Goals, 
		Team, Brand
	}

	private TopicID topicID;

	private String topicName;

	public StartupDataTopics() {

	}

	public StartupDataTopics(TopicID topicID) {

	}

	public TopicID getTopicID() {
		return topicID;
	}

	public void setTopicID(TopicID topicID) {
		this.topicID = topicID;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

}
