package wang.jpy.web.core.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import wang.jpy.web.core.conf.JpyConf;
import wang.jpy.web.core.util.RandomUtil;

import java.util.UUID;

@Component
public class JrebelHelper {

    @Autowired
    private JpyConf jpyConf;

    public String getLicenseUrl() {
        return jpyConf.getProtocol() + "://" + jpyConf.getJrebelLicenseUrl() + "/" + UUID.randomUUID().toString();
    }


    public String getMail() {
        return "%s@qq.com".formatted(RandomUtil.next(10000, 999999999));
    }
}
