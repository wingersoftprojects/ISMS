package beans;


import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class ChannelsBean {

    Map<String, String> channels = new HashMap<String, String>();

    public void addChannel(String user, String channel) {
        channels.put(user, channel);
    }

    public String getChannel(String user) {
        return channels.get(user);
    }

}