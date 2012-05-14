package com.startupdata.client.topics;


public class StartupDataTopics {

	public enum TopicID {

		Persona, Scenarios, ProblemScore, 
		UniqueValueProposition, UniqueValueScore, MVPResults, 
		Vision, Team, Goals, TeamSize, Visits, SignUps, CommunicationSkills, 
		SourceCode, TestCoverage, LOC, EarlyAdopters, Returns, 
		Incorporation, RevenueModel, Partnerships, CostPerUser, RevenuePerUser, MustHaveScore,
		AdvisorsBoard, InvestorsMeetings, InvestmentScore,
		DistributionChannels, Advertising, ReferralModels, IncreasingRate, ConversionRate, ReferralRate, MarketSize

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
