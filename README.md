# Leaf Library

A modern desktop Library Management System built with JavaFX, FXML, AtlantaFX, and Ikonli. The project aims to provide an intuitive interface for managing book collections, importing EPUB files, tracking reading progress, and organizing library records.

## About the Project

Leaf Library is a desktop application project focused on combining modern UI design with practical library management functionality.

The interface takes inspiration from AtlantaFX's Primer theme, emphasizing a clean dark appearance, consistent spacing, subtle borders, refined controls, and intuitive navigation.

The application is being developed using JavaFX and FXML, with Scene Builder for visual interface design. AtlantaFX provides the application's theme and styling, while Ikonli supplies icons for navigation, actions, and other UI elements.

The project also serves as an opportunity to practice object-oriented programming, CRUD operations, file handling, database integration, and software architecture in Java.

## Objectives

- Build a modern, user-friendly Java desktop application.
- Implement complete book management and CRUD functionality.
- Support importing EPUB files from the local filesystem.
- Explore EPUB metadata extraction and reading functionality.
- Organize books into collections and reading lists.
- Manage borrowers and lending records.
- Apply object-oriented programming principles and maintainable architecture.
- Separate UI layouts, controllers, business logic, and data access.
- Use JavaFX, FXML, and Scene Builder to create and maintain the interface.

## Planned Features

### Dashboard
- Overview of the library's book collection.
- Recently added and recently opened books.
- Summary cards for book counts, EPUB files, and lending activity.
- Quick access to common actions.

### Book Management
- Add, view, edit, and delete book records.
- Search by title, author, or ISBN.
- Filter by genre, file format, and reading status.
- Sort and browse books in table or grid layouts.
- View book covers, descriptions, and metadata.

### EPUB Import
- Select EPUB files from the local filesystem.
- Support multiple-file selection and drag-and-drop where practical.
- Extract available metadata, including title, author, language, and publisher.
- Review and edit metadata before importing.
- Display validation errors and import results.

### EPUB Reading
- Open and read imported EPUB books.
- Navigate chapters and the table of contents.
- Adjust font size and reading theme.
- Track reading progress where supported.

### Collections and Reading Lists
- Create and manage custom collections.
- Organize books by genre, subject, or personal preference.
- Track unread, currently reading, and completed books.

### Borrowers and Lending
- Manage borrower records.
- Record book loans, due dates, and returns.
- Track availability and lending status.
- Distinguish physical book lending from digital reading.

### Settings
- Configure interface preferences and catalog display options.
- Manage basic library information.
- Provide a consistent place for future application settings.

## Technology Stack

| Technology | Purpose |
|---|---|
| Java | Application logic and object-oriented design |
| JavaFX | Desktop user interface framework |
| FXML | Declarative UI layouts |
| Scene Builder | Visual interface design and layout editing |
| AtlantaFX | Application theme and JavaFX styling |
| Ikonli | Icons for navigation, buttons, and interface elements |
| Maven | Dependency management and project builds |
| JDBC / SQLite *(planned)* | Local database and persistent storage |
| EPUB library *(planned)* | EPUB metadata extraction and reading support |

## Design Philosophy

Leaf Library aims to provide a polished desktop experience inspired by modern productivity applications.

- **Clarity:** Make information and common actions easy to find.
- **Consistency:** Maintain reusable layouts, controls, spacing, and design tokens.
- **Usability:** Keep book management and file-import workflows straightforward.
- **Visual hierarchy:** Use layered surfaces, restrained accent colors, and readable typography.
- **Maintainability:** Keep presentation, application logic, and data access separate.
- **Native practicality:** Prefer layouts and controls that integrate naturally with JavaFX and AtlantaFX.

## Development Roadmap

- [ ] Establish the application shell and AtlantaFX theme.
- [ ] Integrate Ikonli icons.
- [ ] Build the main navigation and dashboard using FXML.
- [ ] Implement the searchable and filterable book catalog.
- [ ] Add book CRUD operations and detail views.
- [ ] Implement local EPUB file selection and metadata extraction.
- [ ] Develop the EPUB reading interface.
- [ ] Add collections and reading lists.
- [ ] Implement borrower and lending management.
- [ ] Integrate SQLite through JDBC.
- [ ] Add validation, error handling, and automated tests.
- [ ] Refine usability, styling, and application-wide consistency.

## Project Vision

Leaf Library aims to combine a modern, thoughtfully designed JavaFX interface with practical library management features.

The goal is to develop a maintainable desktop application that demonstrates clean object-oriented design, effective use of JavaFX and FXML, reliable CRUD workflows, local file handling, and persistent data storage.

**A modern Java desktop application for organizing, managing, and reading books.**
