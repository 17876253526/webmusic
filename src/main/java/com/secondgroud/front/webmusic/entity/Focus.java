package com.secondgroud.front.webmusic.entity;

import java.util.Date;

public class Focus {
    private Integer focusId;

    private Integer focusFromUser;

    private Integer focusToUser;

    private Date focusTime;

    public Integer getFocusId() {
        return focusId;
    }

    public void setFocusId(Integer focusId) {
        this.focusId = focusId;
    }

    public Integer getFocusFromUser() {
        return focusFromUser;
    }

    public void setFocusFromUser(Integer focusFromUser) {
        this.focusFromUser = focusFromUser;
    }

    public Integer getFocusToUser() {
        return focusToUser;
    }

    public void setFocusToUser(Integer focusToUser) {
        this.focusToUser = focusToUser;
    }

    public Date getFocusTime() {
        return focusTime;
    }

    public void setFocusTime(Date focusTime) {
        this.focusTime = focusTime;
    }
}