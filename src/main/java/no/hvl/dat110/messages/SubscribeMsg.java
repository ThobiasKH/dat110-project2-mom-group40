package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {
	private String topic;
	// message sent from client to subscribe on a topic 

    public SubscribeMsg(String user, String topic) {
		super(MessageType.SUBSCRIBE, user);
        this.topic = topic;

    }

	// TODO:
	// Implement object variables - a topic is required

	public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

	@Override
	public String toString() {
    	return "SubscribeMsg [type=" + getType() + ", user=" + getUser() + ", topic=" + topic + "]";
	}


	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
		
}
