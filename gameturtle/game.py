# turtle graphics tutorials
import turtle
import math
import random
import os
import winsound

# set up screen
wn = turtle.Screen()
wn.setup(700, 700)
wn.bgcolor("lightblue")
wn.bgpic("space.gif")
# which skips frames
wn.tracer(3)

# draw border
mypen = turtle.Turtle()
mypen.penup()
mypen.setposition(-300, -300)
mypen.pendown()
mypen.pensize(3)
for side in range(4):
    mypen.forward(600)
    mypen.left(90)
mypen.hideturtle()

# create a player
player = turtle.Turtle()
player.color("blue")
player.shape("triangle")
player.penup()
player.speed(0)

# Create the score variable
score = 0

# create goals
maxgoals = 10
goals = []

for count in range(maxgoals):
    goals.append(turtle.Turtle())
    goals[count].color("red")
    goals[count].shape("circle")
    goals[count].penup()
    goals[count].speed(0)
    goals[count].setposition(random.randint(-290, 290), random.randint(-290, 290))

# set speed
speed = 1


# define functions

def turnleft():
    player.left(30)


def turnRight():
    player.right(30)


def speedUp():
    global speed
    speed += 1


def isCollision(t1, t2):
    d = math.sqrt(math.pow(t1.xcor() - t2.xcor(), 2) + math.pow(t1.ycor() - t2.ycor(), 2))
    if d < 20:
        return True
    else:
        return False


# set keyboard bindings
turtle.listen()
turtle.onkey(turnleft, "Left")
turtle.onkey(turnRight, "Right")
turtle.onkey(speedUp, "Up")

while True:
    player.forward(speed)

    # boundary conditions
    if player.xcor() > 290 or player.ycor() < -290:
        player.right(180)
        # os.system("start bounce.mp3&")
        # winsound("SystemExclamation","bounce.mp3&"

    # boundary conditions
    if player.ycor() > 290 or player.xcor() < -290:
        player.right(180)
        # os.system("start bounce.mp3&")

    for count in range(maxgoals):
        # move the goal
        goals[count].forward(2)

        # boundary conditions
        if goals[count].xcor() > 290 or goals[count].ycor() < -290:
            goals[count].right(180)
            # os.system("start bounce.mp3&")

        # boundary conditions
        if goals[count].ycor() > 290 or goals[count].xcor() < -290:
            goals[count].right(180)
            # os.system("start bounce.mp3&")

        # collision checking
        if isCollision(player, goals[count]):
            # goal.hideturtle()
            goals[count].setposition(random.randint(-290, 290), random.randint(-290, 290))
            goals[count].right(random.randint(0, 360))
            # os.system("start bounce.mp3&")
            score += 1
            # Draw the score on the screen
            mypen.undo()
            mypen.penup()
            mypen.hideturtle()
            mypen.setposition(-290, 310)
            scorestring = "score : %s" % score
            mypen.write(scorestring, False, align="left", font=("Arial", 14, "normal"))

delay = input("press enter")
