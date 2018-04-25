//StillCold (Fiona Cai, Kevin Feng, Alexia Leong)
//APCS2 pd1
//QQKachoo Driver
/*
__---~~~~--__                      __--~~~~---__
`\---~~~~~~~~\\                    //~~~~~~~~---/'
 \/~~~~~~~~~\||                  ||/~~~~~~~~~\/
             `\\                //'
               `\\            //'
                 ||          ||
       ______--~~~~~~~~~~~~~~~~~~--______
  ___ // _-~                        ~-_ \\ ___
 `\__)\/~                              ~\/(__/'
  _--`-___                            ___-'--_
/~     `\ ~~~~~~~~------------~~~~~~~~ /'     ~\
/|        `\         ________         /'        |\
| `\   ______`\_      \------/      _/'______   /' |
|   `\_~-_____\ ~-________________-~ /_____-~_/'   |
`.     ~-__________________________________-~     .'
`.      [_______/------|~~|------\_______]      .'
`\--___((____)(________\/________)(____))___--/'
 |>>>>>>||                            ||<<<<<<|
*/

public class DequeDriver{
  public static void main(String[] args) {
    QQKachoo<String> iscream = new QQKachoo<String>();

    System.out.println("-----Adding to front------");
    iscream.addFirst("Chocolate");
    System.out.println(iscream.getFirst()); //Chocolate
    iscream.addFirst("Vanilla");
    System.out.println(iscream.getFirst()); //Vanilla
    iscream.addFirst("Strawberry");
    System.out.println(iscream.getFirst()); //Strawberry
    iscream.addFirst("Mint");
    System.out.println(iscream.getFirst()); //Mint

    System.out.println("");

    //System.out.println("------Current Deque------");
    //System.out.println(iscream); //Mint Strawberry Vanilla Chocolate

    System.out.println("");

    System.out.println("-----Adding to end------");
    iscream.addLast("Pistachio");
    System.out.println(iscream.getLast()); //Pistachio
    iscream.addLast("Coffee");
    System.out.println(iscream.getLast()); //Coffee
    iscream.addLast("S'mores");
    System.out.println(iscream.getLast()); //S'mores

    System.out.println("-----Removing from front-----");
    System.out.println(iscream.getFirst()); //Mint

    System.out.println("");

    System.out.println("-----Removing from end-----");
    System.out.println(iscream.getLast()); //S'mores
  }





}
