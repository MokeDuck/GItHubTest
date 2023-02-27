import java.io.IOException;
import java.io.FileNotFoundException;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.Scanner;

public class WebPageReading {

	public static String getWebPage(String address) throws IOException {
		URL url = new URL(address);
		Scanner in = new Scanner(url.openStream());
		StringBuilder sb = new StringBuilder();
		while (in.hasNextLine()) {
			sb.append(in.nextLine());
			sb.append('\n');
		}
		in.close();
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		Scanner consoleIn = new Scanner(System.in);
		boolean done = false;
		while (!done) {

			System.out.print("Enter a web address, including http:// (or q to quit): ");
			String address = consoleIn.nextLine();

			if (address.equals("q")) {
				done = true;
			} else {
				try {
					String s = getWebPage(address);
					System.out.print(s);
				} catch (MalformedURLException MUE) {
					MUE = new MalformedURLException("bad URL");
				} catch (FileNotFoundException FNFE) {
					FNFE = new FileNotFoundException("can't find that file");
				} catch (IOException IOE) {
					IOE = new IOException("unable to connect to server");
				}
			}
		}
		consoleIn.close();
	}
}
