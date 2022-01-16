from BridgeDesignPattern.Model.Shape import Shape


class Circle(Shape):
    def __init__(self, draw_api, radius, x, y):
        print("this is shape api")
        super().__int__(draw_api)
        self.radius = radius
        self.x = x
        self.y = y

    def draw(self):
        self.draw_api.draw_circle(self.radius, self.x, self.y)
