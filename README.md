# WarShips


----------


##Description
Java implementation of classic ship battle.   Applications uses TCP/IP protocol for communication with another user. 


----------


##Overview
Launching game opens menu where we can make game with our opponent. Because of non-server connection user need to define to play as server or client. 

![Chart Display](https://github.com/matewol540/WarShips/blob/master/WarShips/connectingToopenent.gif?raw=true)

After connecting, we need to set ships on battle field. In left pane is iterator how much ships user is able to set on field. Game highlights fields where ships are supposed to appear.

![Chart Display](https://github.com/matewol540/WarShips/blob/master/WarShips/settingShips.gif?raw=true)

 App provides security from putting one ship on another. User can undo last move or reset whole configuration. After this user can accept configuration and wait for opponent.
 
![Chart Display](https://github.com/matewol540/WarShips/blob/master/WarShips/shipSet.gif?raw=true)

When both users are ready, game will start. Game send via socket information about which field was shooten. Depends on result of shoot user is able to shoot again or wait for his next move.

![Chart Display](https://github.com/matewol540/WarShips/blob/master/WarShips/shooting.gif?raw=true)

Game ends with shooting all ships. Proper window appears with information about result of game. After accepting game will close window.

![Chart Display](https://github.com/matewol540/WarShips/blob/master/WarShips/win.gif?raw=true)
----------

##Authors
[Konrad Wasiak](https://github.com/KonradWasiak)
[Mateusz Wolski](https://github.com/matewol540)
