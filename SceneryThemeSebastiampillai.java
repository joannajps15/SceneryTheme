/*SceneryThemeSebastiampillai
Programmed by Joanna Sebastiampillai, January 13, 2020
Winter Wonderland themed scene*/

import hsa.Console;
import java.awt.*;
public class SceneryThemeSebastiampillai
{
    static Console c;
    static Console d;

    public static void main (String[] args)
    {

	c = new Console (35, 170);
	d = new Console (15, 80);

	//to draw scenery
	background (); //to draw background
	ChristmasTree ();
	ChristmasHouse ();
	snowman ();

	//to get user input from instructions method and toExit method

	while (true)
	{
	    char input; //to store input
	    input = instructions ();

	    if (input == 'a')
	    {
		chimneyGas (); //to animate the chimney gas
	    }
	    else if (input == 'b')
	    {
		toboggan (); //to animate the toboggan
	    }
	    else if (input == 'c')
	    {
		fallingSnow (); //to animate the snow falling
	    }
	    else if (input == 'd')
	    {
		lights (); //to animate the house lights
	    }
	    else if (input == 'e')
	    {
		break; //to exit while loop
	    }
	}

	c.clear (); //to clear screen

	//to draw night scenery
	backgroundTwo (); //to draw second night background
	ChristmasTree (); //to draw trees/
	ChristmasHouse (); // to draw the house
	snowman (); //to draw the snowman
	chimneyGas ();
	toboggan ();
	fallingSnow ();
	lights ();
	endOfProgram (); //to display moon and screen

    } //end of main method


    //to get user input and return input to main method
    public static char instructions ()
    {
	char userInput; //to store user input

	//to animate background colour
	Color background = new Color (179, 218, 241);
	d.setColor (background);
	int x = 0;
	while (x < d.maxx ())
	{
	    d.fillRect (0, 0, x, d.maxy ());
	    x += 30;
	    delay (45);
	} //end of while loop

	//to display instructions for animating the scene
	Color font = new Color (66, 104, 124); //to create new colour for font
	d.setColor (font); //to set font colour
	Font title = new Font ("Elephant", Font.PLAIN, 40); //to create new font
	d.setFont (title); //to set font
	d.drawString ("WINTER WONDERLAND", 25, 50);

	Font instructions = new Font ("Century", Font.ITALIC + Font.BOLD, 20);
	d.setFont (instructions); //to set new font
	d.drawString ("Instructions", 275, 75);

	Font instructionsTwo = new Font ("High Tower Text", Font.PLAIN, 20);
	d.setFont (instructionsTwo); //to set new font
	d.drawString ("Enter 'a' to animate the CHIMNEY FOG", 10, 130);
	d.drawString ("Enter 'b' to animate the TOBOGGAN", 10, 155);
	d.drawString ("Enter 'c' to animate the SNOW", 10, 180);
	d.drawString ("     *Note SNOW IS FUN, so it DOES NOT disappear", 10, 205);
	d.drawString ("Enter 'd' to animate the HOUSE LIGHTS", 10, 230);
	d.drawString ("Enter 'e' to EXIT PROGRAM", 10, 255);

	userInput = d.getChar (); //to get user input
	return userInput; //to return the user input to main method
    }


    //to draw the background of the scene
    public static void background ()
    {
	//to draw the sky
	Color sky = new Color (154, 211, 222); //to create new colour
	c.setColor (sky); //to set sky colour
	c.fillRect (0, 0, c.maxx (), c.maxy ());

	//to draw snow on ground
	c.setColor (Color.white); //to set white colour
	c.fillRect (0, 425, c.maxx (), c.maxy () - 400);

	//to draw clouds in sky
	Color cloud = new Color (246, 246, 246); //to create new colour
	c.setColor (cloud); //to set cloud colour
	c.fillOval (40, 50, 40, 45);
	c.fillOval (70, 50, 40, 45);
	c.fillOval (50, 70, 40, 40);
	c.fillOval (70, 70, 40, 40);

	c.fillOval (50, 150, 92, 40);
	c.fillOval (90, 180, 49, 40);
	c.fillOval (60, 212, 78, 25);
	c.fillOval (40, 175, 75, 75);

	c.fillOval (200, 60, 75, 60);
	c.fillOval (240, 50, 80, 70);
	c.fillOval (250, 70, 65, 70);
	c.fillOval (220, 60, 50, 45);

	c.fillOval (400, 100, 90, 100);
	c.fillOval (484, 94, 103, 143);
	c.fillOval (425, 68, 85, 130);

	//to draw the sun
	c.setColor (Color.yellow); //to set yellow colour
	c.fillOval (100, 100, 100, 100);

    } //end of background method


