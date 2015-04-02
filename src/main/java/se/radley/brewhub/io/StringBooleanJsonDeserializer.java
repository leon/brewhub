package se.radley.brewhub.io;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class StringBooleanJsonDeserializer extends JsonDeserializer<Boolean> {

	@Override
	public Boolean deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
		String s = jsonParser.getText();

		if (s == null) {
			return false;
		}

		s = s.toLowerCase();

		return "true".equals(s) || "yes".equals(s);
	}
}
