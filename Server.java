import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket myserver = new ServerSocket(12345);
		System.out.println("[*] Porta 12345 is open!");
		
		Socket client = myserver.accept();
		System.out.println("[*] New connection from client: " + client.getInetAddress().getHostAddress());
		
		Scanner input = new Scanner(client.getInputStream());
		while (input.hasNextLine()) {
			System.out.println(input.nextLine());
		}

		input.close();
		myserver.close();
	}
}
