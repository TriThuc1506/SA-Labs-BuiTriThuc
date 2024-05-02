package vn.edu.iuh.fit.sa_lab5_activemq.utils;

import com.google.gson.Gson;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class JsonParse {

  private final Gson gson = new Gson();


  public String ListObjectToJson(List<Object> orderProducts){
    return gson.toJson(orderProducts);
  }

  public List jsonToListObject(String json, Class clazz){
    return gson.fromJson(json, List.class);
  }


}
