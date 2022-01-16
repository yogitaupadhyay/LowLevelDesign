from BridgeDesignPattern.Bridge.green_circle import GreenCircle
from BridgeDesignPattern.Bridge.red_circle import RedCircle
from BridgeDesignPattern.Model.Circle import Circle

# Bridge is used when we need to decouple an abstraction from its implementation so that the two can
# vary independently. This type of design pattern comes under structural pattern as this pattern
# decouples implementation class and abstract class by providing a bridge structure between them.


# here we have one abstract class(shape-abstraction) and its implementation(circle-refined abstraction) and using
# same method in shape we are drawing two circle. drawApi(implementor) greenCircle(concrete implementor)
if __name__ == "__main__":
    green_circle = Circle(GreenCircle(), 2, 2, 3)
    red_circle = Circle(RedCircle(), 4, 6, 2)

    red_circle.draw()
    green_circle.draw()