    public static void backgroundTwo ()
    {
	//to draw sky
	Color night = new Color (0, 0, 50); //to create colour for night sky
	c.setColor (night); //to create colour night sky
	c.fillRect (0, 0, c.maxx (), c.maxy ());

	//to draw snow on ground
	c.setColor (Color.white); //to set colour white colour
	c.fillRect (0, 425, c.maxx (), c.maxy () - 400);

	//to draw clouds in sky
	c.setColor (Color.gray); //to set grey colour
	c.fillOval (40, 50, 40, 45);
	c.fillOval (70, 50, 40, 45);
	c.fillOval (50, 70, 40, 40);
	c.fillOval (70, 70, 40, 40);

	c.fillOval (50, 150, 92, 40);
	c.fillOval (90, 180, 49, 40);
	c.fillOval (60, 212, 78, 25);
	c.fillOval (40, 175, 75, 75);

	c.fillOval (200, 60, 75, 60);
	c.fillOval (240, 50, 80, 70);
	c.fillOval (250, 70, 65, 70);
	c.fillOval (220, 60, 50, 45);

	c.fillOval (400, 100, 90, 100);
	c.fillOval (484, 94, 103, 143);
	c.fillOval (425, 68, 85, 130);
    } //end of backgroundTwo method


    //to draw the evergreen trees and the Christmas tree
    public static void ChristmasTree ()
    {
	//to draw first evergreen tree
	c.setColor (Color.green); //to set green colour
	int[] x = {100, 150, 125, 175, 125, 200, 0, 75, 25, 75, 50}; //x-coordinates for tree
	int[] y = {300, 375, 375, 450, 450, 530, 530, 450, 450, 375, 375}; //y-coordinates for tree
	c.fillPolygon (x, y, 11);

	//to draw second evergreen tree
	Color darkGreen = new Color (86, 125, 48); //to create colour for tree
	c.setColor (darkGreen); //to set darkGreen colour
	int[] thex = {300, 350, 325, 375, 340, 420, 180, 260, 225, 275, 250}; //x-coordinates for other tree
	int[] they = {200, 275, 275, 390, 390, 550, 550, 390, 390, 275, 275}; //y-coordinates for other tree
	c.fillPolygon (thex, they, 11);

	//to draw all tree trunks
	Color trunk = new Color (126, 72, 51); //to create colour for all tree trunks
	c.setColor (trunk); //to set trunk colour
	c.fillRect (75, 530, 50, 75);
	c.fillRect (275, 550, 50, 75);
	c.fillRect (175, 640, 50, 50);

	//TO DRAW CHRISTMAS TREE

	//to draw star
	c.setColor (Color.yellow); //to set yellow clear
	c.fillStar (175, 230, 50, 50);

	//to draw Christmas tree leaves
	Color evergreen = new Color (55, 88, 41); //to create another colour for tree
	c.setColor (evergreen); //to set evergreen colour
	int[] ax = {200, 250, 225, 300, 275, 350, 50, 125, 100, 175, 150}; //x-coordinates for Christmas tree
	int[] ay = {275, 375, 375, 500, 500, 640, 640, 500, 500, 375, 375}; //y-coordinates for Christmas tree
	c.fillPolygon (ax, ay, 11);

	//to draw ribbons on Christmas tree
	c.setColor (Color.yellow); //to set yellow colour
	int j = 265, k = 330, l = 395, m = 460, n = 525;
	for (int a = 0 ; a < 10 ; a++) //for loop to add thickness to line
	{

	    c.drawArc (45, j, 200, 100, -29, -55);
	    c.drawArc (50, k, 200, 100, -26, -70);
	    c.drawArc (60, l, 200, 100, 10, -133);
	    c.drawArc (75, m, 200, 100, 10, -150);
	    c.drawArc (85, n, 220, 100, 10, -180);
	    j++;
	    k++;
	    l++;
	    m++;
	    n++;
	} //end of for loop


	//to draw ornaments on Christmas tree
	int r, g, b;

	for (int o = 0 ; o < 11 ; o++)
	{
	    r = (int) (256 * Math.random ());
	    g = (int) (256 * Math.random ());
	    b = (int) (256 * Math.random ());
	    Color ornaments = new Color (r, g, b); //to create beautiful, random colours for ornaments
	    c.setColor (ornaments); //to set ornaments colour

	    c.fillOval (ax [o] - 10, ay [o], 20, 20);
	    c.setColor (Color.black); //to set black colour
	    c.drawOval (ax [o] - 10, ay [o], 20, 20);
	} //end of for loop

    } //end of ChristmasTree method


