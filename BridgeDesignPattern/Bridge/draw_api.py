from abc import ABC, abstractmethod


class DrawApi(ABC):
    def __int__(self):
        print("this is bridge")

    @abstractmethod
    def draw_circle(self, radius, x, y):
        pass
