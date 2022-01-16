from AdapterDesignPatterns.Models.ClientMediaPlayer import ClientMediaPlayer


class ClientMediaPlayerAdaptor(ClientMediaPlayer):

    def __init__(self, available_media_player):
        print(available_media_player)
        self.available_media_player = available_media_player

    def play_media(self):
        self.available_media_player.play()
