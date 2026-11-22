# TechTrack — Android IT Equipment Tracker

## Project Overview

TechTrack is an Android application project designed to help individuals and small businesses keep track of their IT equipment. The goal is to provide a simple way to organize information about computers, servers, routers, switches, and other technology devices.

## Business Problem

Managing several technology devices can become difficult when information is stored in different places. IP addresses, equipment models, device locations, and other details may be spread across spreadsheets or handwritten notes. TechTrack aims to make this information easier to organize and access.

## Planned Features

- Add new devices to an inventory
- View a list of saved equipment
- Record device names, types, manufacturers, models, and IP addresses
- Record device locations and status
- Edit existing equipment information
- Remove devices that are no longer needed
- Save inventory information locally

These features represent the planned functionality and have not yet been fully implemented.

## Development Tools

- Android Studio and Android SDK
- MIT App Inventor for introductory exercises
- GitHub for version control and documentation
- Android emulator or compatible device for testing
- Potential future cloud integration using Firebase

## Development Progress

### Previous Work — Versions 0.1 through 0.3

- Established the TechTrack application concept and identified the target users.
- Created the GitHub repository, README, and Wiki documentation.
- Completed introductory Android development exercises.
- Installed and configured Android Studio.
- Updated the project outline and version changelog.

### Current Version — v0.4: Initial Application Development

TechTrack has moved beyond the planning stage into application development. I created the Android Studio project using Kotlin and Jetpack Compose and successfully tested it using an Android emulator.

The initial application includes a home screen, an equipment entry form, and a basic inventory display. Users can enter device information and add multiple devices to a list.

**Completed Features:**

- Created the TechTrack Android application.
- Developed the home screen and inventory section.
- Added an interactive Add Device button.
- Created input fields for device name, type, manufacturer, model, and IP address.
- Implemented a Save Device function.
- Added basic validation requiring a device name.
- Implemented temporary in-memory inventory storage.
- Displayed saved devices on the home screen.
- Successfully tested the application using Android Emulator API 37.
- Committed and pushed the application source code to GitHub.

**Current Limitations:**

Device information is currently stored in memory, meaning records may be lost when the application process closes. Permanent storage, editing, deleting, and additional input validation have not yet been implemented.

### Planned Updates — v0.5 through v1.0

- Implement persistent local storage for inventory records.
- Add editing and deleting functionality.
- Improve input validation and error handling.
- Refine the user interface.
- Continue testing and troubleshooting.
- Prepare the application and documentation for final submission.
  
## Development Timeline

- **Weeks 1–2:** Research, planning, repository setup, and documentation.
- **Week 3:** Development preparation and introductory Android activities.
- **Weeks 4–5:** Begin implementing application screens and inventory features.
- **Weeks 6–7:** Continue development, testing, troubleshooting, and GitHub updates.
- **Week 8:** Finalize and submit the completed project.

## Testing Plan

Testing will focus on verifying that users can enter device information, save records, view inventory details, and modify existing information. Input validation will also be tested to identify missing or incorrect information.

## Future Improvements

Potential future features include cloud synchronization, equipment search, and automated device status tracking. These features are outside the scope of the initial application.

## Project Documentation

Additional information, including the full project outline and version changelog, is available in the [TechTrack GitHub Wiki](https://github.com/edtech300/TechTrack-Android/wiki/TechTrack-Project-Outline).

## Current Status

**Version 0.4 — Initial Android Application Developed**

TechTrack currently includes a functioning home screen, device entry form, and temporary equipment inventory. The application has been tested in an Android emulator, and its source code is available in this GitHub repository.

The next development phase will focus on permanent local storage and expanded inventory management functionality.
