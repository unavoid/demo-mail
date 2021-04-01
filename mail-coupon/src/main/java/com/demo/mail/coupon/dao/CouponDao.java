package com.demo.mail.coupon.dao;

import com.demo.mail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author fengxinhui
 * @email 1120964090@qq.com
 * @date 2021-04-01 10:42:20
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
