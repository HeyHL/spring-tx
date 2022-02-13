package io.hel.tx.mapper;

import io.hel.tx.entity.ActiveInfo;

/**
 * hel
 * 2022/2/13 2:43 下午
 * description:
 */
@SuppressWarnings({"all"})
public interface ActiveInfoMapper {
    int saveActiveInfo(ActiveInfo activeInfo) throws Exception;
}
