package com.demo.mail.member.feign;

import com.demo.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("mail-coupon")
public interface CouponFeignService {

    @GetMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
