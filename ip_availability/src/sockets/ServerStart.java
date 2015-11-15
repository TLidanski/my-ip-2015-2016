package sockets;

import java.io.IOException;

public class ServerStart {
	private static final int SERVER_PORT = 80;

	public static void main(String[] args) throws IOException {
		final Server server = new Server(SERVER_PORT);
		server.startServer();

	}

}