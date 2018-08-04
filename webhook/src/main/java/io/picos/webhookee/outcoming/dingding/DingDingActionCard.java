package io.picos.webhookee.outcoming.dingding;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther dz
 */
public class DingDingActionCard {

    private String title;

    private String text;

    private String hiderAvatar;

    private String btnOrientation;

    private String singleTitle;

    private String singleURL;

    private List<DingDingButton> btns = new ArrayList();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHiderAvatar() {
        return hiderAvatar;
    }

    public void setHiderAvatar(String hiderAvatar) {
        this.hiderAvatar = hiderAvatar;
    }

    public String getBtnOrientation() {
        return btnOrientation;
    }

    public void setBtnOrientation(String btnOrientation) {
        this.btnOrientation = btnOrientation;
    }

    public String getSingleTitle() {
        return singleTitle;
    }

    public void setSingleTitle(String singleTitle) {
        this.singleTitle = singleTitle;
    }

    public String getSingleURL() {
        return singleURL;
    }

    public void setSingleURL(String singleURL) {
        this.singleURL = singleURL;
    }


    public List<DingDingButton> getBtns() {
        return btns;
    }

    public void setBtns(List<DingDingButton> btns) {
        this.btns = btns;
    }

}
