package com.demo.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.common.utils.PageUtils;
import com.demo.mail.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author fengxinhui
 * @email 1120964090@qq.com
 * @date 2021-03-31 17:15:04
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

