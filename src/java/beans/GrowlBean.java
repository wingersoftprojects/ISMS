/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.UUID;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.primefaces.push.PushContext;
import org.primefaces.push.PushContextFactory;


/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class GrowlBean {

    private String channel;

    @ManagedProperty(value = "#{channelsBean}")
    private ChannelsBean channels;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public ChannelsBean getChannels() {
        return channels;
    }

    public void setChannels(ChannelsBean channels) {
        this.channels = channels;
    }

    public String getSendMessageUser() {
        return sendMessageUser;
    }

    public void setSendMessageUser(String sendMessageUser) {
        this.sendMessageUser = sendMessageUser;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    private String sendMessageUser;

    private String user;

    @PostConstruct
    public void doPostConstruction() {
        channel = "/" + UUID.randomUUID().toString();
        channels.addChannel(user, channel);
    }

    public void send() {
        PushContext pushContext = PushContextFactory.getDefault().getPushContext();

        pushContext.push(channels.getChannel(sendMessageUser), new FacesMessage("Hi ", user));
    }

    //Getter Setters
}
