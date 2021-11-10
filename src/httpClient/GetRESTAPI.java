package httpClient;

import java.io.StringReader;
import java.net.URI;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

@SuppressWarnings("deprecation")
public class GetRESTAPI {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		DefaultHttpClient client = new DefaultHttpClient();

		try {
			URI uri = URI.create("URI");
			HttpGet get = new HttpGet(uri);
			get.addHeader("accept", "application/xml");
			CloseableHttpResponse response = client.execute(get);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode != 200) {
				throw new RuntimeException("Failed with HTTP error code : " + statusCode);
			}
			// Now pull back the response object
			HttpEntity entity = response.getEntity();
			String apiOutput = EntityUtils.toString(entity);
			System.out.println(apiOutput);
			JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			User user = (User) unmarshaller.unmarshal(new StringReader(apiOutput));
			System.out.println(user.getFirstName());
			System.out.println(user.getLastName());
		} finally {
			client.getConnectionManager().shutdown();
		}
	}
}
