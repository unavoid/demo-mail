package com.demo.mail.product.dao;

import com.demo.mail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author fengxinhui
 * @email 1120964090@qq.com
 * @date 2021-03-31 17:15:05
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
