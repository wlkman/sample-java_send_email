import io.github.isliqian.NiceEmail;
import org.junit.Before;
import org.junit.Test;

import javax.mail.MessagingException;

public class sendEmail {
    @Before
    public void before(){
        // 配置，一次即可：邮箱与密码
        NiceEmail.config(NiceEmail.SMTP_QQ(), "51103942@qq.com", "jtmoybnwknrnbjha");
    }

    /**
     * 测试发送文字
     * @throws MessagingException
     */
    @Test
    public void testSendText() throws MessagingException {
        NiceEmail.subject("这是一封测试TEXT邮件")//主题
                .from("LqNice")//发件人昵称
                .to("cxinbin@cn.ibm.com")//收件人
                .text("信件内容")//内容
                .send();//发送
    }


}
