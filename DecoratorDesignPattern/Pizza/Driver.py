from DecoratorDesignPattern.Pizza.Model.Margherita import Margherita
from DecoratorDesignPattern.Pizza.Decorator.CheezeBurstDecorator import CheezeBurstDecorator
from DecoratorDesignPattern.Pizza.Decorator.capsicumDecorator import capsicumDecorator

if __name__ == "__main__":
    pizza_order = Margherita()
    print(" normal: ", pizza_order.get_cost())

    # load wth cheeze
    ordered_pizza_with_cheeze = CheezeBurstDecorator(pizza_order)
    print(" cheeze: ", ordered_pizza_with_cheeze.get_cost())

    # load wth capsicum
    ordered_pizza_with_cheeze_and_capsicum = capsicumDecorator(ordered_pizza_with_cheeze)
    print(" cheeze+capsicum: ", ordered_pizza_with_cheeze_and_capsicum.get_cost())
