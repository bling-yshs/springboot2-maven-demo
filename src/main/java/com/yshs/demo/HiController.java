package com.yshs.demo;

import cn.hutool.core.date.LocalDateTimeUtil;
import com.mongodb.client.result.DeleteResult;
import com.yshs.demo.strategy.PayStrategy;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@Slf4j
public class HiController {
    private final MongoTemplate mongoTemplate;

    private final Map<String, PayStrategy> payStrategyMap;

    @RequestMapping("/hi")
    @SneakyThrows
    public void hi(String payType) {
        log.info("※payStrategyMap的值为: {}", payStrategyMap);
        payStrategyMap.get(payType).pay();
    }
}
