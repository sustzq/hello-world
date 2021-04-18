package com.example.demo.service.impl;

import com.example.demo.service.HelloWorldService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Slf4j
public class helloWorldServiceImpl  implements HelloWorldService , Comparable , Comparator {
    @Override
    public void hello() {
        log.info("JDK1.8接口默认方法  Default");
        defaultTest();
        log.info("JDK1.8接口  可以定义静态方法");
        HelloWorldService.staticTest();

        log.info("JDK1.8  lamda表达式");

        log.info("JDK1.8  流式处理");
        Hashtable table = new Hashtable();
        Set set = new HashSet();
        Map map = new HashMap();
        List list = new ArrayList();



    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
