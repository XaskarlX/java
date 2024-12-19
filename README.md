prosit 8 :
Création de la classe AnimInterface:
Ajout de trois interfaces :
Carnivore<T> : Pour les animaux qui mangent de la viande.
Herbivore<T> : Pour les animaux qui mangent des plantes.
Omnivore<T> : Combine Carnivore et Herbivore, pour les animaux qui mangent les deux.
Ajout d'un enum Food avec les valeurs : MEAT, PLANT, BOTH.

Mise à jour de la classe Aquatic :
Les animaux aquatiques implémentent l'interface Carnivore.
Ajout de la méthode eatMeat pour manger de la viande.

Mise à jour de la classe Terrestrial :
Les animaux terrestres implémentent l'interface Omnivore.
Ajout des méthodes : eatMeat, eatPlant, et eatPlantAndMeat.

Mise à jour de la classe principale (main)
