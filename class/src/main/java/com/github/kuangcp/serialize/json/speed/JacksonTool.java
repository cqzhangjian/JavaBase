package com.github.kuangcp.serialize.json.speed;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.kuangcp.serialize.Person;
import java.io.IOException;
import java.util.List;

/**
 * Created by https://github.com/kuangcp
 *
 * @author kuangcp
 */
public class JacksonTool implements JsonTool<Person> {

  private ObjectMapper mapper = new ObjectMapper();

  @Override
  public void fromJSON(String json, Class<Person> target) throws IOException {
    mapper.readValue(json, target);
  }

  @Override
  public void toJSON(List<Person> dataList) throws JsonProcessingException {
    mapper.writeValueAsString(dataList);
  }

  @Override
  public String getName() {
    return "Jackson";
  }
}
