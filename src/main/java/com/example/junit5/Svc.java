package com.example.junit5;

import org.springframework.stereotype.Service;

/**
 * @author chenpenghui
 * @date 2020/7/11
 */
@Service
public class Svc {

    public int add(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }
}
