package net.vortexdata.tsqpf_livestream_manager.utils;

import net.vortexdata.tsqpf.plugins.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;

import java.io.IOException;

public class WebCrawler {

    private PluginLogger logger;

    public WebCrawler(PluginLogger logger) {
        this.logger = logger;
    }

    public Element getPageElement(Platform pageElement, String url) {

        try {
            Document document = Jsoup.connect(url).get();

            if (pageElement == Platform.MIXER) {
                return document.select("#search_results").first();
            } else if (pageElement == Platform.TWITCH) {
                return document.select("div.channel-panels").first();
            }

        } catch (IOException e) {
            logger.printWarn("Failed to connect WebCrawler to webpage, dumping error message: " + e.getMessage());
        }

        return null;
    }

}