# Hospital Case Study - Advanced

Comprehensive hospital management system with departments, prescriptions, and advanced relationships.

## Entities

- **Patient**: Patient with medical records
- **MedicalRecord**: Medical history and records
- **Doctor**: Doctor with department and specialization
- **Department**: Hospital departments
- **Appointment**: Patient-doctor appointments
- **Prescription**: Medications prescribed in appointments

## Relationships

- Patient ↔ MedicalRecord (One-to-One)
- Doctor → Department (Many-to-One)
- Appointment → Patient, Doctor (Many-to-One)
- Appointment → Prescriptions (One-to-Many)

## Features

- Complete DAO pattern for all entities
- Service layer with business logic
- HibernateUtil for session management
- DataSeeder for sample data
- 5 comprehensive test tasks

## Database

```sql
CREATE DATABASE hospital;
```

## Run

Import in Eclipse and run test classes (Task1Test - Task5Test)
