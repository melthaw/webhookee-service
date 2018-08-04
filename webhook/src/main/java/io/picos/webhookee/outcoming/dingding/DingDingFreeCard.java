package io.picos.webhookee.outcoming.dingding;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther dz
 */
public class DingDingFreeCard {

    private List<DingDingLink> links = new ArrayList();

    public List<DingDingLink> getLinks() {
        return links;
    }

    public void setLinks(List<DingDingLink> links) {
        this.links = links;
    }
}
