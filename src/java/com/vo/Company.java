package com.vo;

import java.util.Arrays;
import java.util.Properties;

/**
 * \Date: 2018/1/25
 * \
 * \Description:
 * \
 */
public class Company {
    private Properties msg;
    private Integer data[];

    @Override
    public String toString() {
        return "Company{" +
                "msg=" + msg +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    public Properties getMsg() {
        return msg;
    }

    public void setMsg(Properties msg) {
        this.msg = msg;
    }

    public Integer[] getData() {
        return data;
    }

    public void setData(Integer[] data) {
        this.data = data;
    }
}
