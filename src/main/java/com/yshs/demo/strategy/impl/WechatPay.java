package com.yshs.demo.strategy.impl;

import com.yshs.demo.strategy.PayStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component("WechatPay")
public class WechatPay implements PayStrategy {
    @Override
    public void pay() {
        log.info("WechatPay");
    }
}
