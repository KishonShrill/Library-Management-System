# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Commands

- **Build / Compile:** `./mvnw compile`
- **Run Tests:** `./mvnw test`
- **Compile Tests:** `./mvnw test-compile`
- **Run Application:** `./mvnw javafx:run`

## Architecture & Overview

- **Project Type:** Modern desktop Library Management System built with Java 21, JavaFX 21, FXML, AtlantaFX (PrimerDark theme), and Ikonli icons.
- **Entry Point & Launcher:** 
  - `org.betteriligancity.lms.Launcher` (`src/main/java/org/betteriligancity/lms/Launcher.java`) launches the application.
  - `org.betteriligancity.lms.HelloApplication` (`src/main/java/org/betteriligancity/lms/HelloApplication.java`) extends `javafx.application.Application`, sets up the AtlantaFX `PrimerDark` user agent stylesheet, and loads the main FXML view (`view/hello-view.fxml`).
- **UI Structure:**
  - FXML layout: `src/main/resources/org/betteriligancity/lms/view/hello-view.fxml` uses a split layout containing a styled sidebar (`.sidepanel`, `.sidepanel-btn`) and navigation elements.
  - Stylesheet: `src/main/resources/org/betteriligancity/lms/css/main.css` defines dark theme custom styling and hover effects.
  - Controller: `org.betteriligancity.lms.controller.HelloController` handles initial view interactions.
- **Module System:** Defined in `src/main/java/module-info.java`, requiring `javafx.controls`, `javafx.fxml`, `org.kordamp.ikonli.javafx`, and `atlantafx.base`.
