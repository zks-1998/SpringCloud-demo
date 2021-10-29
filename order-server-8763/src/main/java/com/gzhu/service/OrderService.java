package com.gzhu.service;


import com.gzhu.clients.UserClient;
import com.gzhu.mapper.OrderMapper;
import com.gzhu.pojo.Order;
import com.gzhu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private UserClient userClient;
   /* @Autowired
    private RestTemplate restTemplate;*/

    public Order queryOrderById(Long orderId) {
        Order order =  orderMapper.findById(orderId);
        User user = userClient.findById(order.getUserId());
        order.setUser(user);
        return order;
        /*//1.查询订单
        Order order =  orderMapper.findById(orderId);
        //2.利用RestTemplate发起http请求，查询用户
        String url = "http://userservice/user/"+order.getUserId();
        User user = restTemplate.getForObject(url, User.class);
        order.setUser(user);
        return order;*/
    }
}
