package pojo;

import org.apache.juneau.html.HtmlParser;
import org.apache.juneau.html.HtmlSerializer;
import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlParser;
import org.apache.juneau.xml.XmlSerializer;

public class JuniaoAPI_SerDeser_ProductTest {

	public static void main(String[] args) throws SerializeException, ParseException {

		String[] sellerNames = { "Neon Enterprises", "ABC Software", "XYZ IT Solutions" };

		// Serializatin

		// pojo to json:
		JsonSerializer serializer = JsonSerializer.DEFAULT_READABLE;
		Product product = new Product("Mac Book Pro", 1000, "White", sellerNames);
		String json = serializer.serialize(product);
		System.out.println(json);

		// pojo to xml
		XmlSerializer xmlSerializer = XmlSerializer.DEFAULT_SQ_READABLE;
		System.out.println(xmlSerializer.serialize(product));

		// pojo to html
		HtmlSerializer htmlSerializer = HtmlSerializer.DEFAULT_SQ_READABLE;
		System.out.println(htmlSerializer.serialize(product));

		// Deserialization
		// JSON to POJO
		JsonParser jsonParser = JsonParser.DEFAULT;
		String jsonValue = "{\r\n" + "\"bulkRequestId\": 10256,\r\n" + "\"awaitingResponseConfigDays\": 5,\r\n"
				+ "\"privacyRequestDetails\":[\r\n"
				+ "{\"privacyRequestId\": 2441, \"firstName\": \"Anil\", \"lastName\": \"Kumar\", \"status\": \"In Progress\",…},\r\n"
				+ "{\"privacyRequestId\": 2443, \"firstName\": \"Anil\", \"lastName\": \"Kumar\", \"status\": \"In Progress\",…},\r\n"
				+ "{\"privacyRequestId\": 2444, \"firstName\": \"Anil\", \"lastName\": \"Kumar\", \"status\": \"In Progress\",…},\r\n"
				+ "{\"privacyRequestId\": 2445, \"firstName\": \"Anil\", \"lastName\": \"Kumar\", \"status\": \"Draft\",…},\r\n"
				+ "{\"privacyRequestId\": 2446, \"firstName\": \"Anil\", \"lastName\": \"Kumar\", \"status\": \"Draft\",…},\r\n"
				+ "{\"privacyRequestId\": 2447, \"firstName\": \"Anil\", \"lastName\": \"Kumar\", \"status\": \"Draft\",…},\r\n"
				+ "{\"privacyRequestId\": 2440, \"firstName\": \"Anil\", \"lastName\": \"Kumar\", \"status\": \"Completed\",…},\r\n"
				+ "{\"privacyRequestId\": 2442, \"firstName\": \"Anil\", \"lastName\": \"Kumar\", \"status\": \"Completed\",…}\r\n"
				+ "],\r\n" + "\"totalElements\": 8,\r\n" + "\"totalPages\": 1,\r\n" + "\"currentPage\": 0,\r\n"
				+ "\"pageSize\": 25\r\n" + "}";
		jsonParser.parse(jsonValue, Product.class);

		// XML to POJO
		XmlParser xmlParser = XmlParser.DEFAULT;

		// HTML to POJO
		HtmlParser htmlParser = HtmlParser.DEFAULT;
	}
}
