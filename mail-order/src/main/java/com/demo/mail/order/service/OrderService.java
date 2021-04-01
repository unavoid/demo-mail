package com.demo.mail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.common.utils.PageUtils;
import com.demo.mail.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author fengxinhui
 * @email 1120964090@qq.com
 * @date 2021-04-01 11:02:48
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

