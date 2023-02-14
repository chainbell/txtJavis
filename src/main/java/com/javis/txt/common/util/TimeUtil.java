package com.javis.txt.common.util;

import java.time.*;
import java.util.Date;

public class TimeUtil {

    public static long getCurrentEpochMilli(){
        /**
         * UTC 기반 epoch 시간
         * */
        Instant ins = Instant.now();
        long ts = ins.toEpochMilli();
        return ts;
    }

    public static String getCurrentDate() {

        Instant ins2 = Instant.ofEpochMilli(getCurrentEpochMilli());
        return ins2.toString();
    }
}
