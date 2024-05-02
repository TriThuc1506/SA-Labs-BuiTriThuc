package vn.edu.iuh.fit.sa_lab5_activemq.utils;

import java.util.Base64;
import org.springframework.stereotype.Service;

@Service
public class EncodingServices {

  public String encoding(String text ){
    return Base64.getEncoder().encodeToString(text.getBytes());
  }

  public String decoding(String text){
    byte[] decodeBytes = Base64.getDecoder().decode(text);
    return new String(decodeBytes);
  }

}
