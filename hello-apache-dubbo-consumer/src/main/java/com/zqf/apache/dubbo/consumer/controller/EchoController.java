package com.zqf.apache.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zqf.apache.dubbo.provider.api.EchoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
@RestController
public class EchoController {
    @Reference(version = "1.0.0")
    private EchoService echoService;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string){
        return echoService.echo(string);
    }
}
