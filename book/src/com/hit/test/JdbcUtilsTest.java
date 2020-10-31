package com.hit.test;

import com.hit.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class JdbcUtilsTest {
    @Test
    public void testJdbc(){
        for (int i = 0; i < 100; i++) {
            Connection connection = JdbcUtils.getConnection();
            System.out.println(connection);
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            //如果你获取一百个 也只能得到10个 因为你配置的时候就只限制了最大连接数是10
            //你要加上关闭条件，那你想开多少开多少了
        }
    }
}
