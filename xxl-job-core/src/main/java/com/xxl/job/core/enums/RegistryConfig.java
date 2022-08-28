package com.xxl.job.core.enums;

/**
 * Created by xuxueli on 17/5/10.
 */
public class RegistryConfig {

    public static final int BEAT_TIMEOUT = 30; // 维护的心跳时间,单位:秒
    public static final int DEAD_TIMEOUT = BEAT_TIMEOUT * 3; // 3 个心跳时间

    public enum RegistType{ EXECUTOR, ADMIN }

}
