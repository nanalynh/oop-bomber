![menupanel](https://user-images.githubusercontent.com/114456930/209471711-21f36fe7-3da9-4780-a3a5-8045ee586cab.png)






<!-- TABLE OF CONTENTS -->
# Table of contents 🧁:
1. [Introduction](#Introduction)
2. [Game](#Game)
3. [UML-class-diagram-and-explain](#UML-class-diagram-and-explain)
7. [References](#References)
<!-- <details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#Introduction">Introduction</a>
      <ul>
        <li><a href="#Team-members">Team Members</a></li>
	<li><a href="#task-allocation">Task Allocation</a></li>      
      </ul>
    </li>
    <li><a href="#technologies">Technologies</a></li>
    <li><a href="#uml-class-diagram">UML Class Diagram</a></li>
     <ul>
        <li><a href="#Control">Control</a></li>
	<li><a href="#Control button">Control button</a></li>
	<li><a href="# Sound Controns"> Sound Controns</a></li>
	<li><a href="#Model">Model</a></li>   
      </ul>
    <li><a href="#references">References</a></li>
  </ol>
</details> -->

<!-- ABOUT THE PROJECT -->

## Introduction <a name="Introduction"></a> 🔮:

<div align="center">
<img src="screenshots/Intro.gif" alt="">
</div>

<div style="text-align:justify">
This is our game project for our final lab in our Object-Oriented Programming course in semester 1 (2021 - 2022).The project is built entirely using available java libraries with graphics using Java Swing.
</div>

### Team Members :

| Order |         Name          |     ID      |            Email                         |                       Github account                        |
| :---: | :-------------------: | :---------: | :--------------------------------------: | :---------------------------------------------------------: |
|   1   | Nguyen Thi Thanh Thao | ITITIU20310 |ITITIU20310@student.hcmiu.edu.vn          | [thanhthao](https://github.com/nanalynh)                    | 
|   2   | Trinh Thi Nhu Quynh   | ITITIU20291 |ititiu20291@student.hcmiu.edu.vn 	 | [nhu quynh](https://github.com/nhuquynh875) 		       |      
|   3   | Dang Thanh Mai Thi    | ITITSB20006 |ititsb20006@student.hcmiu.edu.vn          | [Mai Thi](https://github.com/LanThanh20)                    |
|   4   |  Mai Van Hung         | ITITIU20209 | ititiu20209@student.hcmiu.edu.vn         | [Hung](https://github.com/ITITIU20209n)                     |
|   5   | Nguyen Đoan Minh Khoa | ITITIU20231 | ititiu20231@student.hcmiu.edu.vn         | [Khoa](  https://github.com/khoanguyennnn )		       |



### Task Allocation 💁‍♀️_man:

| Order | Task                                                     |  Person   | 
| :---- | :------------------------------------------------------- | :-------: | 
| 1     | Control Button,veiw,Design character                     | nhu quynh |
| 2     | Control,veiw,Readme                                      | Thanh Thao|
| 3     | Entities, Model: Item class and MapItem class            | Mai Thi   |
| 4     |  PowerPoint,Model:Boom, BoomBang                         | Van Hung  |
| 5	|Player class, Boss class, Powerpoint	                   | Minh Khoa |

<!-- Game -->
<br />

## Game <a name="Game"></a>:joystick:
### Technologies :globe_with_meridians:

- Language: [JAVA](https://www.java.com/en/)
- Framework: [Eclipse]([https://www.jetbrains.com/idea/](https://www.eclipse.org/)), [Visual Studio Code](https://code.visualstudio.com)
- Library: [JavaFx](https://openjfx.io)


### How to play ? 
Players will direct the character's Anya movement in order to place bombs to killing the enemy. After the player has killed all of the monsters the game will be end.

</div>

### Game logic :bulb:

- Character: The character is controlled by the arrow key combination, only one bomb can be placed at a time.Moreover ,The character will gain speed change if the value is SpeedItem.

![player_down_4](https://user-images.githubusercontent.com/114456930/209472771-e97c292d-60c3-4b76-b9d9-fadbc0562a06.png)



<br />


- Bomb :When the bomb explodes, it will create a fire trail, if the character or the enemy hits the fire trail, they will all be destroyed. The length of the flame will increase if the character eats the special items

![boom1](https://user-images.githubusercontent.com/114456930/209472788-c8e9a1b5-04e2-46ad-aec8-461c5eb89be1.png)

<br />
- Enemy: 

![bossTank_down](https://user-images.githubusercontent.com/114456930/209472816-652e21f9-6804-4cf6-9199-336319cf13c2.png)
<br />


<br />
-Gift and doll house : it Can be broken by bombs and can contain items

![gifts](https://user-images.githubusercontent.com/114456930/209473062-8fe5ee36-e601-4a8f-90ec-76de572a67c2.png)
<br />	
![doll](https://user-images.githubusercontent.com/114456930/209473059-6f9e2b0a-1d77-4daa-b258-34393c975d26.png)
<br />

- Sofa, tree ,cloud and teddy bear it cannot be broken to limit the movement of characters and enemies

![cloud](https://user-images.githubusercontent.com/114456930/209473097-e2685e49-6db0-4484-91d0-177652a806ff.png)
![sofa](https://user-images.githubusercontent.com/114456930/209473098-4277154c-0fa6-441b-afd8-376a0bd27fb4.png)
![tree](https://user-images.githubusercontent.com/114456930/209473100-f9e1b40e-7509-45c1-b2c0-3eaa056c3129.png)
![bear](https://user-images.githubusercontent.com/114456930/209473095-016d9567-87b6-4780-a1eb-4df5f45f57fa.png)
<br />
-Special items:
<br />
+Shoe(SpeedItem):The character will gain high speed 
![item_shoe](https://user-images.githubusercontent.com/114456930/209473136-92815176-82df-43e6-bb42-4f4036cc6176.png)
<br />
Bomb item: change the power of bomb 
![item_bombsize](https://user-images.githubusercontent.com/114456930/209473134-0f79e5a1-2c28-4282-9393-44f516cfba4b.png)
![item_bomb](https://user-images.githubusercontent.com/114456930/209473133-fd0f055d-0cf5-4a47-839e-3049575d71df.png)
<br />
## Map Items 🗺️:
<br />
1. Cloud
<br />
2. dollhouse <br />
3. tree 
<br />
4. gifts <br />
5. snow <br />
6. bear <br />
7. bear <br />
8. sofa <br /> 
9. sofa <br />


<br />

## UML Class Diagram and explain <a name="UML-class-diagram and explain"></a>:
# Control 🦋:
 Class Diagram<br/>
<img width="358" alt="control" src="https://user-images.githubusercontent.com/114456930/209487416-04de8c1e-d791-45e2-90dd-4d1353525698.png">
<br />
Container class: use the CardLayout in Jpanel lib.CardLayout class manages the components in such a manner that only one component is visible at a time and it treats each component as a card .
<br />
GameManager class:
Method readMap() help the computer can read, understand the map and set the location for the items on the map  in-game

Al(t) helps the boss automatically move 
-We have to edit the checkMoveBoom() ,moveBoss() ,checkBoomToBoss() ,checkBoomToBoom(),checkDieToBoss() in the Boss, Player and BomBang class. Instead of taking input from the keyboard, you will get the object's direction from the _ai attribute via the AI() function.Here we use the isEmpty() method which checks whether a string is empty or not (all the boss die or not).This myPlayerBoom() method allows the player to place bombs at any allowed location.
<br/>
*With AI the simplest is to go random, orient classes to return random values. Specifying the return integer value corresponding to which direction is up to you to decide in function initBoss().
<br/>
*In inititIterm()we set the update power items randomly after the object can destruct base the map on the mapIterm()
<br/>
PanelGame class:
The run() in PanelGame is controlled ANYA BOMBER base on input( Up, Down,Left, Right) from the keyboard, checking the conditions for placing bombs, including: whether to receive a bomb signal from the player ( _input. space ), the time between two bombs, it also directs the win panel and the game over panel when player lose or win.The try-catch statements in run() method handles any exceptions that may occur.The "thread.sleep" is to wait 20 ms before calling move so that all the objects are completely created.

# Control buttons 🎛️:
<br/>
Class Diagram:
<br/>
<img width="399" alt="controlbutton" src="https://user-images.githubusercontent.com/114456930/209488333-b53e755d-585c-4c52-80da-a5f116c146c1.png">
<br/>
This class presents the menu game with three buttons(Start, Help, Exit) for players to begin the games.The initComponents()will set the size, the location and add  images of button on menu background.The initListener() is used when player click any button and it work depend on the package  java.awt.event.ActionListener
ActionListener in Java is a class that is responsible for handling all action events such as when the user clicks on a component.For buttons Start to come to panel game,Help to come to the PanelHelp , Exit to exit of the game .

# Sound Controns 🔊:
Class Diagram:
<br/>
<img width="382" alt="sound" src="https://user-images.githubusercontent.com/114456930/209489361-0b6f0f04-425e-415b-8a7b-7cd75360265d.png">

<br/>Sound class: is control by class sound which can add sounds to the game, including background sounds and the sounds of in-game events (bombs exploding, characters dying, winning, eating items, etc.). Note that the background sound and the event are independent of each other, ie playing the event sound does not affect the background sound.

## Model 😊:
# Player class:
Class Diagram:<br/>
<img width="382" alt="sound" src="https://user-images.githubusercontent.com/114456930/209489681-717a1a8c-063d-4b91-9004-94158a82ca3c.png">
<br/>
<br/>
Player( int x, int y, int orient, int timeMove): this is the constructor that is used to intialized objects such as x and y, and is called in GameManager.java for set the default position to the player character on the map. 
<br/>
getSoBoom() : the get method to return the value of the variable soBoom
setSoBoom(int soBoom) : this is the setter method called in moveItem() function to increase by one the number of booms the player has when it collects boom_item.
getSpeed(): getter method to return the value of speed of the player.
setSpeed(int speed): setter method called in moveItem() function to increase the player’s speed when collects shoe_item.
changeOrient(int newOrient): we have already set the attributes of LEFT, RIGHT, UP, DOWN from 0 to 3 respectively. This function is called in GameManager.movePlayer(int newOrient) which is called in GamePanel.run() to set the value of orient when the user press any key ( included LEFT, RIGHT, UP ,DOWN).
<br/>
For example: If the user pressed UP key, it will be listen in the run() method on GamePanel to set the value of UP which is 2 to the newOrient variables in gameManager.movePlayer() function, then it will change the orient in Player class to newOrient and set isPlayerRun boolean into true ( the default value of it is false).
<br/>
isIrun(): this is the getter method to return the isPlayerRun boolean which is set in the changeOrient(int newOrient) method.
draw(Graphics2D g2d): this is the draw function that is imported from java.awt.Graphics2D to draw the image of the character into the screen. the function is using switch statement to select one of many code block to be excuted. <br/>
getRect(): to return the size of the rectangle to set the solid of the Player.<br/>
checkMoveMap(ArrayList<MapItem> arrMapItem): this function is recalled the MapIten to ArrayList to check the Player’s solid intersect the MapItem.<br/>
setMoveBoom(ArrayList<Boom> arrBoom): this function is recalled Boom.java to ArrayList to set the Boom as the solid for the Boss cannot pass through.<br/>
checkMoveBoom(ArrayList<Boom> arrBoom): this function is recalled Boom.java to ArrayList to return true or false, if the Player intersect with the Boom it will be return false that the Player cannot pass through.<br/>
move(): the function to set the position of the Player, whenever user press any key (LEFT, RIGHT, UP, DOWN) it will set the x and y of the Player on the screen to make the character moving.<br/>
checkDieToBoss(ArrayList<Boss> arrBoss): this function is implemented Boss.java to ArrayList to check the collision of the Player with the Boss. If Player intersect with the Boss it will be return true and the game is over.<br/>
DatBoom(ArrayList<Boom> arrBoom): this function is implemented Boom.java to ArrayList to set the position of the Boom to be the same as the Player. <br/>
moveItem(ArrayList<Item> arrItem): this function is implemented Item.java to ArrayList, if the Player intersect with any Item, that Item will be remove by arrItem.remove(i); and Player will get extension ( such as increase speed, length boom, and number of boom).
	<br/>
	
# Boss class :bowtie:
<br/>
	
Boss(int x, int y, int orient): this is the constructor that is used to intialized objects such as x and y, and is called in GameManager.java for set the Boss position and display the Boss on the map.<br/>
getX() and setX(int x): the get method returns variable x value on the map, and the set method sets the value.
getY() and setY(int y): the get method returns variable y value on the map, and the set method sets the value.
changeOrient(): the setter function to set the orient of the boss.
createOrient(): using random function (bound: 100) to random the orient of boss, if the random larger than 95, then the orient will random from (0 to 3) and calling the changeOrient() method.<br/>
drawBoss(Graphics2D g2d): this is the draw function which imported from java.awt.Graphics2D to display the image of the Boss on the map. 
checkMoveBoom( ArrayList<Boom> arrBoom): this function is to implement Boom.java to ArrayList to returns true or false, if the Boss intersect with the Boom it will be return false that the Boss cannot pass through.<br/>
moveBoss(ArrayList<MapItem> arrMapItem, ArrayList<Boom> arrBoom, int t): the function to set the position of the boss by increase of speed ( = 2), with the orient is setted the boss move. Calling MapItem.java and Boom.java to check the collision of the boss with the map_item and boom, if checkMoveBoss and checkMoveBossBoom equals true and false respectively, the Boss will be moving.<br/>
checkMove(ArrayList<MapItem> arrMapItem): implement the MapItem.java into ArrayList to check the intersection of the boss with the map item. If it returns false, the boss cannot move.<br/>
getRect(): the getter function to return the size of rectangle into the Boss’s solid.<br/>

# Boom class 💣:
Class Diagram:
<br/>
<img width="382" alt="bom" src="https://user-images.githubusercontent.com/114456930/209491308-2c7f56f3-69a3-476a-ac89-2fe9ce42a9db.png">
<br/>
Boom(int x, int y,int boom, int lenghboom, int checkboom): this is the constructor that is used to intialized objects such as x and y setting the default position to the booms which are produced in a circle corresponding to the cubes and putted on the map.<br/>
getRect() : to return the size of the rectangle to set the solid of the Boom.
getX() and setX(int x): the get method returns variable x value on the map, and the set method sets the value.
getY() and setY(int y): the get method returns variable y value on the map, and the set method sets the value.
setCheckBoom(int) : set method sets the value.
isCheckBoom(): this function to check how long a boom explode does.<br/>
void draw : draw function that is created from java.awt.Graphics2D  to draw the image of the
boom on the screen.<br/>
# BoomBang class 🌼:
<br/>
BoomBang(int x, int y, int length, int xRaw, int yRaw):This is the constructor used for initialized objects like x and y that sets default position for boom with detonation length depends on boom power.
lengthWave(int): This function is used to determine the length of the boom depending on the player when eating the length-boom item, the more the player accumulates, the greater the length of the boom.<br/>
getRect(int): the getter function to return the size of rectangle into the Boom’s solid.<br/>
void checkBoomToBoom(): this function is called that If the player places a row of bombs near each other when one of them explodes early, the rest will explode at the same time with the initial detonation bomb when not enough time.
void checkBoomToBos(): this function is called If a boss touches the bomb, it will automatically explode without waiting for the explosion time.
void checkBoomToPlayer():this function is called If the player places a boom but does not get out of the range of the explosion, the player will lose (lose 1 heart).<br/>
(Void) drawMid , drawRight, drawLeft , drawdown , drawUp:This is the draw function imported from java.awt.Graphics2D to display the image of boom direction in 1 fixed range.<br/>
# MapItem class :basecamp:
Class Diagram:
<br/>
<img width="384" alt="map" src="https://user-images.githubusercontent.com/114456930/209491677-dbe9da1b-b101-46cb-b6d0-c874fb8d213a.png">
<br/>	
 MapItem(int x,int y,int bit): the constructor which initialized objets to set the defaut position of the items to create the map and it is called in GameManager.java.<br/>
draw(Graphics2D): draw function that is imported from java.awt.*
to draw the image of the character on the screen.The function using if statement to get one of the case  <br/>
# Item class 🥯:
<br/>
 Item(int x,int y,int bit):the constructor which initialized objets such as x,y for setting the random position of the items on the map and it is called in GameManager.java.
<br/>



	


## References<a name="References">  :eye::tongue::eye:
1. [phuctd99](https://github.com/phuctd99/bom)
2. [Oracial java](https://docs.oracle.com/javase/tutorial/uiswing/)
3. [MarioTran](https://www.youtube.com/watch?v=mx8D7rjwwfc)
4. [JavaFx Tutorial](https://openjfx.io/openjfx-docs/)
5. [A* Intelligent](https://www.simplilearn.com/tutorials/artificial-intelligence-tutorial/a-star-algorithm#:~:text=PythonExplore%20Course-,What%20is%20an%20A*%20Algorithm%3F,shortest%20path%20to%20be%20taken.)

<br />

<p align="right">(<a href="#top">Back to top</a>)</p>

