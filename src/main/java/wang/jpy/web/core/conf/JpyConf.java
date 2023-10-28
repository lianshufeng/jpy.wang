package wang.jpy.web.core.conf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "jpy")
@Component
public class JpyConf {

    private String protocol = "http";

    private String jrebelLicenseUrl="42.193.18.168:8088";

}
