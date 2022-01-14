from abc import ABC, abstractmethod


class Pizza(ABC):
    def __init__(self, name="Cheese corn", des="pizza with topping of yellow corn and cheese"):
        self.name = name
        self.Description = des

    @abstractmethod
    def get_description(self):
        pass

    @abstractmethod
    def get_cost(self):
        pass
