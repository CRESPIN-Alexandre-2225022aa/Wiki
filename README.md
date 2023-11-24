# Wiki

## Sommaire
> [Diagramme de class Singleton](#singleton)
> - [Singleton monothread](#singleton-monothread)
> - [Sigleton thread-safe](#sigleton-thread-safe)
> 
> [Diagramme de class Strategy](#strategy)

## Singleton
### Singleton monothread
Cette version possède un gros défault elle ne prend pas en compte le multithreading, elle n'est donc pas thread-safe
Dans le cas que l'on va dévelloper ici, nous sommes dans un jeux dans lequel les joueurs ont un inventaire. Cette inventaire est un Singleton car partout dans l'application il doit être accessible.
```mermaid
classDiagram
  class final Singleton{
    -Singlaton instance$
    -int nbItem (initialisé à 0 et mis à la taille de listItem à chaque add)
    -ArrayList<Item> listItem
    -Singleton(ArrayList<Item> listItem) (constructeur1 private voir site)
    -Singleton(Item item) (constructeur2 private voir site)
    +getInstance(ArrayList<Item> listItem)$ (reucperation de l'instance et permet de creer une instance si yen a pas)
    +getInstance(Item item)$ (reucperation de l'instance et permet de creer une instance si yen a pas)
    +addItem(Item item) (ajout un item dans la listItem)
  }
```

### Sigleton thread-safe
Pour régler le pb du multithreading on doit synchroniser les threads lors de la création du Singleton
La méthode qu'on va utilisé est le DCL (double(checked locking)
```mermaid
classDiagram
  class final Singleton{
    -volatile Singleton instance$
    -int nbItem (initialisé à 0 et mis à la taille de listItem à chaque add)
    -ArrayList<Item> listItem
    -Singleton(ArrayList<Item> listItem) (constructeur normal mais en private)
    -Singleton(Item item) (constructeur normal mais en private)
    +getInstance(ArrayList<Item> listItem)$ (voir site)
    +getInstance(Item item)$ (voir site)
    +addItem(Item item) (ajout un item dans la listItem)
  }
```

## Strategy