    //to draw house
    public static void ChristmasHouse ()
    {

	//to draw the walls of the house
	Color wall = new Color (165, 42, 42); //to create colour for walls
	c.setColor (wall); //to set wall colour
	int[] thex = {550, 850, 850, 550};
	int[] they = {400, 400, 650, 650};
	c.fillPolygon (thex, they, 4);

	//to draw windows
	Color window = new Color (255, 235, 227); //to create colour for windows
	c.setColor (window); //to set window colour

	c.fillRect (580, 430, 35, 75);
	c.fillRect (615, 430, 35, 75);

	c.fillRect (750, 430, 35, 75);
	c.fillRect (785, 430, 35, 75);

	//window frames
	Color windowFrame = new Color (160, 82, 45); //to create colour for the window frames
	c.setColor (windowFrame); //to set window frame colour

	c.drawRect (580, 430, 35, 75);
	c.drawRect (615, 430, 35, 75);

	c.drawRect (750, 430, 35, 75);
	c.drawRect (785, 430, 35, 75);

	//to draw door
	Color roof = new Color (128, 0, 0); //to create colour for the roof and door
	c.setColor (roof); //to set roof colour
	c.fillArc (655, 525, 85, 80, 0, 180);
	c.fillRect (655, 565, 85, 85);
	c.setColor (windowFrame); //to set window frame colour
	c.drawArc (655, 525, 85, 80, 0, 180);
	c.drawRect (655, 565, 85, 85);

	//to draw icicles
	Color icicle = new Color (219, 223, 224); //to create colour for icicle
	c.setColor (icicle); //to set colour for icicle
	int j = 515, k, l = 0, m;
	while (l < 875) //while loop to draw icicles
	{
	    l = (int) (j + 21 * Math.random () + 5); //btw 5 and 30 + j
	    k = (j + l) / 2;
	    m = (int) (76 * Math.random () + 400); //btw

	    int[] trianglex = {j, k, l};
	    int[] triangley = {390, m, 390};
	    c.fillPolygon (trianglex, triangley, 3);
	    j = l;
	} //end of while loop

	//to draw chimney
	c.setColor (roof); //set colour for roof
	c.fillRect (800, 240, 35, 90);

	//snow on rooftop
	Color snow = new Color (255, 250, 250); //to create new snow colour
	c.setColor (snow); //to set snow colour
	int[] xcoordinate = {475, 700, 925};
	int[] ycoordinate = {400, 150, 400};
	c.fillPolygon (xcoordinate, ycoordinate, 3);
	c.setColor (icicle); //to set colour for border
	c.drawPolygon (xcoordinate, ycoordinate, 3); //to draw border for snow
	//to draw the roof, roof window, and roof window's frame

	//to draw roof
	c.setColor (roof); //set colour for roof
	int[] x = {500, 700, 900};
	int[] y = {400, 175, 400};
	c.fillPolygon (x, y, 3);

	//to draw roof circular designs
	int ax = 500;
	for (int i = 0 ; i < 20 ; i++) //loop to draw design on roof wtih circles
	{
	    c.fillOval (ax, 390, 20, 20);
	    ax += 20;
	} //end of for loop

	//to draw window roof
	c.setColor (window); //set colour for window
	c.fillArc (660, 255, 75, 80, 0, 180);
	c.fillRect (660, 295, 75, 75);

	//to draw frame for window roof
	c.setColor (windowFrame); //set colour for window rame
	c.drawArc (660, 255, 75, 80, 0, 180);
	c.drawRect (660, 295, 75, 75);

    } //end of ChristmasHouse method


