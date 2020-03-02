package com.example.mybankserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 모든 컴포넌트의 베이스 컴포넌트
 */
public abstract class BaseComponent {
    protected Logger logger = LoggerFactory.getLogger(getClass());

}
