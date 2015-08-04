import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.codehaus.jackson.map.ObjectMapper;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8888);
			Socket client = server.accept();
			System.out.println("Client connected!");

			BufferedReader fr = new BufferedReader(new FileReader(new File(
					"sentences.txt")));

			ArrayList<String> list = new ArrayList<>();
			String line = "";
			while ((line = fr.readLine()) != null) {
				list.add(line);
			}

			Random r = new Random();
			String randomLine = list.get(r.nextInt(list.size()));

			ObjectMapper map = new ObjectMapper();
			BitResponse br = new BitResponse(randomLine, Date.from(Instant
					.now()));
			map.writeValue(new File("file.json"), br);

			BufferedReader bfrd = new BufferedReader(new FileReader(new File(
					"file.json")));
			String jsonFileString = bfrd.readLine();
			System.out.println(jsonFileString);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
			bw.write(jsonFileString);
			bw.flush();
			bw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

