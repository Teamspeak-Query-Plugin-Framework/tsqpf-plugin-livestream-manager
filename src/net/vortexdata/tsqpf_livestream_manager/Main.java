package net.vortexdata.tsqpf_livestream_manager;

import com.github.theholywaffle.teamspeak3.api.event.ClientJoinEvent;
import net.vortexdata.tsqpf.plugins.TeamspeakPlugin;

public class Main extends TeamspeakPlugin {

    @Override
    public void onEnable() {

        getConfig().setDefault("streamerGroup", "-1");
        getConfig().setDefault("streamerLiveGroup", "-1");
        getConfig().setDefault("messageStreamerVerificationPin", "Registered a temporary link with the entered URL. Please copy this code and paste it on your profile. Then use '!livestream verify <URL>'");
        getConfig().setDefault("messageStreamerVerificationPinAlreadyCreated", "You have already created a code for this account. If you have lost the previous code, please wait at least 10 minutes until it get automatically invalidated.");
        getConfig().setDefault("messageStreamerVerificationFailed", "Verification failed. Please check your pin for any typos and try again.");
        getConfig().setDefault("messageStreamerVerificationNoLink", "There is no temporary link assigned to the URL you entered. Please first create one by using '!livestream link <PROFILE-URL>'.");
        getConfig().setDefault("messageStreamerVerified", "Congratulations, you are now a registered Streamer.");
        getConfig().setDefault("messageStreamerGroupAssigned", "You are now registered as a streamer.");
        getConfig().setDefault("messageStreamerGroupAlreadyAssigned", "You are already registered as a streamer.");
        getConfig().setDefault("messageStreamerGroupRevoked", "You are no longer registered as a streamer.");
        getConfig().setDefault("messageStreamerGroupAlreadyRevoked", "You are not a registered streamer.");
        getConfig().setDefault("messageStreamerLiveGroupAssigned", "Your streaming status has been updated to 'Live'.");
        getConfig().setDefault("messageStreamerLiveGroupAlreadyLive", "You are already live.");
        getConfig().setDefault("messageStreamerLiveGroupRevoked", "Your streaming status has been updated to 'Offline'.");
        getConfig().setDefault("messageStreamerLiveGroupAlreadyRevoked", "You are already offline.");
        getConfig().setDefault("messageStreamerChannelCreated", "Your streaming channel has been created.");
        getConfig().setDefault("messageStreamerChannelAlreadyCreated", "You already have a streaming channel.");
        getConfig().setDefault("messageStreamerChannelMissingLink", "You can not create a streaming channel without a linked Twitch or Mixer account. Use !livestream for more information.");
        getConfig().setDefault("messageSyntax", "!livestream <link | unlink | start | stop>");
        getConfig().saveAll();


    }

    @Override
    public void onDisable() {

    }

}
