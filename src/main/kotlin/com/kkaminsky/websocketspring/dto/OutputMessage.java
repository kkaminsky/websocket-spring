package com.kkaminsky.websocketspring.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "recommendation")
@XmlAccessorType(XmlAccessType.FIELD)
public class OutputMessage {

    @XmlElement(name = "rec1")
    private String rec1;

    @XmlElement(name = "rec2")
    private String rec2;


    @XmlElement(name = "rec3")
    private String rec3;


    public String getRec1() {
        return rec1;
    }

    public String getRec2() {
        return rec2;
    }

    public String getRec3() {
        return rec3;
    }

    public void setRec1(String rec1) {
        this.rec1 = rec1;
    }

    public void setRec2(String rec2) {
        this.rec2 = rec2;
    }

    public void setRec3(String rec3) {
        this.rec3 = rec3;
    }
}
