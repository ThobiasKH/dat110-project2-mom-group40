package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		// TODO - start

		System.out.println("Temperature device start");
		// create a client object and use it to
		Client client = new Client("sensor", Common.BROKERHOST, Common.BROKERPORT);

		// - connect to the broker - user "sensor" as the user name
		client.connect();
		//Random random = new Random();
		for (int i = 0; i < COUNT; i++) {
			int temp = sn.read();
			System.out.println("READING: " + temp);
			client.publish(Common.TEMPTOPIC, String.valueOf(temp));

			try {
				Thread.sleep(1000);		
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// - publish the temperature(s)
		// - disconnect from the broker

		// TODO - end

		System.out.println("Temperature device stopping ... ");

		//throw new UnsupportedOperationException(TODO.method());

	}
}