package pojo;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JackSon_Ser_Deser_JSON {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		// Serilization to JSON
		ObjectMapper mapper = new ObjectMapper();
		Car car = new Car("White", "Sedan");

		// 1
		mapper.writeValue(new File("C:\\GK_Work\\gk\\codebase_gk\\java_sessions_basics\\src\\pojo\\Car_JSON.json"),
				car);
		// 2
		String carAsString = mapper.writeValueAsString(car);
		System.out.println(carAsString);

		// Deserialization
		Car car1 = mapper.readValue(carAsString, Car.class);
		System.out.println(car1);

		// Another way
		String jsonCarArray = "[{ \"color\" : \"Black\", \"type\" : \"BMW\" }, { \"color\" : \"Red\", \"type\" : \"FIAT\" }]";
		List<Car> listCar = mapper.readValue(jsonCarArray, new TypeReference<List<Car>>() {
		});
	}
}
