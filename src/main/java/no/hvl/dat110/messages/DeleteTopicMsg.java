package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {
	private String topic;
	// message sent from client to create topic on the broker

    public DeleteTopicMsg(String user, String topic) {
		super(MessageType.DELETETOPIC, user);
		this.topic = topic;
    }

	// TODO:
	// Implement object variables - a topic is required

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getTopic() {return topic;}

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text

	@Override
	public String toString() {
 	   return "DeleteTopicMsg [type=" + getType() + ", user=" + getUser() + ", topic=" + topic + "]";
	}


}