    //to draw a snowman
    public static void snowman ()
    {
	//snowman body
	Color snowman = new Color (255, 250, 250); //to create new colour for snowman
	c.setColor (snowman); //to set snowman colour
	c.fillOval (950, 275, 50, 50);
	c.fillOval (938, 320, 75, 75);
	c.fillOval (925, 390, 100, 100);
	Color iceberg = new Color (219, 223, 224); //to create new colour for snowman outline, to distinguish between the snowman and the snow on the ground
	c.setColor (iceberg); //to set the iceberg colour
	c.drawOval (950, 275, 50, 50);
	c.drawOval (938, 320, 75, 75);
	c.drawOval (925, 390, 100, 100);

	c.setColor (Color.black); //to set black colour

	//hat
	c.fillRect (948, 270, 55, 5);
	c.fillRect (958, 233, 35, 40);

	//eyes
	c.fillOval (960, 288, 10, 10);
	c.fillOval (980, 288, 10, 10);

	//smile
	c.drawArc (955, 300, 30, 15, 0, -110);

	//buttons
	int y = 335;
	for (int i = 0 ; i < 3 ; i++) //to draw buttons in a line
	{
	    c.fillOval (970, y, 10, 10);
	    y += 20;
	} //end of for statement

	//nose
	c.setColor (Color.orange); //to set orange colour
	int[] thex = {975, 975, 945}; //x-coordinates
	int[] they = {295, 305, 310}; //y-coordinates
	c.fillPolygon (thex, they, 3);
    }


    //to animate gas coming out of the chimney of the house
    public static void chimneyGas ()
    {
	//to create various shades of grey
	Color sky = new Color (129, 182, 221);
	Color lightgrey = new Color (211, 211, 211);
	Color silver = new Color (192, 192, 192);
	Color darkgrey = new Color (169, 169, 169);
	Color grey = new Color (128, 128, 128);

	//to animate
	int x1 = 795, x2 = 805, x3 = 810, x4 = 815, y1 = 180, y2 = 135, y3 = 100; //to reset variables with correct starting coordinates for animation

	for (int j = 0 ; j < 4 ; j++) //to repeat the animation a few times before ending
	{
	    for (int i = 0 ; i < 10 ; i++) //
	    {
		if (i <= 4)
		{
		    //to draw gas
		    c.setColor (silver); //set silver colour
		    c.drawArc (x1, y1 + i, 40, 50, 90, 180);
		    c.drawArc (x1, y2 + i, 30, 45, -90, 180);
		    delay (50);

		    c.setColor (lightgrey); //set lightgrey colour
		    c.drawArc (x2 + i, y1, 30, 50, 90, 180);
		    c.drawArc (x2 + i, y2, 30, 45, -90, 180);
		    c.drawArc (x3 + i, y3, 20, 35, 90, 180);
		    delay (50);

		    c.setColor (grey); //set grey colour
		    c.drawArc (x4 + i, y1, 30, 50, 90, 180);
		    c.drawArc (x4 + i, y2, 30, 45, -90, 180);
		    delay (50);
		} //end of if statement
		else if (i >= 5)
		{
		    //to erase gas
		    c.setColor (sky); //to set sky colour

		    c.drawArc (x1, y1 - 5 + i, 40, 50, 90, 180);
		    c.drawArc (x1, y2 - 5 + i, 30, 45, -90, 180);
		    delay (50);

		    c.drawArc (x2 - 5 + i, y1, 30, 50, 90, 180);
		    c.drawArc (x2 - 5 + i, y2, 30, 45, -90, 180);
		    c.drawArc (x3 - 5 + i, y3, 20, 35, 90, 180);
		    delay (50);

		    c.drawArc (x4 - 5 + i, y1, 30, 50, 90, 180);
		    c.drawArc (x4 - 5 + i, y2, 30, 45, -90, 180);
		    delay (50);
		} //end of else if statement
	    } //end of inner for loop

	    //to return to original coordinates depending on number of times repeated
	    if (j % 2 == 0)
	    {
		y1 -= 20;
		y2 -= 20;
		y3 -= 20;
	    } //end of if statement
	    else
	    {
		y1 += 20;
		y2 += 20;
		y3 += 20;
	    } //end of else statement
	}
    } //end of chimneyGas method


    //to animate snowflakes on various areas of screen to mimic snow falling
    public static void fallingSnow ()
    {
	for (int i = 0 ; i < 200 ; i++)
	{
	    int x, y, diameter;
	    c.setColor (Color.white);
	    x = (int) (c.maxx () * Math.random ());
	    y = (int) (400 * Math.random ());
	    diameter = (int) (10 * Math.random () + 3);
	    c.fillArc (x, y, diameter, diameter, 0, 360);
	    delay (30);
	} //end of for loop
    } //end of fallingSnow method


