# Livestream Manager
Control where live streaming is allowed and get streamers their own channels.

## 💡 How does it work?

Streamers can link their Mixer or Twitch account by using the command "!livestream link <MIXER- / TWITCH-URL>". This will return a code which they have to temporarely paste on their accounts description. After doing that, they need to run "!livestream verify <MIXER- / TWITCH-URL>". This should link their Teamspeak and Mixer / Twitch account.

Registered Streamers now have the ability to create a Stream-Channel, which can have a higher audio-codec. This can be done by using the command "!livestream start", which will assign the client to a "Streaming" server group which can let other Teamspeak users know that this Streaming is live, followed by "!livestream channel <PASSWORD (optional)>".

By using "!livestream stop", the "Streaming" group will be revoked again.

## 🚀 Gettings started

Just download the latest release that's compatible with your TSQPF version and copy it into its plugin directory. After you've done that, either reload or restart your framework instance in order to get it loaded and initiated.

## ⚙️ Configuration

Here's a list of all config keys, value datatypes and a description:

KEY | DATATYPE | DESCRIPTION

- **streamerGroup** : [Integer] Server group id of the Streamer group.
- **streamerLiveGroup** : [Integer] Server group id of the Live / Livestreaming group.
- **messageStreamerGroupAssigned** : [String] Tells the user that he/she is now a registered streamer.
- **messageStreamerGroupRevoked** : [String] Tells the user that he/she is no longer a registered streamer.
- **messageStreamerLiveGroupAssigned** : [String] Tells the user that he/she is now displayed as "Live".
- **messageStreamerLiveGroupRevoked** : [String] Tells the user that he/she is no longer displayed as "Live".
- **messageSyntax** : [String] Tells the user how to use the plugin.


## 📁 Directory Tree

LivestreamManager/<br>
└── plugin.conf<br>

## 📜 Vortexdata Certification

This plugin is developed by VortexdataNET for the Teamspeak Query Plugin Framework. Every release is being tested for any bugs, its performance or security issues. You are free to use, modify or redistribute the plugin.
