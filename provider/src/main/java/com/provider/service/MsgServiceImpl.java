package com.provider.service;

import com.api.MsgService;
import com.model.Code;
import com.model.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MsgServiceImpl implements MsgService {
    public Result sendMsg(String msg) {
        log.debug("服务方接收参数:{}",msg);
        return Result.instance(Code.success, msg);
    }
}
