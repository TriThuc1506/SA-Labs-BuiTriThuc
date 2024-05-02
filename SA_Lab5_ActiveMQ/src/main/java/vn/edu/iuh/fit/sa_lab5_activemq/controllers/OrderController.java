package vn.edu.iuh.fit.sa_lab5_activemq.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.edu.iuh.fit.sa_lab5_activemq.utils.EncodingServices;
import vn.edu.iuh.fit.sa_lab5_activemq.utils.JsonParse;

@Controller
public class OrderController {

  @Autowired
  private EncodingServices encodingServices;
  @Autowired
  private JmsTemplate jmsTemplate;
  @Autowired
  private JsonParse parse;

  @PostMapping("/submitOrder")
  public String submitOrder(@RequestParam("buy") String[] buy,
      @RequestParam("quantities") Integer[] quantities ){
    List<String> buyList = Arrays.stream(buy).map(encodingServices::decoding).toList();
    List<Integer> quantityList = Arrays.stream(quantities).filter(Objects::nonNull).toList();

    List<Object> listOrder = new ArrayList<>();
    listOrder.add(buyList);
    listOrder.add(quantityList);
    String orderJson = parse.ListObjectToJson(listOrder);
    System.out.println(orderJson);
    String encodeOrderJson = encodingServices.encoding(orderJson);
    jmsTemplate.convertAndSend("orderQueue", encodeOrderJson);
    return "/getEmail";
  }


}
