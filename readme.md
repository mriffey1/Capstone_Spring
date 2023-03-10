# Spring Boot based project
Converting [C868-Capstone](https://github.com/mriffey1/C868-Capstone) to Spring Boot and deploying to the cloud. The original
application was created using JavaFX and JDBC and was created for a factitious veterinary office using physical paper records.
It allows users to create customers (owners), animals and associated note records, appointments that could not be overlapped to prevent over-scheduling,
and reports. The original application was basic and the goal is to provide additional features and scalability. 

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

## Tasks/Goals for Project
- [ ] Different staff account permissions with different accessibility within the application. This includes having an admin who is capable of creating/deleting/restricting access. 
- [ ] Create more intensive reporting with the ability to export and import data via excel. This includes having the ability to pull information based on animal information such as animal breeds.
- [ ] Allow staff to upload photos of pets
- [ ] Double-clicking on fields allows staff to edit information dynamically with appropriate alerts to confirm
- [ ] The ability to add medication and vaccine records to animals
- [ ] Create a cloud-based relational database that is normalized and identify any technology that may provide greater speed. 
- [ ] Show other staff members on the same screen and alert if changes have been made to refresh (or lock screen if another user is already editing)
- [ ] Use APIs to drive certain data such countries/states, animal breeds, medication (from FDA)
- [ ] Create physical summary (pdf) with notes, medication, animal, vet and owner information
- [ ] Have the ability to email the PDF visit summary by checking a box automatically
- [ ] Appointment reminder alerts via email or text to customers

### Items possible in the future but not currently planned
* The ability for the customer (owner) to login and view past animal history, medications and request appointments

#### Lessons Learned
1. Annotations
2. Database
   - Learned how to specify database column name and keep variable name separate for security using the @Column annotation
   - How to display the database data in a Thymeleaf template

#### Updates
Feb. 21, 2023: Began creating the list of appointments. Still working on JPA and Hibernate for join queries. In addition, will be keeping the CSS grid and making it responsive. 
</br></br>
Feb. 14, 2023: Added the Animals list and updated the navigation. In addition, modified the CSS to make current content more readable. Determined that replacing the CSS Grid will a table will work better.
Still working on figuring out joining tables with JPA and Hibernate. 




