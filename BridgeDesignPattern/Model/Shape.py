from abc import ABC, abstractmethod


class Shape(ABC):
    def __int__(self, draw_api):
        self.draw_api = draw_api

    @abstractmethod
    def draw(self):
        pass
