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
