/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class ShortCuts {

    private int x = 0;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        x++;
        this.message = message;
    }

    public void setmessage() {
        x++;
        message = "X=" + x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
