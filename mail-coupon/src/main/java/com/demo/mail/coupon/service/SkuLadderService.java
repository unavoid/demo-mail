package com.demo.mail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.common.utils.PageUtils;
import com.demo.mail.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author fengxinhui
 * @email 1120964090@qq.com
 * @date 2021-04-01 10:42:19
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

