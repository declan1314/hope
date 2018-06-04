package test;

import com.declan.entity.User;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Administrator on 2018/6/3/003.
 */
public class Test {

    public static void main(String[] args) {
        FileSystemXmlApplicationContext ac = new FileSystemXmlApplicationContext("D:\\workspace\\hope\\src\\main\\resources\\spring\\applicationContext.xml");
        User user = (User) ac.getBean("user");
        System.out.println(user.getUsername());
    }
}
