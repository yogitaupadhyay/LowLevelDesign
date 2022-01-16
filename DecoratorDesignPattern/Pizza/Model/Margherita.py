from DecoratorDesignPattern.Pizza.Model.Pizza import Pizza


class Margherita(Pizza):

    def get_description(self):
        return "this is Margherita pizza description"

    def get_cost(self):
        return 220
