package httpClient;

import java.io.StringWriter;
import java.net.URI;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONArray;
import org.testng.Assert;

@SuppressWarnings("deprecation")
public class POSTRESTAPI {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		DefaultHttpClient client = new DefaultHttpClient();

		User user = new User("GK", "Peter");

		StringWriter stringWriter = new StringWriter();
		JAXBContext context = JAXBContext.newInstance(User.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(user, stringWriter);

		try {
			URI uri = URI.create("URI");
			HttpPost post = new HttpPost(uri);
			post.addHeader("accept", "application/xml");

			StringEntity stringEntity = new StringEntity(stringWriter.getBuffer().toString());
			post.setEntity(stringEntity);

			// Another way to execute
			HttpResponse httpResponse = HttpClientBuilder.create().build().execute(post);

			// Simple way to execute
			CloseableHttpResponse response = client.execute(post);

			// Fetching response in JSON
			JSONArray jsonResponseArray = new JSONArray(response.toString());

			// Fetching value of capital parameter
			String capital = jsonResponseArray.getJSONObject(0).getString("capital");

			// Asserting that capital of Norway is Oslo
			Assert.assertEquals(capital, "Mumbai");

			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode != 201) {
				throw new RuntimeException("Failed with HTTP error code : " + statusCode);
			}
		} finally {
			client.getConnectionManager().shutdown();
		}
	}
}
