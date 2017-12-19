package cn.lu.demo.idworker.service;

import cn.bdqn.shop.service.IdWorkerService;
import cn.lu.demo.idworker.IdWorker;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
@Component
@Service(interfaceClass=IdWorkerService.class)
public class IdWorkerServiceImp implements IdWorkerService{
    @Override
    public long getId() {
        try {
            return IdWorker.getFlowIdWorkerInstance().nextId();
        } catch (Exception e) {
            return 0;
        }
    }
}
