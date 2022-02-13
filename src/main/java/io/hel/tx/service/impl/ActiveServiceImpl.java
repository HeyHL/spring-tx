package io.hel.tx.service.impl;

import io.hel.tx.entity.ActiveInfo;
import io.hel.tx.entity.ActiveInfoExt;
import io.hel.tx.mapper.ActiveInfoExtMapper;
import io.hel.tx.mapper.ActiveInfoMapper;
import io.hel.tx.service.ActiveService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * hel
 * 2022/2/13 2:45 下午
 * description:
 */
@SuppressWarnings({"all"})
@Service
public class ActiveServiceImpl implements ActiveService {



    @Autowired
    private ActiveInfoMapper activeInfoMapper;
    @Autowired
    private ActiveInfoExtMapper activeInfoExtMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addActive() throws Exception {
        ActiveInfo activeInfo = new ActiveInfo();
        activeInfo.setActiveName("active_name");
        int rows = activeInfoMapper.saveActiveInfo(activeInfo);
        int i = 1 / 0;
        if (rows < 1) {
            throw new RuntimeException("insert t_active_info failed");
        }
        ActiveInfoExt activeInfoExt = new ActiveInfoExt();
        activeInfoExt.setExtMsg("extmsg");
        rows = activeInfoExtMapper.saveActiveInfoExt(activeInfoExt);
    }
}
