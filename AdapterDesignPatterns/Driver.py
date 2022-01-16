from AdapterDesignPatterns.Models.ClientMediaPlayer import ClientMediaPlayer
from AdapterDesignPatterns.Adaptors.ClientMediaPlayerAdaptor import ClientMediaPlayerAdaptor
from AdapterDesignPatterns.Models.availableMediaPlayer import  availableMediaPlayer

# In design, adapters are used when we have a class (Client)
# expecting some type of object and we have an object (Adaptee)
# offering the same features but exposing a different interface.


# here clinet is expecting CLientMediaType type of object,
# luckly we have availableMediaPlayer type object which provide same functionality,
# we would adaptor to solve this problem. This  can be nicely described in java.

if __name__ == "__main__":
    client_media_type = ClientMediaPlayer()
    client_media_type.play_media()

    available_media_player=availableMediaPlayer()
    adaptor = ClientMediaPlayerAdaptor(available_media_player)
    adaptor.play_media()
