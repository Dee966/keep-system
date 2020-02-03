package com.xiaoman.keep_system;

import com.xiaoman.keep_system.pojo.vo.ClockInVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DateFormat;
import java.util.Date;

@SpringBootTest
class KeepSystemApplicationTests {


    @Test
    void dateTest() {
        String format = DateFormat.getDateTimeInstance().format(new Date());
        System.out.println("date"+format);
    }

}
