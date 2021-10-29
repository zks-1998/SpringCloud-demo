package com.gzhu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;
    private Long userId;
    private String name;
    private Long price;
    private Integer num;
    private User user;
}
