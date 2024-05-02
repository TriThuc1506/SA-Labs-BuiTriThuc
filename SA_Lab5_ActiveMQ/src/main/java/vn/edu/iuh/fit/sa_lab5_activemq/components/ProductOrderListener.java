//package vn.edu.iuh.fit.sa_lab5_activemq.components;
//
//import jakarta.jms.Message;
//import jakarta.jms.TextMessage;
//import java.util.ArrayList;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.annotation.JmsListener;
//import org.springframework.stereotype.Component;
//import vn.edu.iuh.fit.sa_lab5_activemq.repositories.OrderProductRepository;
//import vn.edu.iuh.fit.sa_lab5_activemq.repositories.ProductRepository;
//import vn.edu.iuh.fit.sa_lab5_activemq.utils.EncodingServices;
//import vn.edu.iuh.fit.sa_lab5_activemq.utils.JsonParse;
//
//@Component
//public class ProductOrderListener {
//
//  @Autowired
//  private EncodingServices encodingServices;
//  @Autowired
//  private JsonParse parse;
//  @Autowired
//  private ProductRepository productRepository;
//  @Autowired
//  private OrderProductRepository orderProductRepository;
//
//  @JmsListener(destination = "orderQueue")
//  public void receiveOrder(final Message OrderJsonMassage) {
//    String messageData = null;
//    String response = null;
//    List<OrderProduct> orderProducts = new ArrayList<>();
//
//    if (OrderJsonMassage instanceof TextMessage) {
//      try {
//        messageData = ((TextMessage) OrderJsonMassage).getText();
//        String decodeMessage = encodingServices.decoding(messageData);
//        List<Object> listOrder = parse.jsonToListObject(decodeMessage, List.class);
//        List<String> buyList = (List<String>) listOrder.get(0);
//        List<String> productIdList = (List<String>) listOrder.get(1);
//        List<Integer> quantityList = (List<Integer>) listOrder.get(2);
//
////        buyList.forEach(p -> {
////          productIdList.forEach(id -> {
////            if (Objects.equals(p, id)) {
////              int quantity = quantityList.get(productIdList.indexOf(id));
////              Optional<Product> product = productRepository.findById(Long.parseLong(id));
////              if (product.isPresent()) {
////                Product pro = product.get();
////                if (pro.getUnitStock() >= quantity) {
////                  pro.setUnitStock(pro.getUnitStock() - quantity);
////                  productRepository.save(pro);
////                  OrderProduct orderProduct = new OrderProduct(pro, 1, quantity);
////                  orderProducts.add(orderProduct);
////                } else {
////                  System.out.println("Not enough product in stock");
////                }
////              }
////            }
////          });
////        });
//        orderProductRepository.saveAll(orderProducts);
//        System.out.println(parse.ListOrderListToJson(orderProducts));
//      } catch (Exception e) {
//        e.printStackTrace();
//      }
//
//
//    }
//  }
//}
