package mx.jonathancoder.imail.Models;

import mx.jonathancoder.imail.Utils.Util;

/**
 * Created by jonathan on 06/09/17.
 */

public class Mail {

    private String subject;
    private String message;
    private String fromEmail;
    private String fromName;
    private String cc;
    private String color;

    public Mail(String subject, String message, String fromEmail, String fromName, String cc) {
        this.setSubject(subject);
        this.setMessage(message);
        this.setFromEmail(fromEmail);
        this.setFromName(fromName);
        this.setCc(cc);
        this.color = Util.getRandomColor();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
