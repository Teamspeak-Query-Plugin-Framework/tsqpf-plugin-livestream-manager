package net.vortexdata.tsqpf_livestream_manager.chat;

import com.github.theholywaffle.teamspeak3.api.event.*;
import net.vortexdata.tsqpf.listeners.*;

public class CommandLivestream implements ChatCommandInterface {

    @Override
    public void gotCalled(TextMessageEvent textMessageEvent) {

        String[] command = textMessageEvent.getMessage().split(" ");

        if (command.length > 1) {

            if (command[2].equalsIgnoreCase("link")) {

            } else if (command[2].equalsIgnoreCase("unlink")) {

            } else if (command[2].equalsIgnoreCase("start")) {

            } else if (command[2].equalsIgnoreCase("stop")) {

            }

        } else {

        }

    }

}
