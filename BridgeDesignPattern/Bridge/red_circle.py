from BridgeDesignPattern.Bridge.draw_api import DrawApi


class RedCircle(DrawApi):
    def __init__(self):
        print("this is bridge imple.")

    def draw_circle(self, radius, x, y):
        area = 2 * 3.14 * radius
        print("drawing  red circle with center:", x, y, "and area:", area)
