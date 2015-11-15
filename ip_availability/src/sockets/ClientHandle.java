package sockets;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandle implements Runnable {
	private static final String STOP_SERVER = "stopServer";

	private final Socket socket;

	private final Server server;

	public ClientHandle(Server server, Socket socket) {
		this.socket = socket;
		this.server = server;
	}
	
	@Override
	public void run() {
		try {
			final PrintStream out = new PrintStream(socket.getOutputStream());
			
			final Scanner scanner = new Scanner(socket.getInputStream());
			
			while (scanner.hasNextLine()) {
				final String line = scanner.nextLine();
				if (STOP_SERVER.equals(line)) {
					server.stopServer();
					break;
				}
				final String[] result = parse(line);
				new CommandHandler(result).execute();
				
			}
			scanner.close();
			out.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			server.onClientStopped(this);
		}
	}
	
	public void stopClient() throws IOException {
		socket.close();
		// TODO add variable closed
	}
	
	private static String[] parse(String command){
		final String[] split = command.split(":");
		
		return split;		
	}
}