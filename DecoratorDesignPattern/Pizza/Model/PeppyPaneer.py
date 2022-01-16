from DecoratorDesignPattern.Pizza.Model.Pizza import Pizza


class PeppyPaneer(Pizza):

    def get_description(self):
        return "this is Peppy paneer pizza description"

    def get_cost(self):
        return 100
