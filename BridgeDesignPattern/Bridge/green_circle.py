from BridgeDesignPattern.Bridge.draw_api import DrawApi


class GreenCircle(DrawApi):
    def __int__(self):
        print("this is bridge imple.")

    def draw_circle(self, radius, x, y):
        area = 2 * 3.14 * radius
        print("drawing  green circle with center:", x, y, "and area:", area)
