package com.wl.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wl.service.DeptService;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Auther:wangliang
 * @Date:2021/2/19 15:05
 */
@Component
@Service(interfaceClass = DeptService.class)
public class DeptServiceImpl implements DeptService {
    @Override
    public String sayDeptName(String s) {
        return "我是前瞻事业部...";
    }
}
