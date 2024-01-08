# Projet RobotScript

_Ce projet a été réalisé en binôme par Yanis Bouger et Benjamin De Zordo._

La réalisation de l'interpréteur ayant demandé plus d'efforts que celle du compilateur, et le code produit par ce dernier n'ayant été directement testé sur un robot (bien que validé par Arduino IDE), nous souhaitons être d'avantage noté sur l'interpréteur.

Le projet est accessible sur [Azure](https://robotscriptlang.azurewebsites.net).

## Métamodèle

Parce que ça nous a semblé être le plus naturel, nous avons décidé de modéliser un langage suivant le paradigme de programmation impérative.

C'est pourquoi nous retrouvons dans notre métamodèle les concepts suivants :
 - La définition/L'appel de fonction
 - Des instructions
 - La déclaration/l'assignation de valeur à des variables
 - Des structures de contrôle (embranchements et boucles)
 - Des opérations sur les données

Les concepts propres à notre DSL rentrent aussi dans les catégories citées précedement :
 - Le mouvement du robot est représenté par des instructions
 - La vitesse et les différents capteurs sont représentés par des états
 - Les unités sont représentées par des opération de conversion

Nous avons aussi un concept de type (très restreint mais suffisant pour notre DSL), les types disponibles sont 'void', 'booléen' et 'nombre'.
Seul le type 'void' n'est pas considéré comme un type de «donnée» et sert uniquement à représenter une fonction sans valeur de retour.
De plus les types 'booléen' et 'nombre' sont compatibles et il est possible de mélanger les expression arithmétiques et booléennes.

## Grammaire

Nous avons décidé de faire une grammaire ressemlant le plus possible à celle du C pour limitter les potentielles difficultées au moment de réaliser le compilateur.

Nous avions à un moment défini notre grammaire avec XText, afin d'obtenir la génération des interfaces pour langium, mais après génération dans langium certaines interfaces (générées par langium à partir de la grammaire) posaient problème, et nous avons donc supprimé les interfaces générées par XText.

Un exemple d'interface ayant posé problème est celle du concept de 'bloc'. Le 'bloc' étant une instruction, elle est assignable à n'importe quel noeud ayant une propriété de type instruction, mais puisque le concept de déclaration de fonction est le seul à explicitement nécessiter un 'block', la propriété `$container` de l'interface générée par langium pour le concept de 'bloc' acceptait uniquement des déclaration de fonction.

## Analyse Sémantique

Nous avons implémenté plusieurs régles de validation sémantique :
 - Validation de la portée d'utilisation des variables/fonctions
 - Validation de des donnée retournées par les fonctions (ou de leur abscence pour 'void')
 - Validation de la présence d'une fonction 'main' et de sa signature
 - Validation du nombre de paramètre à l'appel de fonction
 - Validation de l'utilisation d'appel de fonction dans les expressions (interdit dans le cas de 'void')
 - Validation de la déclaration de variable uniquement au sein de bloc

De plus nous profitions de la validation d ela protée pour précalculer les valeurs constantes, afin de premettre de potentielles optimisations (une seule passe est faite).
Nous profitons de la validation des instructions de retour pour indiquer les fragments de code détectés comme étants morts.
Et nous apportons aux noeud d'appel de fonction un indicateur permetant de distinguer les utilisations comme instruction ou comme expression, pour simplifier la compilation et l'interprétation.

## Weaver

Nous avons utilisé le mapping de type de TypeScript pour convertir n'importe quel type/interface générée par langium pour l'ast en type permettant l'utilisation du weaver.

## Compilation

Le code compilé été en partie testé et validé avec Arduino IDE, seul le contrôle du capteur de distance n'a pas été implémenté, la raison étant que nous n'avons pas compris comment l'utiliser.

## Interpétation

L'interprétaion a été en partie testée avec le simulateur fournit (ce dernier à subit quelques modification pour faciliter notre compréhension du fonctionnement). Seul la simulation du capteur de distance et la gestion des collisions n'ont pas étés implémentés, la raison étant que nous préférions avancer à un stade correcte à la fois l'interpréteur et le compilateur plutôt que de passer plus de temps à essayer de les implémenter (la simulation du capteur de distance et la gestion des collisions).

## Application Web sur Azure

Accessible à [ce lien](https://robotscriptlang.azurewebsites.net), le projet met à disposition un exemple de programme.

Il y a 4 boutons :
 - Le premier sert à valider le code (le résultat est dans la console)
 - Le deuxième sert à générer tester l'interprétation et exécuter la simulation
 - Le troisième sert à recommencer la simulation
 - Le dernier sert à tester la compilation et télécharger un fichier source arduino

Le projet se génère correctement sur nos pc sous windows, mais en essayant de deployer sur azure avec un github workflow, nous avons rencontré un problème lorsque le runner, sous linux (ubuntu), lançait le processus de build. Le problème en question concernait la résolution de modules à la transpilation de TypeScript en JavaScript pour le language server. En essayent plusieurs version d'ubuntu et de node, nous avons rencontré le même problème, nous avaons donc d'autant plus souhaité rendre disponible le projet, c'est pourquoi nous avons simplement build localement et créé un conteneur local contenant l'application statique.

## Mémo

### Modèle Ecore
Setup :
- IDE [Eclipse IDE for Java and DSL Developers](https://www.eclipse.org/downloads/packages/release/juno/sr2/eclipse-ide-java-and-dsl-developers)
- Installer [EcoreTools](https://marketplace.eclipse.org/content/ecoretools-ecore-diagram-editor) depuis le marketplace (Help > Eclipse Marketplace)
- Projet de type : Eclipse Modeling Framework > Ecore Modeling Project

Tips :
 - Pour retrouver la vue en mode diagramme, ouvrir le fichier `model/<xxx>.ecore/<xxx>/<xxx>`\* (ça devrait être le premier fichier)
 - Pour générer le code nécessaire pour la suite, ouvrir le fichier `model/<xxx>.genmodel`\*, puis dans la vue éditeur : clique-droit > Generate All (Generate Model suffit peut-être)

\* *`<xxx>` est le nom du projet*

Avant de continuer avec Xtext :
- Clique-droit sur le projet > Configure > Configure Xtext

### Grammaire Xtext
Setup :
- Générer les fichier à partir du modèle Ecore
- Projet de type : Xtext > Xtext Project From Existing Ecore Model
  -  Dans le menu de sélection de EPackage : Add > sélectionner le générateur
  -  **Dans le même menu** sélectionner la règle servant de **point d'entrée** dans le champ 'Entry rule'

[Pour le passage à Langium](https://github.com/TypeFox/xtext2langium) :
- Help > Install New Software > saisir `https://typefox.github.io/xtext2langium/download/updates/v0.4.0/`
- Sélectionner Xtext2Langium Generator Fragment et l'installer (accepter toutes les licences et faire confiance à chaque fois qu'on nous le demande)
- Ouvrir `META-INF/MANIFEST.MF` > Dependencies > Add > ajouter `io.typefox.xtext2langium`
- Dans `<xxx>/Generate<xxx>.mwe2`\* ajouter le paramètre suivant à la configuration du langage :
```js
fragment = io.typefox.xtext2langium.Xtext2LangiumFragment {
    outputPath = './langium'
}
```
- Exécuter le fichier précédement modifié (clique-droit > Run As > MWE2 Workflow)

\* *`<xxx>` est le nom du projet*

### Langium
[Setup](https://langium.org/docs/getting-started/) :
- Installer les dépendences
```sh
npm i -g yo generator-langium
```
- Générer un projet (pour le nom du langage, utiliser le même qu'avec Xtext)
```sh
yo langium
```
- Copier le contenu du dossier `langium` généré précédement (dans le projet Xtext) dans le dossier `<xxx>/src/language`\*

\* *`<xxx>` est le nom de l'extension*

Tips :
- Pour bien prendre en compte les changements de la grammaire, exécuter les deux commandes suivantes
```sh
npm run langium:generate
npm run build
```
