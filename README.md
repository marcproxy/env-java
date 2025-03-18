# Projet JavaFX avec Maven

Ce projet est une application JavaFX configurée avec Maven qui offre un environnement de développement complet et structuré.

![JavaFX App](https://via.placeholder.com/600x300?text=Application+JavaFX)

## ✨ Fonctionnalités

- 📱 Interface utilisateur JavaFX avec architecture MVC
- 🧪 Tests unitaires avec JUnit 5
- 📊 Analyse de couverture de code avec JaCoCo
- 🧹 Linting du code avec Checkstyle (Google Java Style)
- 🔐 Gestion sécurisée des variables d'environnement
- 📦 Build automatisé avec Maven

## 🚀 Démarrage rapide

### Prérequis

- Java JDK 17 ou supérieur
- Maven 3.6 ou supérieur

### Installation

1. Clonez le dépôt :
   ```bash
   git clone https://github.com/votre-username/env-java-maven.git
   cd env-java-maven
   ```

2. Configurez votre fichier d'environnement :
   ```bash
   cp .env.example .env
   # Modifiez .env avec vos propres valeurs
   ```

3. Exécutez l'application :
   ```bash
   mvn javafx:run
   ```

## 📋 Commandes disponibles

| Commande | Description |
|----------|-------------|
| `mvn compile` | Compile le code source du projet |
| `mvn test` | Exécute les tests unitaires et génère un rapport de couverture |
| `mvn javafx:run` | Lance l'application JavaFX |
| `mvn checkstyle:check` | Vérifie que le code respecte les conventions de style |
| `mvn checkstyle:checkstyle` | Génère un rapport détaillé de style |
| `mvn clean` | Nettoie le projet en supprimant les fichiers générés |

## 📁 Structure du projet

```
env-java-maven/
├── src/
│   ├── main/
│   │   ├── java/           # Code source Java
│   │   │   └── com/example/app/
│   │   └── resources/      # Ressources FXML, CSS, etc.
│   │       └── com/example/app/
│   └── test/
│       └── java/           # Tests unitaires
│           └── com/example/app/
├── .env.example            # Modèle pour les variables d'environnement
├── .gitignore              # Fichiers ignorés par Git
├── checkstyle.xml          # Configuration du linter
├── pom.xml                 # Configuration Maven
└── README.md               # Documentation
```

## 🔧 Configuration des tests

Les tests unitaires sont localisés dans le dossier `src/test/java/com/example/app/`. Pour exécuter uniquement un test spécifique :

```bash
mvn test -Dtest=AppTest
```

Le rapport de couverture de tests est disponible après exécution dans `target/site/jacoco/index.html`.

## 🎨 Conventions de code

Ce projet suit les conventions de code Google Java Style. Pour vérifier la conformité :

```bash
mvn checkstyle:check
```

## 🔒 Variables d'environnement

Les variables d'environnement sont gérées via un fichier `.env` qui n'est pas commité dans Git pour des raisons de sécurité. Un fichier exemple `.env.example` est fourni avec la structure attendue.

## 📝 Convention de Commits

Ce projet suit une convention de commits inspirée de Conventional Commits :

- `feat:` Nouvelle fonctionnalité
- `fix:` Correction de bug
- `docs:` Modification de la documentation
- `style:` Modification du style de code
- `refactor:` Refactorisation du code
- `test:` Ajout ou modification de tests
- `chore:` Tâches diverses

## 🤝 Contribuer

Les contributions sont les bienvenues ! N'hésitez pas à soumettre des pull requests.

## 📄 Licence

Ce projet est sous licence MIT. Voir le fichier `LICENSE` pour plus d'informations.