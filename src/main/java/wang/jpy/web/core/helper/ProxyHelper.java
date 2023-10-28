package wang.jpy.web.core.helper;

import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;
import wang.jpy.web.core.util.HttpClient;

@Component
public class ProxyHelper {

    @SneakyThrows
    public String get(String url) {
        Element body = Jsoup.parse(new String(new HttpClient().get(url), "UTF-8")).body();
        return body.getElementById("content").ownText();
    }


}
