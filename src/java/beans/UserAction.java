/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author btwesigye
 */
@ManagedBean
@SessionScoped
public class UserAction implements Serializable {
    private String Username1;
    private String Category1;
    private String Object1;
    private String Action1;
    private int Day1;
    private int Month1;
    private int Year1;
    private long Records1;

    /**
     * @return the Username1
     */
    public String getUsername1() {
        return Username1;
    }

    /**
     * @param Username1 the Username1 to set
     */
    public void setUsername1(String Username1) {
        this.Username1 = Username1;
    }

    /**
     * @return the Category1
     */
    public String getCategory1() {
        return Category1;
    }

    /**
     * @param Category1 the Category1 to set
     */
    public void setCategory1(String Category1) {
        this.Category1 = Category1;
    }

    /**
     * @return the Object1
     */
    public String getObject1() {
        return Object1;
    }

    /**
     * @param Object1 the Object1 to set
     */
    public void setObject1(String Object1) {
        this.Object1 = Object1;
    }

    /**
     * @return the Action1
     */
    public String getAction1() {
        return Action1;
    }

    /**
     * @param Action1 the Action1 to set
     */
    public void setAction1(String Action1) {
        this.Action1 = Action1;
    }

    /**
     * @return the Day1
     */
    public int getDay1() {
        return Day1;
    }

    /**
     * @param Day1 the Day1 to set
     */
    public void setDay1(int Day1) {
        this.Day1 = Day1;
    }

    /**
     * @return the Month1
     */
    public int getMonth1() {
        return Month1;
    }

    /**
     * @param Month1 the Month1 to set
     */
    public void setMonth1(int Month1) {
        this.Month1 = Month1;
    }

    /**
     * @return the Year1
     */
    public int getYear1() {
        return Year1;
    }

    /**
     * @param Year1 the Year1 to set
     */
    public void setYear1(int Year1) {
        this.Year1 = Year1;
    }

    /**
     * @return the Records1
     */
    public long getRecords1() {
        return Records1;
    }

    /**
     * @param Records1 the Records1 to set
     */
    public void setRecords1(long Records1) {
        this.Records1 = Records1;
    }

}
