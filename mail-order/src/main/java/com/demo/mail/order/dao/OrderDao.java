package com.demo.mail.order.dao;

import com.demo.mail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author fengxinhui
 * @email 1120964090@qq.com
 * @date 2021-04-01 11:02:48
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
