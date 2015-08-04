import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import org.codehaus.jackson.map.ObjectMapper;

public class Client {

	public static void main(String[] args) {
		try {
			Socket client = new Socket("localhost", 8888);

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
			bw.write("Upit");
			bw.flush();
			System.out.println("Client sent request");

			BufferedReader read = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			ObjectMapper map = new ObjectMapper();
			BitResponse response = map.readValue(read.readLine(),
					BitResponse.class);
			System.out.println(response.getMessage());
			System.out.println(response.getTimestamp());

			client.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
