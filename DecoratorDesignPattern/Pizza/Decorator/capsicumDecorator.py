from DecoratorDesignPattern.Pizza.Model.Pizza import Pizza


class capsicumDecorator(Pizza):
    def __init__(self, deco_pizza):
        self.deco_pizza = deco_pizza

    def get_description(self):
        return "Pizza is being decorated with capsicum"

    def get_cost(self):
        return self.deco_pizza.get_cost() + 35
