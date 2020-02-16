package com.bj.jd.zzq.service.impl;

import com.bj.jd.zzq.dao.TestDao;
import com.bj.jd.zzq.domain.Person;
import com.bj.jd.zzq.service.TestService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import sun.security.krb5.internal.PAData;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * 请填写类的描述
 *
 * @author zhaozhiqiang35
 * @date 2020-02-15 20:43
 */

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;

    @Value("${application.name}")
    private String applicationName;

    @Value("${common.name}")
    private String username;


    @Override
    public PageInfo<Person> sayHi() {
        PageHelper.startPage(2, 1);
        List<Person> list = testDao.queryList();
        PageInfo<Person> pageInfo = new PageInfo<>(list);
        System.out.println("service->>>>>>>>>username=" + username + ",applicationName=" + applicationName);
        return pageInfo;
    }

    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.MONTH, 0);
        instance.set(Calendar.DAY_OF_MONTH, 9);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("排卵期：" + sdf.format(instance.getTime()));
        instance.add(Calendar.DAY_OF_YEAR, 282);
        System.out.println("预产期：" + sdf.format(instance.getTime()));
    }

}
