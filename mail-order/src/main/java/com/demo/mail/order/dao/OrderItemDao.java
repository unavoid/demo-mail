package com.demo.mail.order.dao;

import com.demo.mail.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author fengxinhui
 * @email 1120964090@qq.com
 * @date 2021-04-01 11:02:47
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