    //to animate tobaggan
    public static void toboggan ()
    {

	int xOne = 900, xTwo = 910, xThree = 970, xFour = 895, xFive = 990, xSix = 985, xSpeed = 5; //to reset variables with correct starting coordinates for animation

	Color brown = new Color (101, 67, 33); //to create brown colour

	for (int i = 0 ; i < 100 ; i++)
	{
	    c.setColor (brown); //to set brown colour
	    c.fillRect (xOne, 550, 90, 20);

	    c.setColor (Color.gray); //to set grey colour
	    c.fillRect (xTwo, 570, 10, 20);
	    c.fillRect (xThree, 570, 10, 20);
	    c.fillRect (xFour, 590, 110, 10);
	    c.fillOval (xFive, 570, 30, 30);

	    c.setColor (Color.white); //to set white colour
	    c.fillOval (xSix, 570, 22, 22);

	    delay (50);

	    //to 'erase' tobaggan from initial location
	    c.fillRect (xOne, 550, 90, 20);
	    c.fillRect (xTwo, 570, 10, 20);
	    c.fillRect (xThree, 570, 10, 20);
	    c.fillRect (xFour, 590, 110, 10);
	    c.fillOval (xFive, 570, 30, 30);

	    //to move tobaggan forward or backward, depending on location
	    xOne += xSpeed;
	    xTwo += xSpeed;
	    xThree += xSpeed;
	    xFour += xSpeed;
	    xFive += xSpeed;
	    xSix += xSpeed;

	    if (xOne > 1200 || xOne < 900)
	    {
		xSpeed = -xSpeed; //to change direction
	    } //end of if statement
	} //end of for statement

	c.setColor (brown); //to set brown colour
	c.fillRect (900, 550, 90, 20);

	c.setColor (Color.gray); //to set grey colour
	c.fillRect (910, 570, 10, 20);
	c.fillRect (970, 570, 10, 20);
	c.fillRect (895, 590, 110, 10);
	c.fillOval (990, 570, 30, 30);

	c.setColor (Color.white); //to set white colour
	c.fillOval (985, 570, 22, 22);

    } //end of toboggan method


    //to animate lights on house
    public static void lights ()
    {

	int r, g, b, x, y, xSpeed, ySpeed;

	for (int i = 0 ; i < 30 ; i++) //for loop to animate lights changing colour multiple times
	{
	    xSpeed = 18;
	    ySpeed = 20;
	    x = 493;
	    y = 380;
	    r = (int) (256 * Math.random ());
	    g = (int) (256 * Math.random ());
	    b = (int) (256 * Math.random ());
	    Color lights = new Color (r, g, b); //create beautiful random colour
	    c.setColor (lights); //to set beautiful random colour
	    //to draw lights
	    for (int j = 0 ; j < 23 ; j++)
	    {
		c.fillOval (x, y, 20, 20);

		x += xSpeed;
		y -= ySpeed;

		if (y < 175)
		{
		    ySpeed = -ySpeed;
		} //end of if statement
		else if (y > 410)
		{
		    ySpeed = -ySpeed;
		} //end of else if statement
	    } //end of inner for statement

	    delay (50);

	} //end of outer for statement

    }


    //endOfProgram method
    public static void endOfProgram ()
    {
	Color night = new Color (0, 0, 60); //to create colour for night sky
	Color moon = new Color (241, 241, 201); //to create colour for moon
	int x = 150, y = 180;
	for (int i = 0 ; i < 5 ; i++)
	{
	    c.setColor (moon);
	    c.fillOval (x, y, 50, 48); //to draw moon
	    delay (40);
	    c.setColor (night);
	    c.fillOval (x, y, 50, 48); //to erase moon
	    delay (40);
	    y -= 20; //to change y-coordinate of moon to animate moon
	}

	c.setColor (moon); //to set moon colour
	c.fillOval (x, y, 100, 100); //to display moon permanently
	Font title = new Font ("Elephant", Font.PLAIN, 30); //to create font
	c.setFont (title); //to set font
	c.drawString ("END OF WINTER WONDERLAND PROGRAM", 550, 50); //to display text

    } //end of endOfProgram method


    //delay method, to help with animation
    public static void delay (int time)
    {
	try
	{
	    Thread.sleep (time);
	}


	catch (InterruptedException e)
	{
	}
    } //end of delay method
} //end of class


