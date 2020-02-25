package com.zqf.apache.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zqf.apache.dubbo.provider.api.EchoService;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created with IntelliJ IDEA.
 * Author: Qifan Zhao
 * Date: 2019/10/24
 * Time: 11:07
 * Description:
 *
 * @ Modified By：
 * @Version: $version$
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Value("${dubbo.protocol.port}")
    private String port;
    @Override
    public String echo(String string) {
        return "Echo Hello Dubbo " + string + " i am from port: " + port;
    }
}
