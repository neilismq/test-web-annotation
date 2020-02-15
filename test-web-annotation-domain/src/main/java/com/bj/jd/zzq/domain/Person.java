package com.bj.jd.zzq.domain;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 请填写类的描述
 *
 * @author zhaozhiqiang35
 * @date 2020-02-15 20:56
 */
@Data
@Accessors(chain = true)
public class Person {
    private String name;
    private Integer age;

}
