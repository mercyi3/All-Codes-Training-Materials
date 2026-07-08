import turtle
my_pen = turtle.Turtle()
# for i in range(4):
#    my_pen.forward(50)
#    my_pen.right(90)
# turtle.done()
      
# for i in range(5):
#    my_pen.forward(50)
#    my_pen.right(144)
# turtle.done()
            
# colors = [ "red","purple","blue","green","orange","yellow"]
# my_pen = turtle.Pen()
# turtle.bgcolor("black")
# for x in range(360):
#    my_pen.pencolor(colors[x % 6])
#    my_pen.width(x/100 + 1)
#    my_pen.forward(x)
#    my_pen.left(59)
   
my_wn = turtle.Screen()
my_wn.bgcolor("light blue")
my_wn.title("Turtle")
my_pen = turtle.Turtle()
my_pen.color("black")
def my_sqrfunc(size):
   for i in range(4):
      my_pen.fd(size)
      my_pen.left(90)
      size = size - 5
my_sqrfunc(146)
my_sqrfunc(126)
my_sqrfunc(106)
my_sqrfunc(86)
my_sqrfunc(66)
my_sqrfunc(46)
my_sqrfunc(26)
