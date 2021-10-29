package com.gzhu.mapper;

import com.gzhu.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OrderMapper {

    Order findById(Long id);
}
