# Spring Boot based project
Converting [C868-Capstone](https://github.com/mriffey1/C868-Capstone) to Spring Boot and deploying on the cloud. The original
application was created using JavaFX and JDBC and was created for a factitious veterinary office using physical paper records.
It allows users to create customers (owners), animals and associated note records, appointments that could not be overlapped to prevent over-scheduling,
and reports. The original application was basic and the goal is to provide additional features and scability. 

## Tasks/Goals for Project
- [ ] Different staff account permissions with different accessibility within the application. This includes having an admin who is capable of creating/deleting/restricting access. 
- [ ] Create more intensive reporting with the ability to export and import data via excel. This includes having the ability to pull information based on animal information such as animal breeds.
- [ ] Allow staff to upload photos of pets
- [ ] Double-clicking on fields allows staff to edit information dynamically with appropriate alerts to confirm
- [ ] The ability to add medication and vaccine records to animals
- [ ] Create a cloud-based relational database that is normalized and identify any technology that may provide greater speed. 
- [ ] Show other staff members on the same screen and alert if changes have been made to refresh (or lock screen if another user is already editing)
- [ ] Use APIs to drive certain data such countries/states, animal breeds, medication (from FDA)
- [ ] Create visit summary with notes, medication, animal, vet and owner information

## Technology Utilized:
* IntelliJ IDEA Ultimate
* Spring Boot
* Hibernate
* JPA
* CSS
* HTML
* Thymeleaf
* JS
* JDK 17
* MySQL Workbench


