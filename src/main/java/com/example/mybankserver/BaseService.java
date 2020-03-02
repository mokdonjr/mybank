package com.example.mybankserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BaseService extends BaseComponent {

    @Autowired
    private OpenBankingConfig openBankingConfig;

    @PostConstruct
    public void initBaseService() {
        logger.info("apiKey:{} apiSecret:{}", CommonUtil.ifNull(openBankingConfig.getApiKey()), CommonUtil.ifNull(openBankingConfig.getApiSecret()));
    }

    public String hello() {
        return "hello";
    }
}
